package com.example.wearostest1

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import android.widget.TextView
import com.example.wearostest1.databinding.ActivityStartedBinding

class StartedActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityStartedBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d("StartedActivity", "I'm here!")

        val idPasien = intent?.extras?.getString("idPasien").toString()
        if(idPasien.isNotEmpty()){
            binding.root.findViewById<TextView>(R.id.id_pasien).text = idPasien
        }

        binding.root.findViewById<LinearLayout>(R.id.universe).setOnClickListener {
            Log.d("StartedActivity", "Restarting...")
            val context = binding.root.context

            val intent = Intent(context, MainActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun onPause() {
        Log.d("StartedActivity", "onPause")
        super.onPause()
    }

    override fun onDestroy() {
        Log.d("StartedActivity", "onDestroy")
        super.onDestroy()
    }
}