package com.example.anew

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.FragmentTransaction

class AllLocationsFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_all_locations, container, false)

        val rentButton1 = view.findViewById<TextView>(R.id.btn_rent1)
        val rentButton2 = view.findViewById<TextView>(R.id.btn_rent2)
        val rentButton3 = view.findViewById<TextView>(R.id.btn_rent3)
        val rentButton4 = view.findViewById<TextView>(R.id.btn_rent4)
        val rentButton5 = view.findViewById<TextView>(R.id.btn_rent5)
        val rentButton6 = view.findViewById<TextView>(R.id.btn_rent6)


        rentButton1.setOnClickListener{
            openFragment(BookprocessFragment())
        }

        rentButton2.setOnClickListener{
            openFragment(BookprocessFragment())
        }

        rentButton3.setOnClickListener{
            openFragment(BookprocessFragment())
        }

        rentButton4.setOnClickListener{
            openFragment(BookprocessFragment())
        }

        rentButton5.setOnClickListener{
            openFragment(BookprocessFragment())
        }

        rentButton6.setOnClickListener{
            openFragment(BookprocessFragment())
        }
        return view
    }

    private fun openFragment(fragment: Fragment){
        val fragmentTransaction: FragmentTransaction? = fragmentManager?.beginTransaction()
        fragmentTransaction?.replace(R.id.fragment_container, fragment)
        fragmentTransaction?.commit()
    }




}