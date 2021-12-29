package com.example.orientacion;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.annotation.NonNull;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import android.app.ProgressDialog;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import java.util.HashMap;
import java.util.Map;

public class Registrar extends AppCompatActivity implements View.OnClickListener {
    public EditText nombre,edad,apellido,correo,institucion;
    RadioButton r1,r2;

    Button siguiente;
    Button regresar;

    //variable de datos que vamos a registrar
    private String name = "";
    private String email = "";
    private String password = "";
    private String age2 ="";
    private String insti = "";
    private String resultado = "";
    private ProgressDialog progressDialog;
    FirebaseAuth mAuth;
    DatabaseReference mDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);
        r1 = (RadioButton) findViewById(R.id.alumno);
        r2 = (RadioButton) findViewById(R.id.director);
        nombre= (EditText) findViewById(R.id.nombre);
        apellido= (EditText) findViewById(R.id.apellido);
        edad=(EditText)findViewById(R.id.edad);
        siguiente =(Button)findViewById(R.id.siguiente);
        regresar = (Button)findViewById(R.id.regresar);
        correo =(EditText) findViewById(R.id.correo);
        institucion =(EditText) findViewById(R.id.institucion);
        mAuth = FirebaseAuth.getInstance();
        mDatabase = FirebaseDatabase.getInstance().getReference();

        progressDialog = new ProgressDialog(this);

        regresar.setOnClickListener(this);


        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                if (r1.isChecked()==true ) {

                    name = nombre.getText().toString();
                    email = correo.getText().toString();
                    password = apellido.getText().toString();
                    age2 = edad.getText().toString();
                    insti = institucion.getText().toString().trim();


                    if(!name.isEmpty()&& !email.isEmpty() && !password.isEmpty() && !age2.isEmpty() && !insti.isEmpty()){

                        if (password.length()>=6){
                            registerUser();
                        }
                        else{
                            Toast.makeText( Registrar.this, "El password debe tener al menos 6 caracteres", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else{
                        Toast.makeText( Registrar.this, "Debe completar todo los campos", Toast.LENGTH_SHORT).show();
                    }


                }
            }
        });

    }
    public void checkButton(View v) {
        if (r1.isChecked()==false ) {
            Toast.makeText( Registrar.this, "director", Toast.LENGTH_SHORT).show();
            edad.setVisibility(View.GONE);
        } else
        {
            Toast.makeText( Registrar.this, "alumno", Toast.LENGTH_SHORT).show();
            edad.setVisibility(View.VISIBLE);
        }
    }
    private void registerUser(){
        progressDialog.setMessage("Realizando registro en linea...");
        progressDialog.show();
        mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull final Task<AuthResult> task) {
                if (task.isSuccessful()){
                    Map<String, Object> map= new HashMap<>();
                    map.put("name", name);
                    map.put("email", email);
                    map.put("password",password);
                    map.put( "age",age2);
                    map.put("institucion",insti);
                    map.put("resultado",resultado);
                    String id= mAuth.getCurrentUser().getUid();

                    mDatabase.child("Users").child(id).setValue(map).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task2) {
                            if (task2.isSuccessful()){
                               // startActivity(new Intent( Registrar.this, Main2Activity.class));
                                //finish();
                                Toast.makeText(Registrar.this, "Registrado con exito ", Toast.LENGTH_SHORT).show();

                            }
                            else {
                                if (task.getException() instanceof FirebaseAuthUserCollisionException) {//si se presenta una colisión
                                    Toast.makeText(Registrar.this, "Este usuario ya existe ", Toast.LENGTH_SHORT).show();

                                }
                                else {
                                    Toast.makeText(Registrar.this, "No se pudieron crear los datos correctamente", Toast.LENGTH_SHORT).show();
                                }
                            }

                        }
                    });


                }
                else {
                    Toast.makeText( Registrar.this, "Usuario ya registraro por favor loguearse", Toast.LENGTH_SHORT).show();
                }
                progressDialog.dismiss();
            }
        });
    }

    public void onClick(View v) {
        startActivity(new Intent( Registrar.this, MainActivity.class));
        finish();

    }
}
