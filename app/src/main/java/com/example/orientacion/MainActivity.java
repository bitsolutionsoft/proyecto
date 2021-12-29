package com.example.orientacion;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import android.text.TextUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    public EditText apellido,correo;
RadioButton r1,r2;

Button siguiente,registro;

//variable de datos que vamos a registrar
    private String opcion="";
private String name = "";
private String email = "";
private String password = "";
private String correodd = "";
private FirebaseAuth firebaseAuth;
private ProgressDialog progressDialog;
private FirebaseAuth mAuth;
DatabaseReference mDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1 = (RadioButton) findViewById(R.id.alumno);
        r2 = (RadioButton) findViewById(R.id.director);
        apellido= (EditText) findViewById(R.id.apellido);
        siguiente =(Button)findViewById(R.id.siguiente);
        registro =(Button)findViewById(R.id.registro);
        correo =(EditText) findViewById(R.id.correo);
        mAuth = FirebaseAuth.getInstance();
        mDatabase = FirebaseDatabase.getInstance().getReference();



        firebaseAuth = FirebaseAuth.getInstance();
        registro.setOnClickListener(this);
        progressDialog = new ProgressDialog(this);





        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                       if (r1.isChecked() == true) {
                           loguearUsuario();
                       }
                       if(r2.isChecked()==true){
                           loguearDirector();
                       }
            }
        });
    }



    public void checkButton(View v) {
        if (r1.isChecked()==false ) {
            Toast.makeText( MainActivity.this, "director", Toast.LENGTH_SHORT).show();
        } else
        {
            Toast.makeText( MainActivity.this, "alumno", Toast.LENGTH_SHORT).show();
        }
    }


    public void onClick(View v) {
        startActivity(new Intent( MainActivity.this, Registrar.class));
        finish();
    }

    private void loguearUsuario() {
        //Obtenemos el email y la contraseña desde las cajas de texto
        final String email = correo.getText().toString().trim();
        String password = apellido.getText().toString().trim();

        //Verificamos que las cajas de texto no esten vacías
        if (TextUtils.isEmpty(email)) {//(precio.equals(""))
            Toast.makeText(this, "Se debe ingresar un email", Toast.LENGTH_LONG).show();
            return;
        }

        if (TextUtils.isEmpty(password)) {
            Toast.makeText(this, "Falta ingresar la contraseña", Toast.LENGTH_LONG).show();
            return;
        }


        progressDialog.setMessage("Realizando consulta en linea...");
        progressDialog.show();

        //loguear usuario
       firebaseAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        //checking if success
                        if (task.isSuccessful()) {
                            Toast.makeText(MainActivity.this, "Bienvenido: " + correo.getText(), Toast.LENGTH_LONG).show();
                        Intent intencion = new Intent(getApplication(),inicio.class);
                        //intencion.putExtra(inicio.user,email);
                        startActivity(intencion);
                        opcion="alumno";
                        } else {
                            if (task.getException() instanceof FirebaseAuthUserCollisionException) {//si se presenta una colisión
                                Toast.makeText(MainActivity.this, "Ese usuario ya existe ", Toast.LENGTH_SHORT).show();
                            } else {
                                Toast.makeText(MainActivity.this, "Usuario no registrado ", Toast.LENGTH_LONG).show();
                            }
                        }
                        progressDialog.dismiss();
                    }
                });


    }


    private void loguearDirector() {
        //Obtenemos el email y la contraseña desde las cajas de texto
        final String email = correo.getText().toString().trim();
        String password = apellido.getText().toString().trim();

        //Verificamos que las cajas de texto no esten vacías
        if (TextUtils.isEmpty(email)) {//(precio.equals(""))
            Toast.makeText(this, "Se debe ingresar un email", Toast.LENGTH_LONG).show();
            return;
        }

        if (TextUtils.isEmpty(password)) {
            Toast.makeText(this, "Falta ingresar la contraseña", Toast.LENGTH_LONG).show();
            return;
        }


        progressDialog.setMessage("Realizando consulta en linea...");
        progressDialog.show();

        //loguear usuario
        firebaseAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        //checking if success
                        if (task.isSuccessful()) {
                            getUserInfo();
                        } else {
                            if (task.getException() instanceof FirebaseAuthUserCollisionException) {//si se presenta una colisión
                                Toast.makeText(MainActivity.this, "Ese usuario ya existe ", Toast.LENGTH_SHORT).show();
                            } else {
                                Toast.makeText(MainActivity.this, "Usuario no registrado ", Toast.LENGTH_LONG).show();
                            }
                        }
                        progressDialog.dismiss();
                    }
                });


    }

    private void getUserInfo(){
        String id = mAuth.getCurrentUser().getUid();
        mDatabase.child("Director").child(id).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()){
                    String email2=dataSnapshot.child("email").getValue().toString();
                    opcion="director";
                    Toast.makeText(MainActivity.this, "Director" + opcion, Toast.LENGTH_SHORT).show();

                    startActivity(new Intent(MainActivity.this, Resultado.class));
                   // finish();
                }
                else{
                    Toast.makeText(MainActivity.this, "No eres director ", Toast.LENGTH_SHORT).show();
                    opcion="alumno";
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

protected void onStart() {

    super.onStart();
    if(mAuth.getCurrentUser()!=null){
        if (opcion.equals("director")) {
            startActivity(new Intent(MainActivity.this, Resultado.class));
           // finish();
        }
        if(opcion.equals("alumno")) {
            startActivity(new Intent(MainActivity.this, inicio.class));
          //  finish();

        }
    }
}

}

