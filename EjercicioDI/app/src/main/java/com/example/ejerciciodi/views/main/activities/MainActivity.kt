package com.example.ejerciciodi.views.main.activities

import android.os.Bundle
import android.widget.SearchView.OnQueryTextListener
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ejerciciodi.adapters.MonstersAdapter
import com.example.ejerciciodi.databinding.ActivityMainBinding
import com.example.ejerciciodi.di.viewModel.MainViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity() : AppCompatActivity() {

    private val viewModel by viewModel<MainViewModel>()

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.getMonsters().observe(
            this
        ) { monsters ->
            run {
                binding.monstersRecycleView.layoutManager =
                    LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
                val adapter = MonstersAdapter(this.supportFragmentManager, monsters)
                binding.monstersRecycleView.adapter = adapter
                binding.searchView.setOnQueryTextListener(object : OnQueryTextListener {
                    override fun onQueryTextSubmit(query: String?): Boolean {
                        return this.onQueryTextChange(query)
                    }

                    override fun onQueryTextChange(newText: String?): Boolean {
                        adapter.filter.filter(newText)
                        return true
                    }
                })
            }
        }
    }
}