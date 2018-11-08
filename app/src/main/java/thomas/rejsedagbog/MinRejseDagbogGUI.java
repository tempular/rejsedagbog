package thomas.rejsedagbog;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import thomas.rejsedagbog.Storage.Storage;

public class MinRejseDagbogGUI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tilfoej_til_min_dagbog);
        Button tilføjbtn = findViewById(R.id.tilføjbtn);
        tilføjbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                TextView txtNavn = findViewById(R.id.navn);
                TextView txtDato = findViewById(R.id.dato);
                TextView txtBeskrivelse = findViewById(R.id.beskrivelse);
                minRejseDagbog rejseDagbog =  new minRejseDagbog(txtNavn.toString(),txtDato.toString(),txtBeskrivelse.toString());
                Storage.getInstance().addRejse(rejseDagbog);

                startActivity(intent);

            }
        });
        }

}
