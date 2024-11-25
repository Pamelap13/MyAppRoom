package com.example.myapproom.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import com.example.myapproom.entities.Role

@Dao
interface RoleDao {
    @Insert
    fun insertRole (vararg role:Role)

    @Delete
    fun deleteRole(role: Role)
}