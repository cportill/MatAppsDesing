package com.gds0142.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast

class PrincipalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater=menuInflater
        inflater.inflate(R.menu.menu_principal, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var msg: String =""
        when(item.itemId){
            R.id.itmViaje-> msg="Viaje seleccionado"
            R.id.itmPrestamo-> msg ="Prestamo seleccionado"
            R.id.itmJuego-> msg = "Juego seleccionado"
        }
        Toast.makeText(this,msg, Toast.LENGTH_LONG).show()

        return super.onOptionsItemSelected(item)
    }
}
