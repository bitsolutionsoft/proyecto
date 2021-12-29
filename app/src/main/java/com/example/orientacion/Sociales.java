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
import com.example.orientacion.bd.Model.DatosAux;
import com.example.orientacion.bd.Model.areas;
import com.example.orientacion.bd.Model.auxRespuestas;
import com.example.orientacion.bd.Model.preguntaAux;
import com.example.orientacion.bd.Model.preguntaPorCarrera;
import com.example.orientacion.bd.Model.preguntas;
import com.example.orientacion.bd.Model.respuestas;
import com.example.orientacion.bd.Model.resultados;

import java.util.ArrayList;
import java.util.Random;

public class Sociales extends AppCompatActivity {
    public static final String user="names";
    Datos datos=new Datos();
    IngresarDatos ingreso= new IngresarDatos();
    ArrayList<areas> area=new ArrayList<>(datos.returnAreas());
    ArrayList<preguntas> pregunta=new ArrayList<>();
    ArrayList<respuestas> respuesta=new ArrayList<>();
    ArrayList<resultados> resultado=new ArrayList<>();
    private int NumArea=3;
    private  int countPregunta=0;
    Random random=new Random();
    DatosAux datosAux=new DatosAux();
    auxRespuestas aux_Respuestas=new auxRespuestas();
    ArrayList<auxRespuestas> registro=new ArrayList<auxRespuestas>(aux_Respuestas.res());
    TextView txtArea,txtPregunta,respuesta1,respuesta2,respuesta3,respuesta4;
    private ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sociales);
        txtArea =(TextView)findViewById(R.id.txtArea);
        txtPregunta =(TextView)findViewById(R.id.txtPregunta);
        respuesta1=(TextView)findViewById(R.id.respuesta1);
        respuesta2=(TextView)findViewById(R.id.respuesta2);
        respuesta3=(TextView)findViewById(R.id.respuesta3);
        respuesta4=(TextView)findViewById(R.id.respuesta4);
        progressDialog = new ProgressDialog(this);
        //  txtArea.setText("¡Bienvenido "+ user +"!");
        ocultarBoton();
        siguinteArea();
        siguiente();
    }

    public void respuesta(View view) {
        switch (view.getId()){
            case R.id.respuesta1:
                respuesta1.setEnabled(false);
                bloquerbtn();
                agregarAlRegistro(respuesta.get(0).getCorrecta(),auxlisPre(respuesta.get(0).getIdPreguntas()));
                respuesta.clear();
                siguiente();
                break;
            case R.id.respuesta2:
                respuesta2.setEnabled(false);
                bloquerbtn();
                agregarAlRegistro(respuesta.get(1).getCorrecta(),auxlisPre(respuesta.get(1).getIdPreguntas()));
                respuesta.clear();
                siguiente();
                break;
            case R.id.respuesta3:
                respuesta3.setEnabled(false);
                bloquerbtn();
                agregarAlRegistro(respuesta.get(2).getCorrecta(),auxlisPre(respuesta.get(2).getIdPreguntas()));
                respuesta.clear();
                siguiente();
                break;
            case R.id.respuesta4:
                respuesta4.setEnabled(false);
                bloquerbtn();
                agregarAlRegistro(respuesta.get(3).getCorrecta(),auxlisPre(respuesta.get(3).getIdPreguntas()));
                respuesta.clear();
                siguiente();
                break;
        }
    }

