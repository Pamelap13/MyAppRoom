package com.example.myapproom.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Users(
    @PrimaryKey val id: Int,
    val firstName: String?,
    val lastName: String?
)