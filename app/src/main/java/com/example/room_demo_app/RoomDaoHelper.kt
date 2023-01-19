package com.example.room_demo_app

import androidx.room.*
import java.util.concurrent.Flow

@Dao
interface RoomDaoHelper<T> {
    @Insert()
    fun insert(entity: T)

    @Insert
    fun inserts(entities: List<T>)

    @Update
    fun update(entity: T)

    @Update
    fun updates(entities: List<T>)

    @Delete
    fun delete(entity: T)

    @Delete
    fun deletes(entities: List<T>)
}