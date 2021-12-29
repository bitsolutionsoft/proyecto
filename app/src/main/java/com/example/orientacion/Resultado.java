package com.example.orientacion;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

import com.example.orientacion.bd.Datos;
import com.example.orientacion.bd.IngresarDatos;

import com.example.orientacion.bd.Model.carreras;
import com.example.orientacion.bd.Model.resultados;


import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import lecho.lib.hellocharts.model.ColumnChartData;
import lecho.lib.hellocharts.model.PieChartData;
import lecho.lib.hellocharts.model.SliceValue;

import lecho.lib.hellocharts.model.SubcolumnValue;
import lecho.lib.hellocharts.util.ChartUtils;
import lecho.lib.hellocharts.view.ColumnChartView;
import lecho.lib.hellocharts.view.PieChartView;

public class Resultado extends AppCompatActivity {

     private TextView mTextViewData;
    public static final String user="names";
    private TextView mTextViewName;
    private DatabaseReference mDatabase;
    private FirebaseAuth mAuth;

     private  TextView img0,img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12,img13,img14,img15,img16;
     private  TextView carr0,carr1,carr2,carr3,carr4,carr5,carr6,carr7,carr8,carr9,carr10,carr11,carr12,carr13,carr14,carr15,carr16;
     private  TextView num0,num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11,num12,num13,num14,num15,num16;
inicio inicio=new inicio();
     Datos datosListas=new Datos();
     ArrayList<carreras> carrerasList=new ArrayList(datosListas.returnCarreras());

     PieChartView grafica;
IngresarDatos datos=new IngresarDatos();
    ColumnChartView grafica1;
    ColumnChartData colunData;
    int [] color=new int[]{Color.rgb(20,0,255),Color.GREEN,Color.MAGENTA,Color.CYAN,Color.BLUE,Color.YELLOW,Color.rgb(0,102,0),Color.rgb(0,0,102),Color.rgb(205,202,0),Color.rgb(0,255,255),Color.rgb(204,0,102),Color.rgb(0,255,102),Color.rgb(51,0,51),Color.rgb(51,255,153),Color.rgb(142,68,173),Color.rgb(231,76,60),Color.RED,Color.rgb(204,153,0)};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        grafica=(PieChartView) findViewById(R.id.grafica);
        iniciarTextView();
        mAuth = FirebaseAuth.getInstance();
        mDatabase =FirebaseDatabase.getInstance().getReference();

        iniciarTextView();
        ArrayList<resultados> ls=new ArrayList<>(datos.consultaResultadofinal(this));
        iniciarGrafica(ls);

