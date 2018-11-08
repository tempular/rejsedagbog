package thomas.rejsedagbog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Dagbog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tilfoej_til_min_dagbog);
    }
    public void tilføjButton (View view){
        Intent intent = new Intent(this, MinRejseDagbogGUI.class );
        EditText txt1 = (EditText)findViewById(R.id.navn);
        EditText txt2 = (EditText)findViewById(R.id.dato);
        EditText txt3 = (EditText)findViewById(R.id.beskrivelse);

    }

}
