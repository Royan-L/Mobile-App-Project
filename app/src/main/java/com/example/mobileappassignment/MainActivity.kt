package com.example.mobileappassignment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mobileappassignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Ensure enableEdgeToEdge / ViewCompat on R.id.main is removed as per practical instructions.

        binding.saveButton.setOnClickListener {
            val name = binding.tenantNameEditText.text.toString().trim()
            val phone = binding.phoneEditText.text.toString().trim()
            val rent = binding.rentEditText.text.toString().trim()

            // Try It Yourself #1: If tenant name is empty, show error and return
            if (name.isEmpty()) {
                binding.tenantNameEditText.error = "Tenant name is required"
                return@setOnClickListener
            }

            // Create Tenant instance and set to binding
            val tenant = Tenant(name, phone, rent)
            binding.tenant = tenant

            // Try It Yourself #4: Clear the input fields after saving
            binding.tenantNameEditText.text?.clear()
            binding.phoneEditText.text?.clear()
            binding.rentEditText.text?.clear()
        }
    }
}
