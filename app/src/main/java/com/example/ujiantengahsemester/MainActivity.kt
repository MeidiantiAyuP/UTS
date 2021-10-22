package com.example.ujiantengahsemester

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var btnPilih : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnPilih= findViewById(R.id.button4)
    }
    override fun onContextItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menu_add -> {
                Snackbar.make(btnPilih,"Anda memilih: Add",
                    Snackbar.LENGTH_LONG).show()
            }
            R.id.menu_edit -> {
                Snackbar.make(btnPilih,"Anda memilih: Edit",
                    Snackbar.LENGTH_LONG).show()
            }
            R.id.menu_delete -> {
                Snackbar.make(btnPilih,"Anda memilih: Delete",
                    Snackbar.LENGTH_LONG).show()
            }
        }
        return super.onContextItemSelected(item)
    }
}