public  void agregarAlRegistro(int punto, ArrayList <preguntaAux>list){
        int puntos=0;

        for (int i=0;i<list.size();i++) {
           for (int j=0;j<registro.size();j++){
           if (list.get(i).getIdCarrera()==registro.get(j).getIdcarrera()) {
               puntos = convertir(punto, registro.get(j).getIdcarrera());
             //  Toast.makeText(getApplicationContext(), "pregunta " + list.get(i).getIdPregunta() + " punteo " + puntos + " carrera" + registro.get(j).getIdcarrera(), Toast.LENGTH_SHORT).show();

               registro.get(j).setTotalPunto(registro.get(j).getTotalPunto() + puntos);
           }
           }
        }
}
    public void siguiente(){
ocultarBoton();
        if (countPregunta<pregunta.size()){
            txtArea.setText(area.get(NumArea).getArea());
            txtPregunta.setText(pregunta.get(countPregunta).getPregunta());
            respuesta.addAll(ingreso.consultaRespuesta(String.valueOf(pregunta.get(countPregunta).getIdPrenguta()),this));
            for (int i=0; i<respuesta.size();i++){
            switch (i){
                case 0:
                    respuesta1.setEnabled(true);
                    respuesta1.setBackgroundResource(R.drawable.boton_round);
                    respuesta1.setText(respuesta.get(0).getRespuesta());
                    break;
                case 1:
                    respuesta2.setEnabled(true);
                    respuesta2.setBackgroundResource(R.drawable.boton_round);
                    respuesta2.setText(respuesta.get(1).getRespuesta());
                    break;
                case 2:
                    respuesta3.setEnabled(true);
                    respuesta3.setBackgroundResource(R.drawable.boton_round);
                    respuesta3.setText(respuesta.get(2).getRespuesta());
                    break;
                case 3:
                    respuesta4.setEnabled(true);
                    respuesta4.setBackgroundResource(R.drawable.boton_round);
                    respuesta4.setText(respuesta.get(3).getRespuesta());
                    break;
            }
            }

            countPregunta=countPregunta+1;

        }else {

            //prepararResultado();
            guadarResultado(registro);
            startActivity(new Intent(getApplicationContext(),Resultado.class));
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

public void ocultarBoton(){
        respuesta1.setBackgroundResource(R.drawable.trasparente);
    respuesta2.setBackgroundResource(R.drawable.trasparente);
    respuesta3.setBackgroundResource(R.drawable.trasparente);
    respuesta4.setBackgroundResource(R.drawable.trasparente);
    respuesta1.setText("");
    respuesta2.setText("");
    respuesta3.setText("");
    respuesta4.setText("");
    respuesta1.setEnabled(false);
    respuesta1.setEnabled(false);
    respuesta1.setEnabled(false);
    respuesta1.setEnabled(false);
}

    public  void bloquerbtn(){
        respuesta1.setEnabled(false);
        respuesta1.setEnabled(false);
        respuesta1.setEnabled(false);
        respuesta1.setEnabled(false);
    }

   /* public int codigoPregunta(String pre){
        int codigo=0;
        for (int i=0;i<pregunta.size();i++){
            if (pregunta.get(i).getPregunta().equals(pre)){
                codigo=pregunta.get(i).getIdPrenguta();
            }
        }
        return codigo;
}*/

   public ArrayList<preguntaAux> auxlisPre(int idepre){
       ArrayList<preguntaAux> list=new ArrayList<>();
       ArrayList<preguntaAux> lista=new ArrayList<>(datosAux.verificarPregunta());
        for (int i=0;i<lista.size();i++){
            if (idepre==lista.get(i).getIdPregunta()){
            list.add(new preguntaAux(lista.get(i).getIdPregunta(),lista.get(i).getIdCarrera()));
            }
        }
        return list;
   }

    public  void guadarResultado(ArrayList<auxRespuestas> lis){
        IngresarDatos ingreso=new IngresarDatos();
        progressDialog.setMessage("Calculando Resulatdo ...");
        progressDialog.show();
for (int i=0;i<lis.size();i++) {
    ingreso.actualizarResultado(lis.get(i).getIdresultado(), lis.get(i).getIdcarrera(), 0, 0, 0, lis.get(i).getTotalPunto(), this);
}
   progressDialog.dismiss();
    }


    public void prepararResultado(){
        progressDialog.setMessage("Guardando Resulatdo ...");
        progressDialog.show();
        for ( int i=0; i<registro.size();i++){
            if (registro.get(i).getNumerorespuesta()<7){
                for (int j=registro.get(i).getNumerorespuesta();j<7;j++){
                    registro.get(i).setNumerorespuesta(registro.get(i).getNumerorespuesta()+1);
                    registro.get(i).setTotalPunto((int) (registro.get(i).getTotalPunto()+14.28));
                }
            }
        }
progressDialog.dismiss();
    }

    private int convertir(int numero,  int idCarrera){
        ArrayList<preguntaPorCarrera> ls=new ArrayList<>(datosAux.numeroPregunta());
        float puntos=0;
        for (int i=0;i<ls.size();i++){
            if (idCarrera==ls.get(i).getCodigo()){
                puntos=(float) ls.get(i).getTotal()/ls.get(i).getNumeroPregiunta();
            }
        }
        int numeros = 0;
        switch (numero){
            case 3:
                numeros= (int) (puntos*1);

                break;
            case 2:
                numeros= (int) (puntos*0.66);

                        break;
            case 1:
                numeros= (int) (puntos*0.33);

                break;
            case 0:
                numeros= (int) (puntos*0);

                break;
        }
        return  numeros;
    }
}

