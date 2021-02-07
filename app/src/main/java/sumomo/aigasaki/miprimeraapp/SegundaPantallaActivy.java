package sumomo.aigasaki.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SegundaPantallaActivy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Ciclo-SP", "onCreate");
        setContentView(R.layout.activity_segunda_pantalla_activy);
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


}