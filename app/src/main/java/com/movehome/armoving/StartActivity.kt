package com.movehome.armoving

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
<<<<<<< HEAD
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
=======
<<<<<<< HEAD
import com.movehome.armoving.ArcoreMeasurement

=======
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
>>>>>>> 0063abe9180bc47b02d4e35f57c7c7bd851cd55e
>>>>>>> 9c9c14e62f40179208aad2a60f4f0b50314cc800

class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        val button = findViewById<Button>(R.id.btn_submit)
        val BTN_living = findViewById<Button>(R.id.btn_living)
        val BTN_kitchen = findViewById<Button>(R.id.btn_kitchen)
        val BTN_bath = findViewById<Button>(R.id.btn_bath)
        val BTN_reading = findViewById<Button>(R.id.btn_reading)
        val etMessage = findViewById(R.id.custom) as EditText
<<<<<<< HEAD

        BTN_living.setOnClickListener {
            val editText = findViewById(R.id.custom) as EditText
            editText.setText("客廳", TextView.BufferType.EDITABLE)
            editText.setTextColor(Color.BLACK)
        }

        BTN_kitchen.setOnClickListener {
            val editText = findViewById(R.id.custom) as EditText
            editText.setText("廚房", TextView.BufferType.EDITABLE)
            editText.setTextColor(Color.BLACK)
        }

=======
<<<<<<< HEAD
        button.setOnClickListener {
<<<<<<< HEAD
<<<<<<< HEAD
            val intent = Intent(this, ArcoreMeasurement::class.java)
=======
            val intent = Intent(this, MeasuringActivity::class.java)
>>>>>>> eec795d70d535bd0eab3e1d0c2ca38291b94db0f
=======
            val intent = Intent(this, MeasuringActivity::class.java)
>>>>>>> 0063abe9180bc47b02d4e35f57c7c7bd851cd55e
            startActivity(intent)
        }

        BTN_living.setOnClickListener {
            val editText = findViewById(R.id.custom) as EditText
            editText.setText("客廳", TextView.BufferType.EDITABLE)
            editText.setTextColor(Color.BLACK)
        }

        BTN_kitchen.setOnClickListener {
            val editText = findViewById(R.id.custom) as EditText
            editText.setText("廚房", TextView.BufferType.EDITABLE)
            editText.setTextColor(Color.BLACK)
        }

=======

        BTN_living.setOnClickListener {
            val editText = findViewById(R.id.custom) as EditText
            editText.setText("客廳", TextView.BufferType.EDITABLE)
            editText.setTextColor(Color.BLACK)
        }

        BTN_kitchen.setOnClickListener {
            val editText = findViewById(R.id.custom) as EditText
            editText.setText("廚房", TextView.BufferType.EDITABLE)
            editText.setTextColor(Color.BLACK)
        }

>>>>>>> dd41ffa0144c8bc6cca38f47de041dcd5155d4c9
>>>>>>> 9c9c14e62f40179208aad2a60f4f0b50314cc800
        BTN_bath.setOnClickListener {
            val editText = findViewById(R.id.custom) as EditText
            editText.setText("浴室", TextView.BufferType.EDITABLE)
            editText.setTextColor(Color.BLACK)
        }

        BTN_reading.setOnClickListener {
            val editText = findViewById(R.id.custom) as EditText
            editText.setText("書房", TextView.BufferType.EDITABLE)
            editText.setTextColor(Color.BLACK)
        }
        button.setOnClickListener{
            //read value from EditText to a String variable
            val msg: String = etMessage.text.toString()

            //check if the EditText have values or not
            if(msg.trim().length>0) {
<<<<<<< HEAD
                val intent = Intent(this, MainActivity::class.java)
=======
<<<<<<< HEAD
                val intent = Intent(this, MeasuringActivity::class.java)
=======
                //passing value to the next page
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("Page", msg)
>>>>>>> dd41ffa0144c8bc6cca38f47de041dcd5155d4c9
>>>>>>> 9c9c14e62f40179208aad2a60f4f0b50314cc800
                startActivity(intent)
            }else{
                Toast.makeText(applicationContext, "請輸入所在位置! ", Toast.LENGTH_SHORT).show()
            }
        }


    }
}
