package com.example.joseandres.imagenanimada;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {


    //Definimos las variables que se van a utilizar para asignar efectos.
    ImageView megara;//megara.jpg
    TextView anima;//TextView
    Button girar;//btn1
    Button transladar;//btn2
    Button ampliar;//btn3
    Button trans;//btn4

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        megara = (ImageView) findViewById(R.id.megara_jpg);
        anima = (TextView) findViewById(R.id.textView);
        girar = (Button) findViewById(R.id.btn1);
        transladar = (Button) findViewById(R.id.btn2);
        ampliar = (Button) findViewById(R.id.btn3);
        trans = (Button) findViewById(R.id.btn4);
        //Para el caso de los botones debemos activar el OnClickListener
        // para que de este modo los botones que están a la escucha en cuanto
        // se le haga click encima ejecuten la acción pertinente.
        //Para esto debemos añadir implements View.OnClickListener a la clase principal.
        girar.setOnClickListener(this);
        transladar.setOnClickListener(this);
        ampliar.setOnClickListener(this);
        trans.setOnClickListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
        //Para el caso de los botones debemos activar el OnClickListener
        // para que de este modo los botones que están a la escucha en cuanto
        // se le haga click encima ejecuten la acción pertinente.
        //Para esto debemos añadir implements View.OnClickListener a la clase principal.
    }
    @Override
    public void onClick(View view) {

        switch (view.getId()) {
//En esta parte los archivos XML que ya creamos, tenemos que guardarlos en la
// carpeta R.anim que se crea desde res/new/directory.
            case R.id.btn1:
                Animation giro = AnimationUtils.loadAnimation(this, R.anim.girar);
                giro.reset();
                megara.startAnimation(giro);

                break;
//En esta parte los archivos XML que ya creamos, tenemos que guardarlos en la
// carpeta R.anim que se crea desde res/new/directory.
            case R.id.btn2:
                Animation movimiento;
                movimiento = AnimationUtils.loadAnimation(this, R.anim.mover);
                movimiento.reset();
                megara.startAnimation(movimiento);

                break;
//En esta parte los archivos XML que ya creamos, tenemos que guardarlos en la
// carpeta R.anim que se crea desde res/new/directory.
            case R.id.btn3:
                Animation aumentar;
                aumentar = AnimationUtils.loadAnimation(this, R.anim.ampliar);
                aumentar.reset();
                megara.startAnimation(aumentar);

                break;
//En esta parte los archivos XML que ya creamos, tenemos que guardarlos en la
// carpeta R.anim que se crea desde res/new/directory.
            case R.id.btn4:
                Animation transparencia;
                transparencia = AnimationUtils.loadAnimation(this, R.anim.transparentar);
                transparencia.reset();
                megara.startAnimation(transparencia);

                break;

            default:

                break;

        }
    }
}


