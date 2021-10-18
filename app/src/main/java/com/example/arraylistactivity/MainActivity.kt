package com.example.arraylistactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var etNames : EditText
    lateinit var btAdd : Button
    lateinit var etNum : EditText
    lateinit var btGet : Button
    lateinit var showName : TextView

    lateinit var names : ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNames = findViewById(R.id.etNames)
        btAdd = findViewById(R.id.btAdd)
        etNum = findViewById(R.id.etNum)
        btGet = findViewById(R.id.btGet)
        showName = findViewById(R.id.showName)

        names = ArrayList()

        btAdd.setOnClickListener {
        try {

            names.add(etNames.text.toString())
            btAdd.clearFocus()
        }
        catch (e : Exception){
            Toast.makeText(this, "please enter a name" , Toast.LENGTH_LONG).show()
        }
        }

        btGet.setOnClickListener {
            try {
                val number = etNum.text.toString().toInt()
                showName.text = names.get(number)
                btAdd.clearFocus()
            }
            catch (e : NumberFormatException){
                Toast.makeText(this, "please enter a number" , Toast.LENGTH_LONG).show()
            }
        }
    }
}