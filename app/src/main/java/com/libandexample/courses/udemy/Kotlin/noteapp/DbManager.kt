package com.libandexample.courses.udemy.Kotlin.noteapp

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.database.sqlite.SQLiteQueryBuilder
import android.widget.Toast


class  DbManager(context: Context) {

    val dbName="MyNotes"
    val dbTable="Notes"
    private val colID="ID"
    private val colTitle="Title"
    private val colDes="Description"
    val dbVersion=1
    //CREATE TABLE IF NOT EXISTS MyNotes (ID INTEGER PRIMARY KEY,title TEXT, Description TEXT);"
    val sqlCreateTable="CREATE TABLE IF NOT EXISTS "+ dbTable +" ("+ colID +" INTEGER PRIMARY KEY,"+
            colTitle + " TEXT, "+ colDes +" TEXT);"
    private var sqlDB:SQLiteDatabase?=null

    init {
        val db=DatabaseHelperNotes(context)
        sqlDB=db.writableDatabase
    }


    inner class  DatabaseHelperNotes(context: Context) : SQLiteOpenHelper(context, dbName, null, dbVersion) {
         var context:Context?= context
        override fun onCreate(p0: SQLiteDatabase?) {
            p0!!.execSQL(sqlCreateTable)
            Toast.makeText(this.context," database is created", Toast.LENGTH_LONG).show()

        }

        override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
            p0!!.execSQL("Drop table IF EXISTS " + dbTable)
        }

    }


    fun Insert(values:ContentValues):Long{

        val ID= sqlDB!!.insert(dbTable,"",values)
        return ID
    }
    fun  Query(projection:Array<String>,selection:String,selectionArgs:Array<String>,sorOrder:String):Cursor{

        val qb=SQLiteQueryBuilder()
        qb.tables=dbTable
        val cursor=qb.query(sqlDB,projection,selection,selectionArgs,null,null,sorOrder)
        return cursor
    }
    fun Delete(selection:String,selectionArgs:Array<String>):Int{

        val count=sqlDB!!.delete(dbTable,selection,selectionArgs)
        return  count
    }

    fun Update(values:ContentValues,selection:String,selectionargs:Array<String>):Int{

        val count=sqlDB!!.update(dbTable,values,selection,selectionargs)
        return count
    }

}