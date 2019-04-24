package com.mgtic.dapm.proyectofinal

import android.support.v7.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragment = MenuFragment()
      // supportFragmentManager.beginTransaction().add(R.id.fragment_container,fragment).commit()

        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        transaction.setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
        transaction.replace(R.id.fragment_container,fragment)
        transaction.addToBackStack("menu")
        transaction.commit()

    }
}
