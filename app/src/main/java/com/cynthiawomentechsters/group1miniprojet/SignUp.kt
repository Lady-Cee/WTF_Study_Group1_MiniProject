package com.cynthiawomentechsters.group1miniprojet


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val regBtn: Button = findViewById(R.id.registerButton)
        regBtn.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            this.startActivity(intent)
        }
    }
}