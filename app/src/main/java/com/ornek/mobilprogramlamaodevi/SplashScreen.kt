package com.ornek.mobilprogramlamaodevi

import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.net.NetworkInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts

class SplashScreen : AppCompatActivity() {

var context : Context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        if (checkConnection(context)) {
            Toast.makeText(this,"İnternete Bağlandı",Toast.LENGTH_LONG).show()

        }  else {
            Toast.makeText(this,"İnternete bağlı değilsiniz",Toast.LENGTH_LONG).show()
            onDestroy()
        }

        loadSplashScreen()
    }

    private fun loadSplashScreen() {
       Handler().postDelayed({
           startActivity(Intent(this, MainActivity::class.java))
       },3000)
    }


    fun checkConnection(context: Context):Boolean{
        val connectivityManager : ConnectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager


        val networkInfo : NetworkInfo? = connectivityManager.activeNetworkInfo
        return networkInfo != null && networkInfo.isConnected


    }


}
