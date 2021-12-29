package com.example.orientacion;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Color;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.orientacion.bd.Datos;
import com.example.orientacion.bd.IngresarDatos;
import com.example.orientacion.bd.Model.areas;
import com.example.orientacion.bd.Model.preguntas;
import com.example.orientacion.bd.Model.respuestas;
import com.example.orientacion.bd.Model.resultados;

import java.util.ArrayList;
import java.util.Random;

public class Gustos extends AppCompatActivity {
    Datos datos=new Datos();
    IngresarDatos ingreso= new IngresarDatos();
    ArrayList<areas> area=new ArrayList<>(datos.returnAreas());
    ArrayList<preguntas> pregunta=new ArrayList<>();
    ArrayList<respuestas> respuesta=new ArrayList<>();
    ArrayList<resultados> resultado=new ArrayList<>();
    private ProgressDialog progressDialog;
    int [] imagenes={R.drawable.administracion,R.drawable.administracion2,R.drawable.cocina,R.drawable.cocina2,R.drawable.computacion,R.drawable.computacion2,
            R.drawable.construccion,R.drawable.construccion2,R.drawable.contador,R.drawable.contador2,R.drawable.digital,R.drawable.digital2,R.drawable.disenio,R.drawable.disenio2,
            R.drawable.electricidad,R.drawable.electricidad2,R.drawable.fisica,R.drawable.fisica2,R.drawable.juridica,R.drawable.juridica2,R.drawable.maestro,R.drawable.maestro2,
            R.drawable.mecanica,R.drawable.mecanica2,R.drawable.medicina,R.drawable.medicina2,R.drawable.musica,R.drawable.musica2,R.drawable.publicidad,R.drawable.publicidad2,
            R.drawable.secretaria,R.drawable.secretaria2,R.drawable.turismo,R.drawable.turismo2,R.drawable.computacion3,R.drawable.disenio3};
    String [] tags={"administracion","administracion","cocina","cocina","computacion","computacion",
    "construccion","construccion","contador","contador","digital","digital","diseño","diseño",
    "electricidad","electricidad","fisica","fisica","juridica","juridica","maestro","maestro",
    "mecanica","mecanica","medicina","medicina","musica","musica","publicidad","publicidad",
    "secretaria","secretaria","turismo","turismo","computacionn","diseñoo"};
    private int NumArea=2;
    private  int countImg=0;
    private int nunImg=0;
    Random random=new Random();  TextView txtArea,txtPregunta,respuesta5; ImageView respuesta1,respuesta2,respuesta3,respuesta4;
    LinearLayout primero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gustos);

        txtArea =(TextView)findViewById(R.id.txtArea);
        txtPregunta =(TextView)findViewById(R.id.txtPregunta);
        respuesta1=(ImageView)findViewById(R.id.respuesta1);
        respuesta2=(ImageView)findViewById(R.id.respuesta2);
        respuesta3=(ImageView)findViewById(R.id.respuesta3);
        respuesta4=(ImageView)findViewById(R.id.respuesta4);
        respuesta5 =(TextView)findViewById(R.id.respuesta5);
        primero=(LinearLayout)findViewById(R.id.primero);
        progressDialog = new ProgressDialog(this);

        siguinteArea();
        siguiente();
    }

    public void respuesta(View view) {
        switch (view.getId()){
            case R.id.respuesta1:
                respuesta1.setImageResource(R.drawable.trasparente);
                nunImg=nunImg+1;
                guadarResultado(1,respuesta1.getTag().toString());
                if (nunImg==2){
                    bloquearBoton(false);
                    nunImg=0;esperar(1000);}
                respuesta1.setEnabled(false);
                break;
            case R.id.respuesta2:
                respuesta2.setImageResource(R.drawable.trasparente);
                nunImg=nunImg+1;
                guadarResultado(1,respuesta2.getTag().toString());
                if (nunImg==2){
                    bloquearBoton(false);
                    nunImg=0;esperar(1000);}
                respuesta2.setEnabled(false);
                break;
            case R.id.respuesta3:
                respuesta3.setImageResource(R.drawable.trasparente);
                nunImg=nunImg+1;
                guadarResultado(1,respuesta3.getTag().toString());
                if (nunImg==2){
                    bloquearBoton(false);
                    nunImg=0;esperar(1000);}
                respuesta3.setEnabled(false);
                break;
            case R.id.respuesta4:
                respuesta4.setImageResource(R.drawable.trasparente);
                nunImg=nunImg+1;
                guadarResultado(1,respuesta4.getTag().toString());
                if (nunImg==2){
                    bloquearBoton(false);
                    nunImg=0;esperar(1000);}
                respuesta4.setEnabled(false);
                break;
                case R.id.respuesta5:
                    nunImg=0;
                    siguiente();
                break;
        }

    }

    public  void esperar(int milisegundo){
        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                siguiente();
            }
        },milisegundo);
    }
