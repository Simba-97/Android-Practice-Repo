package com.example.practiceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addContactDialog = AlertDialog.Builder(this)
            .setTitle("Add contact")
            .setMessage("Do you want to add Mr. to your contacts list")
            .setIcon(R.drawable.ic_personadd)
            .setPositiveButton("Yes") { _, _ ->
                Toast.makeText(this, "You added Mr. to your contacts", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("No") { _, _ ->
                Toast.makeText(this, "You dont like Mr. right?", Toast.LENGTH_SHORT).show()
            }.create()

        findViewById<Button>(R.id.btn1).setOnClickListener {
            addContactDialog.show()
        }
    }
}