package thomas.rejsedagbog.Storage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import thomas.rejsedagbog.Wrapper.minRejseDagbogWrapper;
import thomas.rejsedagbog.minRejseDagbog;

public class Storage {
    private Storage(){};

    private static  Storage storage;

    public static  Storage getInstance(){
        if(storage == null){
            storage = new Storage();
        }
        return storage;
    }

    private DatabaseHelper databaseHelper = DatabaseHelper.getInsance();

    public minRejseDagbog getRejse(long id){
        SQLiteDatabase db = databaseHelper.getReadableDatabase();
        Cursor cursor = db.query("minRejseDagbog",new String[]{"_ID","NAVN","DATO","BESKRIVELSE"},
                "_id = ?",
                new String[]{"" + id},null,null,null);

        minRejseDagbog minRejseDagbog = new minRejseDagbogWrapper(cursor).getmineRejserDagbog();
        cursor.close();
        return minRejseDagbog;
    }

    public minRejseDagbogWrapper getAllRejse() {
        SQLiteDatabase db = databaseHelper.getReadableDatabase();
        Cursor cursor = db.query("minRejseDagbog",
                new String[]{"_id", "NAVN", "DATO", "BESKRIVELSE"},
                null, null, null, null, null);
        return new minRejseDagbogWrapper(cursor);
    }

    public long addRejse(minRejseDagbog minRejseDagbog){
        SQLiteDatabase db = databaseHelper.getWritableDatabase();
        ContentValues rejseDagbogValues = new ContentValues();
        rejseDagbogValues.put("NAVN", minRejseDagbog.getNavn());
        rejseDagbogValues.put("DATO", minRejseDagbog.getDato());
        rejseDagbogValues.put("BESKRIVELSE", minRejseDagbog.getBeskrivelse());
        long id = db.insert("minRejseDagbog",null,rejseDagbogValues);
        minRejseDagbog.setId(id);
        return id;
    }

}

