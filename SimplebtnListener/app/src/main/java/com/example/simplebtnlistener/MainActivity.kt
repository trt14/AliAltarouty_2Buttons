package com.example.simplebtnlistener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.simplebtnlistener.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnid.setOnClickListener {
            Toast.makeText(this, "This is Button used (setOnClickListener) ", Toast.LENGTH_LONG).show()
        }
    }



    fun ClickBtn(view: android.view.View) {
        Toast.makeText(this, "This is Button used (OnClick in xml)", Toast.LENGTH_LONG).show()
    }
}
