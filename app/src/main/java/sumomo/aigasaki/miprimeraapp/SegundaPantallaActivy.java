package sumomo.aigasaki.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class SegundaPantallaActivy extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Ciclo-SP", "onCreate");
        setContentView(R.layout.activity_segunda_pantalla_activy);

        TextView SPtitulo=findViewById(R.id.TxtSPTitulo);

        //Extraemos a traves de la variable de valorRecibido , lo que viene del intet, los extras"cosas que envia" y luego decir que lo que envia es un String
        String valorRecibido=getIntent().getExtras().getString("parametro1");

        SPtitulo.setText(valorRecibido);

        Button Abrir=findViewById(R.id.btnAbrir);

        Abrir.setOnClickListener((view->{
            Intent abrir= new Intent(this,Tercer_Pantalla.class);
            startActivity(abrir);
        }));
    }

    @Override
    protected void onStart () {
        super.onStart();
        Log.i("Ciclo-SP", "onStart");
    }

    @Override
    protected void onResume () {
        super.onResume();
        Log.i("Ciclo-SP", "onResume");
    }
    @Override
    protected void onPause () {
        super.onPause();
        Log.i("Ciclo-SP", "onPause");
    }
    @Override
    protected void onStop () {
        super.onStop();
        Log.i("Ciclo-SP", "onStop");
    }
    @Override
    protected void onDestroy () {
        super.onDestroy();
        Log.i("Ciclo-SP", "onDestroy");
    }
// Prueba Git Para guardar comentarios 

//Prueba 2do Guardado


//Prueba 3er Comentario

    //PRueba git hub

}
