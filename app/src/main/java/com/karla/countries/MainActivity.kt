package com.karla.countries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.karla.countries.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val countryList = CountryList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSearch.setOnClickListener {
            searchCountry(binding.editTextNameCountry.text.toString())
        }
    }

    private fun searchCountry(countryName : String) {
        val country = countryList.getCountry()
        val countryFind = country.find { it.name == countryName }

        if (countryFind != null) {
            val mensaje = "Latitud: ${countryFind.lat}, Longitud: ${countryFind.lon}"
            binding.textViewResults.setText(mensaje).toString()
        } else {
            Toast.makeText(this, "El país no se encontró", Toast.LENGTH_SHORT).show()
        }

    }
}