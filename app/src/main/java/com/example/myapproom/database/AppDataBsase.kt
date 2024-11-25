package com.example.myapproom.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myapproom.dao.RoleDao
import com.example.myapproom.dao.UsersDao
import com.example.myapproom.entities.Role
import com.example.myapproom.entities.Users

@Database(entities = [Users::class, Role::class], version = 1)
abstract class AppDataBsase: RoomDatabase() {
    abstract fun usersDao(): UsersDao

    abstract fun roleDao():RoleDao
}