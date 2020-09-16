package com.movehome.armoving

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.movehome.armoving.ArcoreMeasurement


class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        val button = findViewById<Button>(R.id.btn_submit)
        button.setOnClickListener {
<<<<<<< HEAD
            val intent = Intent(this, ArcoreMeasurement::class.java)
=======
            val intent = Intent(this, MeasuringActivity::class.java)
>>>>>>> eec795d70d535bd0eab3e1d0c2ca38291b94db0f
            startActivity(intent)
        }
    }
}
