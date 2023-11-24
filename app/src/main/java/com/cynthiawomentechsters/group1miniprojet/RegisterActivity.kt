package com.cynthiawomentechsters.group1miniprojet


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val login: Button = findViewById(R.id.loginBtn1)
        login.setOnClickListener {
            val i = Intent(this, SignUp::class.java)
            startActivity(i)
        }
    }
}