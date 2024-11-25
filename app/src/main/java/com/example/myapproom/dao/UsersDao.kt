package com.example.myapproom.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.myapproom.entities.Users

@Dao
interface UsersDao {
    @Insert
    fun insertUser (vararg user: Users)

    @Delete
    fun deleteUser(user: Users)

    @Query("select * from users")
    fun getUsers(): List<Users>
}