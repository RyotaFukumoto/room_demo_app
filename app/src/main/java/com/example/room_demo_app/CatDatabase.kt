package com.example.room_demo_app

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [CatEntity::class], version = 1)
abstract class CatDatabase: RoomDatabase() {

    abstract fun catDao(): CatDao

    companion object {
        private var INSTANCE: CatDatabase? = null

        private val lock = Any()

        fun getInstance(context: Context): CatDatabase {
            synchronized(lock) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.applicationContext,
                        CatDatabase::class.java, "CatEntity.db")
                        .allowMainThreadQueries()
                        .build()
                }
                return INSTANCE!!
            }
        }
    }
}