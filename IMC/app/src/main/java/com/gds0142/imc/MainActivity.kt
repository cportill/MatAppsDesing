package com.gds0142.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        private val SPLASH_TIME_OUT:Long=5000

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animacion: Animation=AnimationUtils.loadAnimation(this, R.anim.animacion)
        txtUno.startAnimation(animacion)

        Handler().postDelayed({
            startActivity(Intent(this, PrincipalActivity::class.java))
            finish()
        }, SPLASH_TIME_OUT)

    }
}
