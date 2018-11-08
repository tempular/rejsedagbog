package thomas.rejsedagbog.Storage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper{
    private static DatabaseHelper ourInstance;
    private static int DB_VERSION = 1;
    private static String DB_NAME = "rejseDagbog";
    private static Context applicationContext;
    public static void setApplicationContext(Context context){
        applicationContext = context.getApplicationContext();
    }


    private DatabaseHelper(Context context){
        super(context,DB_NAME,null,DB_VERSION);
    }



    public static DatabaseHelper getInsance(){
        if(ourInstance == null){
            ourInstance = new DatabaseHelper(applicationContext);
        }
        return ourInstance;
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        updateMyDatabase(db, 0, DB_VERSION);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        updateMyDatabase(db, oldVersion, newVersion);
    }


    private void updateMyDatabase(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion < 1) {
            db.execSQL("DROP TABLE minRejseDagbog");


            db.execSQL("CREATE TABLE minRejseDagbog (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + "NAVN TEXT, "
                    + "DATO TEXT, "
                    + "BESKRIVLE TEXT);");

        }
        if (oldVersion < 2) {
            //??
            //db.execSQL("ALTER TABLE PERSON");
        }
    }}

