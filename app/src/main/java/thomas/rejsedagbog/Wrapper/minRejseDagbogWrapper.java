package thomas.rejsedagbog.Wrapper;


import android.database.Cursor;
import android.database.CursorWrapper;

import thomas.rejsedagbog.minRejseDagbog;

public class minRejseDagbogWrapper extends CursorWrapper {
    public minRejseDagbogWrapper(Cursor cursor) { super(cursor); }
    public minRejseDagbog getmineRejserDagbog(){
        long id = getLong (getColumnIndex( "_id"));
        String navnText = getString(getColumnIndex("NAVN"));
        String beskrivelseText = getString(getColumnIndex("BESKRIVELSE"));
        String datoText = getString(getColumnIndex("DATO"));
        //  int photoId = getInt(getColumnIndex("IMAGE_RESOURCE_ID"));
        return  new minRejseDagbog(id, navnText, beskrivelseText,datoText);

    }
}
