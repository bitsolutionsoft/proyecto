package com.example.orientacion.bd;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLIteOpenHelper extends SQLiteOpenHelper{
    public SQLIteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
db.execSQL("create table carreras(idCarrera int primary key, Carrera text)");
db.execSQL("create table resultados(idresultado Integer primary key, idcarrera int, logica float, matematica float, gusto float, social float, resultado float, foreign key(idcarrera) references carreras(idCarrera))");
db.execSQL("create table area(idArea int primary key, area text)");
db.execSQL("create table pregunta(idpregunta int primary key, idAreas int, pregunta text, foreign key(idAreas) references area(idArea))");
db.execSQL("create table respuesta(idRespuesta int primary key, idPreguntas int, respuesta text, correcta int, foreign key(idPreguntas) references pregunta(idPregunta))");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int versionOld, int versionNew) {
        db.execSQL("DROP TABLE IF EXISTS carreras");
        db.execSQL("DROP TABLE IF EXISTS resultados");
        db.execSQL("DROP TABLE IF EXISTS area");
        db.execSQL("DROP TABLE IF EXISTS pregunta");
        db.execSQL("DROP TABLE IF EXISTS respuesta");

    }
}
