package com.codingstuff.loginandsignup

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.codingstuff.loginandsignup.databinding.ActivitySignUpBinding
import com.codingstuff.loginandsignup.databinding.ActivityStudentHomeBinding
import com.google.firebase.auth.FirebaseAuth


class StudentHome : AppCompatActivity() {

    private lateinit var binding: ActivityStudentHomeBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityStudentHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.imageButton.setOnClickListener()
        {
            val intent = Intent(this, RegisterRoom::class.java)
            startActivity(intent)
        }

        binding.imageButton2.setOnClickListener()
        {
            val intent = Intent(this, UploadSlip::class.java)
            startActivity(intent)
        }

        binding.imageButton2.setOnClickListener()
        {
            val intent = Intent(this, AddComments::class.java)
            startActivity(intent)
        }

        binding.imageButton2.setOnClickListener()
        {
            val intent = Intent(this, ViewAnnouncements::class.java)
            startActivity(intent)
        }
    }
}