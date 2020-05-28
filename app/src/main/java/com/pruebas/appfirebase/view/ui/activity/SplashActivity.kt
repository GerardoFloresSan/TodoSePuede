package com.pruebas.appfirebase.view.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pruebas.appfirebase.R
import com.pruebas.appfirebase.view.ui.extensions.startActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        startActivity(MainActivity::class.java)
    }
}
