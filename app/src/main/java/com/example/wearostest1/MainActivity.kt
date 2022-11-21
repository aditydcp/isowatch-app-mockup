package com.example.wearostest1

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.wearostest1.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.root.findViewById<Button>(R.id.button).setOnClickListener {
            Log.d("MainActivity", "Button Clicked")
            val context = binding.root.context

            val intent = Intent(context, StartedActivity::class.java)
            intent.putExtra("idPasien", "02")
            context.startActivity(intent)
        }
    }

    override fun onPause() {
        Log.d("MainActivity", "onPause")
        super.onPause()
    }

    override fun onDestroy() {
        Log.d("MainActivity", "onDestroy")
        super.onDestroy()
    }
}