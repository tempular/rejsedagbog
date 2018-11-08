package thomas.rejsedagbog.Adapters;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.view.View;
import android.widget.Button;
import android.widget.SimpleCursorAdapter;

import thomas.rejsedagbog.Dagbog;
import thomas.rejsedagbog.R;

public class MinRejseAdapter extends SimpleCursorAdapter {

    public MinRejseAdapter(Context context, int layout, Cursor c, String[] from, int[] to, int flags) {
        super(context, layout, c, from, to, flags);
    }}
   /* @Override
    public void bindView (View view, final Context context, Cursor cursor){
        super.bindView(view, context, cursor);
        view.setOnClickListener((v)->{
            Intent intent = new Intent(context, Dagbog.class);
           // intent.putExtra()
           intent.start
        });
        Button tilføj = (Button)view.findViewById(R.id.btn_tilføj);
    }
}
*/