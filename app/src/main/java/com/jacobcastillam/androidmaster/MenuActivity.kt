package com.jacobcastillam.androidmaster

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jacobcastillam.androidmaster.ToDoApp.ToDoActivity
import com.jacobcastillam.androidmaster.firstapp.FirstAppActivity
import com.jacobcastillam.androidmaster.imccalculator.ImcCalculatorActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        val btnSaludApp= findViewById<Button>(R.id.btnSaludApp)
        val btnIMCApp= findViewById<Button>(R.id.btnIMCApp)
        val btnToDo= findViewById<Button>(R.id.btnToDo)

        btnSaludApp.setOnClickListener{navigateToSaludApp()}
        btnIMCApp.setOnClickListener{navigateToIMCApp()}
        btnToDo.setOnClickListener { navigateToDo() }
    }
    private fun navigateToSaludApp(){
        val intent= Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToIMCApp() {
    val intent= Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToDo() {
        val intent= Intent(this,ToDoActivity::class.java)
        startActivity(intent)
    }
}