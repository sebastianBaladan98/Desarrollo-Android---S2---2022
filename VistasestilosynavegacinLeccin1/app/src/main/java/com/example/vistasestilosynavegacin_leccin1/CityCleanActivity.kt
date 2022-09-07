package com.example.vistasestilosynavegacin_leccin1

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.vistasestilosynavegacin_leccin1.databinding.ActivityCityCleanBinding

class CityCleanActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCityCleanBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_city_clean)
        binding = ActivityCityCleanBinding.inflate( layoutInflater )
        setContentView( binding.root )
        binding.emailTextView.text = intent.extras!!.get("email").toString()

        binding.goBackButton.setOnClickListener {
            val builder = AlertDialog.Builder( this)
            builder.setTitle("Volver")
            builder.setMessage("¿Está seguro de que desea volver?")
            builder.setPositiveButton(
                "Volver",
                DialogInterface.OnClickListener { dialogInterface, i -> finish() }
            )
            builder.setNegativeButton(
                "Cancelar",
                DialogInterface.OnClickListener { dialogInterface, i ->  }
            )
            builder.show()
        }
    }
}