public void bloquearBoton(boolean bool){
    respuesta1.setEnabled(bool);
    respuesta2.setEnabled(bool);
    respuesta3.setEnabled(bool);
    respuesta4.setEnabled(bool);
}

    public void siguiente(){
bloquearBoton(true);
        if (countImg<imagenes.length){
            txtArea.setText(area.get(NumArea).getArea());
           txtPregunta.setText(pregunta.get(0).getPregunta());
            //respuesta.addAll(ingreso.consultaRespuesta(String.valueOf(pregunta.get(countPregunta).getIdPrenguta()),this));
          //  respuesta1.setImageResource(R.drawable.administracion);
            //int im=respuesta1.getResources().getD

           respuesta1.setImageResource(imagenes[countImg]);
           respuesta1.setTag(tags[countImg]);
            countImg=countImg+1;
            respuesta2.setImageResource(imagenes[countImg]);
            respuesta2.setTag(tags[countImg]);
            countImg=countImg+1;
            respuesta3.setImageResource(imagenes[countImg]);
            respuesta3.setTag(tags[countImg]);
            countImg=countImg+1;
            respuesta4.setImageResource(imagenes[countImg]);
            respuesta4.setTag(tags[countImg]);
            countImg=countImg+1;
            respuesta.clear();
            respuesta1.setColorFilter(Color.TRANSPARENT);
            respuesta2.setColorFilter(Color.TRANSPARENT);
            respuesta3.setColorFilter(Color.TRANSPARENT);
            respuesta4.setColorFilter(Color.TRANSPARENT);

        }else {

            startActivity(new Intent(getApplicationContext(),Matematica.class));
finish();
        }



    }
    public void siguinteArea(){
        if (NumArea<area.size()) {
            pregunta.addAll(ingreso.consultaPregunta(String.valueOf(area.get(NumArea).getIdArea()), this));
        }else{
            Toast.makeText(getApplicationContext(),"siguiente",Toast.LENGTH_LONG).show();
        }

    }

    public  void guadarResultado(int punto,String tag){
        IngresarDatos ingreso=new IngresarDatos();
        progressDialog.setMessage("Guardando Resulatdo ...");
        progressDialog.show();
        switch (tag) {
        case "administracion":
                    ingreso.actualizarResultado(13, 13, 0, 0, punto * 50, 0, this);
                    break;
            case "cocina":
                ingreso.actualizarResultado(4, 4, 0, 0, punto * 50, 0, this);
                break;
            case "computacion":
                ingreso.actualizarResultado(1, 1, 0, 0, punto * 50, 0, this);
                break;
            case "construccion":
                ingreso.actualizarResultado(9, 9, 0, 0, punto * 50, 0, this);
                break;
            case "contador":
                ingreso.actualizarResultado(12, 12, 0, 0, punto * 50, 0, this);
                break;
            case "digital":
                ingreso.actualizarResultado(15, 15, 0, 0, punto * 50, 0, this);
                break;
            case "diseño":
                ingreso.actualizarResultado(2, 2, 0, 0, punto * 50, 0, this);
                break;
            case  "electricidad":
                ingreso.actualizarResultado(3, 3, 0, 0, punto * 50, 0, this);
                break;
            case "fisica":
                ingreso.actualizarResultado(5, 5, 0, 0, punto * 50, 0, this);
                break;
            case "juridica":
                ingreso.actualizarResultado(11, 11, 0, 0, punto * 50, 0, this);
                break;
            case "maestro":
                ingreso.actualizarResultado(14, 14, 0, 0, punto * 50, 0, this);
                break;
            case  "mecanica":
                ingreso.actualizarResultado(7, 7, 0, 0, punto * 50, 0, this);
                break;
            case "medicina":
                ingreso.actualizarResultado(10, 10, 0, 0, punto * 50, 0, this);
                break;
            case "musica":
                ingreso.actualizarResultado(6, 6, 0, 0, punto * 50, 0, this);
                break;
            case "publicidad":
                ingreso.actualizarResultado(16, 16, 0, 0, punto * 50, 0, this);
                break;
            case  "secretaria":
                ingreso.actualizarResultado(17, 17, 0, 0, punto * 50, 0, this);
                break;
            case "turismo":
                ingreso.actualizarResultado(8, 8, 0, 0, punto * 50, 0, this);
                break;
        }
        progressDialog.dismiss();
    }

}
