package com.example.room_demo_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Insert

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val cats: List<CatEntity> = listOf(CatEntity(1,"ひじき"), CatEntity(2,"つくし"))
        val database = CatDatabase.getInstance(this)
        val catDao = database.catDao()
        catDao.inserts(cats)

        val catList = catDao.getAll()
        print(catList)
    }
}