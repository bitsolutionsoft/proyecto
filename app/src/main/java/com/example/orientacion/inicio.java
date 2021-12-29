package com.example.orientacion;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.orientacion.bd.Datos;
import com.example.orientacion.bd.IngresarDatos;
import com.example.orientacion.bd.Model.areas;
import com.example.orientacion.bd.Model.carreras;
import com.example.orientacion.bd.Model.preguntas;
import com.example.orientacion.bd.Model.respuestas;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class inicio extends AppCompatActivity {
    public static final String user="names";
    private TextView mTextViewName;
    private DatabaseReference mDatabase;
    private FirebaseAuth mAuth;
    String nombre2="juan";
    Datos datos=new Datos();
    IngresarDatos ingresar= new IngresarDatos();
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

ArrayList<carreras> carreras=new ArrayList<>(datos.returnCarreras());
ingresar.IngresarCarreras(carreras,this);
ingresar.iniciarResultado(carreras,this);
ArrayList<areas> area=new ArrayList<>(datos.returnAreas());
ingresar.ingresarArea(area,this);
ArrayList<preguntas> pregunta=new ArrayList<>(datos.returnPregutas());
ingresar.ingresarPregunta(pregunta,this);
ArrayList<respuestas> respuesta=new ArrayList<>(datos.returnRespuesta());
ingresar.ingresarRespuesta(respuesta,this);





        mAuth = FirebaseAuth.getInstance();
        mDatabase =FirebaseDatabase.getInstance().getReference();



        getUserInfo();

    }

    public void seleccion(View view) {

        switch (view.getId()){
            case R.id.si:
                getUserInfo();
                mAuth.signOut();
                startActivity(new Intent( inicio.this, MainActivity.class));
                finish();
                break;
            case R.id.no:
                startActivity(new Intent( inicio.this, Main2Activity.class));
                IngresarDatos datos1=new IngresarDatos();
                ArrayList<carreras> carrerasList=new ArrayList<>(datos.returnCarreras());
                for (int i=0; i<carrerasList.size();i++) {
                    datos1.actualizarResultado2(carrerasList.get(i).getIdCarrera(), carrerasList.get(i).getIdCarrera(), 0, 0, 0, 0, this);
                }
                finish();
                break;
            case R.id.btnsignout: {
                mAuth.signOut();
                startActivity(new Intent(inicio.this, MainActivity.class));
            }
        }


    }
    public void getUserInfo(){
        final String id = mAuth.getCurrentUser().getUid();
        mDatabase.child("Users").child(id).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()){
                    Map<String,Object> personaMap = new HashMap<>();
                   // String personas="no";
                    personaMap.put("resultado","");
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
}
