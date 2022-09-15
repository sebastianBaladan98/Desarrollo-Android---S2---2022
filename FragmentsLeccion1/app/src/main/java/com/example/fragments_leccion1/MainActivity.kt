package com.example.fragments_leccion1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragments_leccion1.databinding.ActivityMainBinding
import com.example.fragments_leccion1.fragments.FirstQuestionFragment
import com.example.fragments_leccion1.fragments.HelpFragment
import com.example.fragments_leccion1.fragments.MainFragment
import com.example.fragments_leccion1.fragments.SecondQuestionFragment

class MainActivity : AppCompatActivity(), MainFragment.MainFragmentListener, FirstQuestionFragment.FirstQuestionFragmentListener {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate( layoutInflater )
        setContentView( binding.root )

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val fragment = MainFragment()
        fragmentTransaction.add( R.id.container, fragment )

        fragmentTransaction.commit()

    }

    override fun deployHelpFragment() {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val fragment = HelpFragment()
        fragmentTransaction.add( R.id.container, fragment )

        fragmentTransaction.commit()
    }

    override fun deployFirstQuestionFragment() {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val fragment = FirstQuestionFragment()
        fragmentTransaction.add( R.id.container, fragment )

        fragmentTransaction.commit()
    }

    override fun deployLastQuestionFragment() {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val fragment = SecondQuestionFragment()
        fragmentTransaction.add( R.id.container, fragment )

        fragmentTransaction.commit()
    }


}