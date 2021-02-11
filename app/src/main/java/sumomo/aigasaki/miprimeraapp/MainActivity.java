
package sumomo.aigasaki.miprimeraapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private TextView titulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Ciclo", "onCreate");
        Log.i("-Ciclo",String.valueOf(savedInstanceState));
        //declaramos una variable titulo que hara cambios en el objeto que tiene por ID txt titulo
        titulo = findViewById(R.id.txtTitulo);
        Button boton = findViewById(R.id.btnClick);
        EditText CajaTexto = findViewById(R.id.txtinputNombre);


        //Establecemos/Seteamos SET TEXT

        if (savedInstanceState!=null){
            titulo.setText(savedInstanceState.getString("titulo"));
        }

        //creamos una clase que al darle click este automaticamente cambie el texto a BOTON
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //le decimos que a la variable titulo Establesca el Texto del Objeto Actualizar Tome el Texto y lo haga un String
                //la sentencia if es para validar que no acepte campo vacios
                if (!CajaTexto.getText().toString().isEmpty()){
                    titulo.setText(CajaTexto.getText().toString());
                    CajaTexto.setText("");
                }

                else
                    mostrarMensaje(v);
            }

        });

        Button irPantalla=findViewById(R.id.btngo);
        irPantalla.setOnClickListener((view)->{
            //lanzar actividad
            Intent abrir= new Intent(this, SegundaPantallaActivy.class);

             String valor=CajaTexto.getText().toString();
        // ala intencion le estoy mandando el caracter a travez de un parametro con los textos del valor
             abrir.putExtra("parametro1", valor);

            abrir.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            abrir.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            abrir.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

            startActivity(abrir);
        });

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("Ciclo","onSaveInstanceState");
        outState.putString("titulo",titulo.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i("Ciclo","onRestoreInstanceState");
        titulo.setText(savedInstanceState.getString("titulo"));
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("Ciclo", "onStart");
    }

    @Override
    protected void onResume () {
        super.onResume();
        Log.i("Ciclo", "onResume");
    }
    @Override
    protected void onPause () {
        super.onPause();
        Log.i("Ciclo", "onPause");
    }
    @Override
    protected void onStop () {
        super.onStop();
        Log.i("Ciclo", "onStop");
    }
    @Override
    protected void onDestroy () {
        super.onDestroy();
        Log.i("Ciclo", "onDestroy");
    }

    private void mostrarMensaje (View v) {
            //el Toast lleva tres instancias la primera es el contexto que es donde ira ubicado el msj

        //Toast es para mostrar alertas
          //  Toast.makeText(MainActivity.this, "Ingrese un Valor (T)", Toast.LENGTH_LONG).show();

        //SnackBar Alerta
        //Snackbar.make(v,"No Puede Quedar en Blanco Sb",Snackbar.LENGTH_SHORT).show();

        //SnackBar Alerta Personalizada
        Snackbar.make(v,"No Puede Quedar en Blanco Sb",Snackbar.LENGTH_SHORT)
                .setAction("Listo", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this,
                                "Hizo Click Snackbar (T)", Toast.LENGTH_LONG)
                                .show();
                    }
                })
                .show();
        }
    }


