package com.ornek.mobilprogramlamaodevi

import android.content.Intent
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

buton.setOnClickListener {
    val  intent = Intent (this, HakkimdaActivity::class.java)
    startActivity(intent)
}

        setSupportActionBar(toolbar)









    }




}