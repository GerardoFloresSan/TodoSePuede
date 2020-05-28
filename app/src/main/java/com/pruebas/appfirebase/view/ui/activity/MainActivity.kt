package com.pruebas.appfirebase.view.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pruebas.appfirebase.R
import com.pruebas.appfirebase.view.ui.extensions.startActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        Thread.sleep(2000)
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //TODO mejorar codigo
        btn_login.setOnClickListener {
            startActivity(ProfileActivity::class.java)
        }

    }
}