     //   gerGrafica();
guardarFireBase();



    }



    public  void iniciarGrafica(ArrayList<resultados> lista){
        List<SliceValue> piedata=new ArrayList<>();
        for (int i=0;i<lista.size();i++) {
            if (i<4){
            piedata.add(new SliceValue(lista.get(i).getResultado()/4,color[i]).setLabel(""+lista.get(i).getIdResultado()+":  "+(lista.get(i).getResultado()/4)+"%"));
            }
            detalle(color[i],lista.get(i).getResultado()/4,i,lista.get(i).getIdResultado());

        }
        PieChartData pieChartData=new PieChartData(piedata);
        pieChartData.setHasLabels(true).setValueLabelTextSize(16);
        pieChartData.setHasCenterCircle(true).setCenterText1("Resultados").setCenterText1FontSize(20).setCenterText1Color(Color.parseColor("#FFFFFF"));

        grafica.setPieChartData(pieChartData);
grafica.setZoomEnabled(true);



    }

    public void empezarDeNuevo(View view) {
        for (int i=0; i<carrerasList.size();i++) {
        datos.actualizarResultado2(carrerasList.get(i).getIdCarrera(), carrerasList.get(i).getIdCarrera(), 0, 0, 0, 0, this);
    }
        startActivity(new Intent(getApplicationContext(),inicio.class));
        finish();
    }

        public void detalle(int color, float por, int posicion,int id){
      switch (posicion) {
          case 0:
             img0.setText(String.valueOf(por)+"%");
              img0.setBackgroundColor(color);
              num0.setText(String.valueOf(id));
              carr0.setText(getCarrera(id));
          break;
          case 1:
              img1.setText(String.valueOf(por)+"%");
              img1.setBackgroundColor(color);
              num1.setText(String.valueOf(id));
              carr1.setText(getCarrera(id));
              break;
          case 2:
              img2.setText(String.valueOf(por)+"%");
              img2.setBackgroundColor(color);
              num2.setText(String.valueOf(id));
              carr2.setText(getCarrera(id));
              break;
          case 3:
              img3.setText(String.valueOf(por)+"%");
              img3.setBackgroundColor(color);
              num3.setText(String.valueOf(id));
              carr3.setText(getCarrera(id));
              break;
          case 4:
              img4.setText(String.valueOf(por)+"%");
              img4.setBackgroundColor(color);
              num4.setText(String.valueOf(id));
              carr4.setText(getCarrera(id));
              break;
          case 5:
              img5.setText(String.valueOf(por)+"%");
              img5.setBackgroundColor(color);
              num5.setText(String.valueOf(id));
              carr5.setText(getCarrera(id));
              break;
          case 6:
              img6.setText(String.valueOf(por)+"%");
              img6.setBackgroundColor(color);
              num6.setText(String.valueOf(id));
              carr6.setText(getCarrera(id));
              break;
          case 7:
              img7.setText(String.valueOf(por)+"%");
              img7.setBackgroundColor(color);
              num7.setText(String.valueOf(id));
              carr7.setText(getCarrera(id));
              break;
          case 8:
              img8.setText(String.valueOf(por)+"%");
              img8.setBackgroundColor(color);
              num8.setText(String.valueOf(id));
              carr8.setText(getCarrera(id));
              break;
          case 9:
              img9.setText(String.valueOf(por)+"%");
              img9.setBackgroundColor(color);
              num9.setText(String.valueOf(id));
              carr9.setText(getCarrera(id));
              break;
          case 10:
              img10.setText(String.valueOf(por)+"%");
              img10.setBackgroundColor(color);
              num10.setText(String.valueOf(id));
              carr10.setText(getCarrera(id));
              break;
              case 11:
              img11.setText(String.valueOf(por)+"%");
              img11.setBackgroundColor(color);
                  num11.setText(String.valueOf(id));
                  carr11.setText(getCarrera(id));
              break;
          case 12:
              img12.setText(String.valueOf(por)+"%");
              img12.setBackgroundColor(color);
              num12.setText(String.valueOf(id));
              carr12.setText(getCarrera(id));
              break;
          case 13:
              img13.setText(String.valueOf(por)+"%");
              img13.setBackgroundColor(color);
              num13.setText(String.valueOf(id));
              carr13.setText(getCarrera(id));
              break;
          case 14:
              img14.setText(String.valueOf(por)+"%");
              img14.setBackgroundColor(color);
              num14.setText(String.valueOf(id));
              carr14.setText(getCarrera(id));
              break;
          case 15:
              img15.setText(String.valueOf(por)+"%");
              img15.setBackgroundColor(color);
              num15.setText(String.valueOf(id));
              carr15.setText(getCarrera(id));
              break;
          case 16:
              img16.setText(String.valueOf(por)+"%");
              img16.setBackgroundColor(color);
              num16.setText(String.valueOf(id));
              carr16.setText(getCarrera(id));
              break;


      }
    }

    public  void guardarFireBase(){
        ArrayList<resultados> dts=new ArrayList<>(datos.consultaResultadoMax(this));
        String nombre="";
        for (int i=0;i<carrerasList.size();i++){
            if (dts.get(0).getIdCarrera()==carrerasList.get(i).getIdCarrera()){
                nombre=carrerasList.get(i).getNombre();


            }
        }

        getUserInfo(nombre,dts.get(0).getResultado());

    }

