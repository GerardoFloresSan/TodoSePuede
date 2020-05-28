package com.pruebas.appfirebase.view.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pruebas.appfirebase.R
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        emailNew.setText("gerardo.gabriel.flores@gmail.com")

        btn_saveData.setOnClickListener {

        }
    }
}
