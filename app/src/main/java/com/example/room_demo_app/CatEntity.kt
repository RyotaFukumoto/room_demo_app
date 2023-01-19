package com.example.room_demo_app

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity()
data class CatEntity(@PrimaryKey val id: Int, val name: String)
