package com.example.david.fragmentdinamico;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, FragmentDinamic.OnFragmentInteractionListener {

    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = (Button) findViewById(R.id.botonFragDin);
        boton.setOnClickListener(this);
    }

    public void onClick(View v) {

        if(v == boton) {

            //Paso 1: Obtener la instancia del administrador de fragmentos
            FragmentManager fragmentManager = getFragmentManager();

            //Paso 2: Crear una nueva transaccion
            FragmentTransaction transaction = fragmentManager.beginTransaction();

            //Paso 3: Crear un nuevo fragmento y añadirlo
            FragmentDinamic fragment = new FragmentDinamic();
            transaction.add(R.id.principal, fragment);

            //Paso 4: Confirmar el cambio
            transaction.commit();
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
