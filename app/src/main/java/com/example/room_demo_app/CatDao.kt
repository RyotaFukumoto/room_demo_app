package com.example.room_demo_app

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query

@Dao
interface CatDao: RoomDaoHelper<CatEntity> {

    @Query("SELECT * from CatEntity WHERE id = :id")
    fun getEntity(id: Int): LiveData<CatEntity>

    @Query("SELECT * FROM CatEntity")
    fun getAll(): List<CatEntity>
}