public String getCarrera(int id){
        String nombre="";
        for (int i=0;i<carrerasList.size();i++){
            if(carrerasList.get(i).getIdCarrera()==id){
                nombre=carrerasList.get(i).getNombre();
            }
        }
        return  nombre;
}

    public void getUserInfo(final String carrera, final float por){
        final String id = mAuth.getCurrentUser().getUid();
        mDatabase.child("Users").child(id).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()){
                    Map<String,Object> personaMap = new HashMap<>();
                    // String personas="no";
                    personaMap.put("resultado",""+carrera+" "+por+"%");
                    mDatabase.child("Users").child(id).updateChildren(personaMap);
                }
                else{

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

public int porcetntaje(int punto){
        int porcentaje =0;
        porcentaje=punto/100;
        return porcentaje;
}

    public  void iniciarTextView(){
        img0=(TextView)findViewById(R.id.img0);
        img1=(TextView)findViewById(R.id.img1);
        img2=(TextView)findViewById(R.id.img2);
        img3=(TextView)findViewById(R.id.img3);
        img4=(TextView)findViewById(R.id.img4);
        img5=(TextView)findViewById(R.id.img5);
        img6=(TextView)findViewById(R.id.img6);
        img7=(TextView)findViewById(R.id.img7);
        img8=(TextView)findViewById(R.id.img8);
        img9=(TextView)findViewById(R.id.img9);
        img10=(TextView)findViewById(R.id.img10);
        img11=(TextView)findViewById(R.id.img11);
        img12=(TextView)findViewById(R.id.img12);
        img13=(TextView)findViewById(R.id.img13);
        img14=(TextView)findViewById(R.id.img14);
        img15=(TextView)findViewById(R.id.img15);
        img16=(TextView)findViewById(R.id.img16);
        carr0=(TextView)findViewById(R.id.carr0);
        carr1=(TextView)findViewById(R.id.carr1);
        carr2=(TextView)findViewById(R.id.carr2);
        carr3=(TextView)findViewById(R.id.carr3);
        carr4=(TextView)findViewById(R.id.carr4);
        carr5=(TextView)findViewById(R.id.carr5);
        carr6=(TextView)findViewById(R.id.carr6);
        carr7=(TextView)findViewById(R.id.carr7);
        carr8=(TextView)findViewById(R.id.carr8);
        carr9=(TextView)findViewById(R.id.carr9);
        carr10=(TextView)findViewById(R.id.carr10);
        carr11=(TextView)findViewById(R.id.carr11);
        carr12=(TextView)findViewById(R.id.carr12);
        carr13=(TextView)findViewById(R.id.carr13);
        carr14=(TextView)findViewById(R.id.carr14);
        carr15=(TextView)findViewById(R.id.carr15);
        carr16=(TextView)findViewById(R.id.carr16);
        num0=(TextView)findViewById(R.id.num0);
        num1=(TextView)findViewById(R.id.num1);
        num2=(TextView)findViewById(R.id.num2);
        num3=(TextView)findViewById(R.id.num3);
        num4=(TextView)findViewById(R.id.num4);
        num5=(TextView)findViewById(R.id.num5);
        num6=(TextView)findViewById(R.id.num6);
        num7=(TextView)findViewById(R.id.num7);
        num8=(TextView)findViewById(R.id.num8);
        num9=(TextView)findViewById(R.id.num9);
        num10=(TextView)findViewById(R.id.num10);
        num11=(TextView)findViewById(R.id.num11);
        num12=(TextView)findViewById(R.id.num12);
        num13=(TextView)findViewById(R.id.num13);
        num14=(TextView)findViewById(R.id.num14);
        num15=(TextView)findViewById(R.id.num15);
        num16=(TextView)findViewById(R.id.num16);

    }



}
