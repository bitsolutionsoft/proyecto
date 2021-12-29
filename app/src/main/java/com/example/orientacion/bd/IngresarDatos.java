package com.example.orientacion.bd;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.orientacion.bd.Model.areas;
import com.example.orientacion.bd.Model.carreras;
import com.example.orientacion.bd.Model.preguntas;
import com.example.orientacion.bd.Model.respuestas;
import com.example.orientacion.bd.Model.resultados;

import java.util.ArrayList;

public class IngresarDatos {

    public void IngresarCarreras(ArrayList<carreras> lista, Context context) {
        SQLiteOpenHelper conn=new SQLIteOpenHelper(context,"orientacion",null,1);
        SQLiteDatabase db=conn.getWritableDatabase();
        ContentValues values=new ContentValues();
        for (int i=0; i<lista.size();i++){
        values.put("idCarrera",lista.get(i).getIdCarrera());
        values.put("Carrera",lista.get(i).getNombre());
        db.insert("carreras",null,values);
      }
        db.close();
    }
    public void ingresarArea(ArrayList<areas> lista, Context context) {
        SQLiteOpenHelper conn=new SQLIteOpenHelper(context,"orientacion",null,1);
        SQLiteDatabase db=conn.getWritableDatabase();
        ContentValues values=new ContentValues();
        for (int i=0; i<lista.size();i++){
            values.put("idArea",lista.get(i).getIdArea());
            values.put("area",lista.get(i).getArea());
            db.insert("area",null,values);
            }db.close();
    }
    public void ingresarPregunta(ArrayList<preguntas> lista, Context context) {
        SQLiteOpenHelper conn=new SQLIteOpenHelper(context,"orientacion",null,1);
        SQLiteDatabase db=conn.getWritableDatabase();
        ContentValues values=new ContentValues();
        for (int i=0; i<lista.size();i++){
            values.put("idPregunta",lista.get(i).getIdPrenguta());
            values.put("idAreas",lista.get(i).getIdArea());
            values.put("pregunta",lista.get(i).getPregunta());
            db.insert("pregunta",null,values);
            }db.close();
    }
    public void ingresarRespuesta(ArrayList<respuestas> lista, Context context) {
        SQLiteOpenHelper conn=new SQLIteOpenHelper(context,"orientacion",null,1);
        SQLiteDatabase db=conn.getWritableDatabase();
        ContentValues values=new ContentValues();
        for (int i=0; i<lista.size();i++){
            values.put("idRespuesta",lista.get(i).getIdRespuesta());
            values.put("idPreguntas",lista.get(i).getIdPreguntas());
            values.put("respuesta",lista.get(i).getRespuesta());
            values.put("correcta",lista.get(i).getCorrecta());
            db.insert("respuesta",null,values);
        } db.close();
    }
    public void iniciarResultado(ArrayList<carreras> lista, Context context) {
        SQLiteOpenHelper conn=new SQLIteOpenHelper(context,"orientacion",null,1);
        SQLiteDatabase db=conn.getWritableDatabase();
        ContentValues values=new ContentValues();
        for (int i=0; i<lista.size();i++){
            values.put("idresultado",lista.get(i).getIdCarrera());
            values.put("idcarrera",lista.get(i).getIdCarrera());
            values.put("logica",0);
            values.put("matematica",0);
            values.put("gusto",0);
            values.put("social",0);
            values.put("resultado",0);
            db.insert("resultados",null,values);
        }    db.close();
    }
    public void actualizarResultado(int idresultado,int idcarrera,float logica,float mate,float gusto, float social, Context context) {
        SQLiteOpenHelper conn=new SQLIteOpenHelper(context,"orientacion",null,1);
        SQLiteDatabase db=conn.getWritableDatabase();
        ContentValues values=new ContentValues();
        float odlresult=totalResult(String.valueOf(idresultado),context);
        float total=mate+logica+gusto+social+odlresult;
        //values.put("idresultado",lista.get(i).getIdResultado());
        values.put("idcarrera",idcarrera);
        values.put("logica",logica);
        values.put("matematica",mate);
        values.put("gusto",gusto);
        values.put("social",social);
        values.put("resultado",total);
        db.update("resultados",values,"idresultado="+idresultado,null);
        db.close();
    }
    public void actualizarResultado2(int idresultado,int idcarrera,float logica,float mate,float gusto, float social, Context context) {
        SQLiteOpenHelper conn=new SQLIteOpenHelper(context,"orientacion",null,1);
        SQLiteDatabase db=conn.getWritableDatabase();
        ContentValues values=new ContentValues();
        float odlresult=totalResult(String.valueOf(idresultado),context);
        float total=mate+logica+gusto+social;
        //values.put("idresultado",lista.get(i).getIdResultado());
        values.put("idcarrera",idcarrera);
        values.put("logica",logica);
        values.put("matematica",mate);
        values.put("gusto",gusto);
        values.put("social",social);
        values.put("resultado",total);
        db.update("resultados",values,"idresultado="+idresultado,null);
        db.close();
    }

