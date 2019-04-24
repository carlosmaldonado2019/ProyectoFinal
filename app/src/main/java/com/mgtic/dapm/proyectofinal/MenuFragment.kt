package com.mgtic.dapm.proyectofinal

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.fragment_menu.*

class MenuFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View
        view = inflater!!.inflate(R.layout.fragment_menu,container,false)
        val txt: TextView
        txt  = view!!.findViewById(R.id.txtDescripcion)
        txt.setOnClickListener { v: View? ->

            val fragment = DescripcionFragment()
            val manager = fragmentManager
            val transaction = manager!!.beginTransaction()
            transaction.setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
            transaction.replace(R.id.fragment_container,fragment)
              transaction.addToBackStack("descripcion")
            transaction.commit()
        }
        return view
        //return inflater!!.inflate(R.layout.fragment_menu, container, false)


    }
}