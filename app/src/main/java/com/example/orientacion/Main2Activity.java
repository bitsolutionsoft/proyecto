package com.example.orientacion;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.TextView;

import com.example.orientacion.bd.Datos;
import com.example.orientacion.bd.IngresarDatos;
import com.example.orientacion.bd.Model.areas;
import com.example.orientacion.bd.Model.preguntas;
import com.example.orientacion.bd.Model.respuestas;
import com.example.orientacion.bd.Model.resultados;

import java.util.ArrayList;
import java.util.Random;

public class Main2Activity extends AppCompatActivity {
    public static final String user="names";
    Datos datos=new Datos();
    IngresarDatos ingreso= new IngresarDatos();
ArrayList<areas> area=new ArrayList<>(datos.returnAreas());
ArrayList<preguntas> pregunta=new ArrayList<>();
ArrayList<respuestas> respuesta=new ArrayList<>();
ArrayList<resultados> resultado=new ArrayList<>();
private int NumArea=0;
private  int countPregunta=0;
private int ResulCorrecto=0;
Random random=new Random();
    private ProgressDialog progressDialog;
    TextView txtArea,txtPregunta,respuesta1,respuesta2,respuesta3,respuesta4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtArea =(TextView)findViewById(R.id.txtArea);
        txtPregunta =(TextView)findViewById(R.id.txtPregunta);
        respuesta1=(TextView)findViewById(R.id.respuesta1);
        respuesta2=(TextView)findViewById(R.id.respuesta2);
        respuesta3=(TextView)findViewById(R.id.respuesta3);
        respuesta4=(TextView)findViewById(R.id.respuesta4);
        String user = getIntent().getStringExtra("names");
      //  txtArea.setText("¡Bienvenido "+ user +"!");
        progressDialog = new ProgressDialog(this,ProgressDialog.STYLE_SPINNER);
        siguinteArea();
        siguiente();
    }
    public  void bloquerbtn(boolean bool){
        respuesta1.setEnabled(bool);
        respuesta1.setEnabled(bool);
        respuesta1.setEnabled(bool);
        respuesta1.setEnabled(bool);
    }
    public void respuesta(View view) {

        switch (view.getId()){
            case R.id.respuesta1:
                String res=respuesta1.getText().toString();
                int resul=respuesta.get(3).getCorrecta();
                bloquerbtn(false);
                if (res.equals(respuesta.get(3).getRespuesta()) && resul==1){
                ResulCorrecto=ResulCorrecto+1;
                }
                respuesta.clear();
                siguiente();
                break;
            case R.id.respuesta2:
                String res1=respuesta2.getText().toString();
                int resul1=respuesta.get(0).getCorrecta();
                bloquerbtn(false);
                if (res1.equals(respuesta.get(0).getRespuesta()) && resul1==1){
                    ResulCorrecto=ResulCorrecto+1;
                }
                respuesta.clear();
                siguiente();
                break;
            case R.id.respuesta3:
                String res2=respuesta3.getText().toString();
                int resul2=respuesta.get(2).getCorrecta();
                bloquerbtn(false);
                if (res2.equals(respuesta.get(2).getRespuesta()) && resul2==1){
                    ResulCorrecto=ResulCorrecto+1;
                }
                respuesta.clear();
                siguiente();
                break;
            case R.id.respuesta4:
                String res3=respuesta4.getText().toString();
                int resul3=respuesta.get(1).getCorrecta();
                bloquerbtn(false);
                if (res3.equals(respuesta.get(1).getRespuesta()) && resul3==1){
                    ResulCorrecto=ResulCorrecto+1;
                }
                respuesta.clear();
                siguiente();

                break;
        }
    }


    public void siguiente(){
        bloquerbtn(true);
            if (countPregunta<pregunta.size()){
                txtArea.setText(area.get(NumArea).getArea());
                txtPregunta.setText(pregunta.get(countPregunta).getPregunta());
                respuesta.addAll(ingreso.consultaRespuesta(String.valueOf(pregunta.get(countPregunta).getIdPrenguta()),this));
                respuesta1.setText(respuesta.get(3).getRespuesta());
                respuesta2.setText(respuesta.get(0).getRespuesta());
                respuesta3.setText(respuesta.get(2).getRespuesta());
                respuesta4.setText(respuesta.get(1).getRespuesta());
                countPregunta=countPregunta+1;
            }else {

graudarResultado(ResulCorrecto);
                startActivity(new Intent(getApplicationContext(),Gustos.class));
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

public  void graudarResultado(int logica){
        IngresarDatos ingreso=new IngresarDatos();
    progressDialog.setMessage("Guardando Resulatdo ...");
    progressDialog.show();
    ingreso.actualizarResultado(1,1,Float.parseFloat(String.valueOf(logica*10)),0,0,0,this);
    ingreso.actualizarResultado(2,2,Float.parseFloat(String.valueOf(logica*5)),0,0,0,this);
    ingreso.actualizarResultado(3,3,Float.parseFloat(String.valueOf(logica*10)),0,0,0,this);
    ingreso.actualizarResultado(4,4,Float.parseFloat(String.valueOf(logica*5)),0,0,0,this);
    ingreso.actualizarResultado(5,5,Float.parseFloat(String.valueOf(logica*5)),0,0,0,this);
    ingreso.actualizarResultado(6,6,Float.parseFloat(String.valueOf(logica*5)),0,0,0,this);
    ingreso.actualizarResultado(7,7,Float.parseFloat(String.valueOf(logica*7.5)),0,0,0,this);
    ingreso.actualizarResultado(8,8,Float.parseFloat(String.valueOf(logica*5)),0,0,0,this);
    ingreso.actualizarResultado(9,9,Float.parseFloat(String.valueOf(logica*7.5)),0,0,0,this);
    ingreso.actualizarResultado(10,10,Float.parseFloat(String.valueOf(logica*7.5)),0,0,0,this);
    ingreso.actualizarResultado(11,11,Float.parseFloat(String.valueOf(logica*6)),0,0,0,this);
    ingreso.actualizarResultado(12,12,Float.parseFloat(String.valueOf(logica*7.5)),0,0,0,this);
    ingreso.actualizarResultado(13,13,Float.parseFloat(String.valueOf(logica*3)),0,0,0,this);
    ingreso.actualizarResultado(14,14,Float.parseFloat(String.valueOf(logica*10)),0,0,0,this);
    ingreso.actualizarResultado(15,15,Float.parseFloat(String.valueOf(logica*10)),0,0,0,this);
    ingreso.actualizarResultado(16,16,Float.parseFloat(String.valueOf(logica*4.5)),0,0,0,this);
    ingreso.actualizarResultado(17,17,Float.parseFloat(String.valueOf(logica*2)),0,0,0,this);
progressDialog.dismiss();
}
}
