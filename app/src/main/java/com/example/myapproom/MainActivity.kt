package com.example.myapproom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import com.example.myapproom.database.AppDataBsase
import com.example.myapproom.entities.Users

class MainActivity : AppCompatActivity() {
    lateinit var db:AppDataBsase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

          db = Room.databaseBuilder(
            applicationContext,
            AppDataBsase::class.java,"mydatabase"
        ).build()
    }

    override fun onResume() {
        super.onResume()

        val thread = Thread{
            var user = Users(1, "Pamela", "Obando")
            //db.usersDao().insertUser(user)
            println(db.usersDao().getUsers().toString())
        }
        thread.start()
        println()

    }

}