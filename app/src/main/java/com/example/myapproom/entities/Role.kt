package com.example.myapproom.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Role (
    @PrimaryKey val idRole: Int,
    val nameRole: String
)