    public ArrayList<preguntas> consultaPregunta(String numero, Context context) {
        ArrayList<preguntas> pregunta=new ArrayList<>();
        SQLiteOpenHelper conn = new SQLIteOpenHelper(context, "orientacion", null, 1);

        SQLiteDatabase db = conn.getReadableDatabase();
        String[] parametro = {numero};

        Cursor cursor = db.rawQuery("SELECT * FROM pregunta WHERE idAreas =?", parametro);

        while (cursor.moveToNext()) {
            preguntas c = new preguntas();
            c.setIdPrenguta(cursor.getInt(0));
            c.setIdArea(cursor.getInt(1));
            c.setPregunta(cursor.getString(2));
            pregunta.add(c);

        }
        return pregunta;
    }

    public ArrayList<areas> consultaAreas(Context context) {
        ArrayList<areas> pregunta=new ArrayList<>();
        SQLiteOpenHelper conn = new SQLIteOpenHelper(context, "orientacion", null, 1);

        SQLiteDatabase db = conn.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM area",null);

        while (cursor.moveToNext()) {
            areas c = new areas();
            c.setIdArea(cursor.getInt(0));
          c.setArea(cursor.getString(1));
            pregunta.add(c);
        }
        return pregunta;
    }

    public ArrayList<respuestas> consultaRespuesta(String numero, Context context) {
        ArrayList<respuestas> respuesta=new ArrayList<>();
        SQLiteOpenHelper conn = new SQLIteOpenHelper(context, "orientacion", null, 1);
        SQLiteDatabase db = conn.getReadableDatabase();
        String[] parametro = {numero};

        Cursor cursor = db.rawQuery("SELECT * FROM respuesta WHERE idPreguntas =?", parametro);

        while (cursor.moveToNext()) {
            respuestas c = new respuestas();
            c.setIdRespuesta(cursor.getInt(0));
            c.setIdPreguntas(cursor.getInt(1));
            c.setRespuesta(cursor.getString(2));
            c.setCorrecta(cursor.getInt(3));
            respuesta.add(c);

        }
        return respuesta;
    }

    public ArrayList<resultados> consultaResultado(Context context) {
        ArrayList<resultados> respuesta=new ArrayList<>();
        SQLiteOpenHelper conn = new SQLIteOpenHelper(context, "orientacion", null, 1);
        SQLiteDatabase db = conn.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM resultados", null);

        while (cursor.moveToNext()) {
            resultados c = new resultados();
            c.setIdResultado(cursor.getInt(0));
            c.setIdCarrera(cursor.getInt(1));
            c.setLogica(cursor.getFloat(2));
            c.setMatenatica(cursor.getFloat(3));
            c.setGusto(cursor.getFloat(4));
            c.setSocial(cursor.getFloat(5));
            c.setResultado(cursor.getFloat(6));
            respuesta.add(c);

        }
        return respuesta;
    }

    public ArrayList<resultados> consultaResultadofinal(Context context) {
        ArrayList<resultados> respuesta=new ArrayList<>();
        SQLiteOpenHelper conn = new SQLIteOpenHelper(context, "orientacion", null, 1);
        SQLiteDatabase db = conn.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM resultados order by resultado desc", null);

        while (cursor.moveToNext()) {
            resultados c = new resultados();
            c.setIdResultado(cursor.getInt(0));
            c.setIdCarrera(cursor.getInt(1));
            c.setLogica(cursor.getFloat(2));
            c.setMatenatica(cursor.getFloat(3));
            c.setGusto(cursor.getFloat(4));
            c.setSocial(cursor.getFloat(5));
            c.setResultado(cursor.getFloat(6));
            respuesta.add(c);

        }
        return respuesta;
    }
    public ArrayList<resultados> consultaResultadoMax(Context context) {
        ArrayList<resultados> respuesta=new ArrayList<>();
        SQLiteOpenHelper conn = new SQLIteOpenHelper(context, "orientacion", null, 1);
        SQLiteDatabase db = conn.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT idresultado, max(resultado) FROM resultados", null);

        while (cursor.moveToNext()) {
            resultados c = new resultados();
            c.setIdCarrera(cursor.getInt(0));
            c.setResultado(cursor.getInt(1));
            respuesta.add(c);

        }
        return respuesta;
    }



    public int totalResult(String numero, Context context) {
        int total = 0;
        SQLiteOpenHelper conn = new SQLIteOpenHelper(context, "orientacion", null, 1);
        SQLiteDatabase db = conn.getReadableDatabase();
        String[] parametro = {numero};
        Cursor cursor = db.rawQuery("SELECT resultado FROM resultados where idresultado =?", parametro);
        while (cursor.moveToNext()) {
            total = cursor.getInt(0);
        }
        return total;
    }

}
