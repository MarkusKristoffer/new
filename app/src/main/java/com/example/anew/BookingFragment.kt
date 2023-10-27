package com.example.anew

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.FragmentTransaction


class BookingFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_booking, container, false)

        val textView1 = view.findViewById<TextView>(R.id.home_d1_view)
        val textView2 = view.findViewById<TextView>(R.id.home_d2_view)
        val textView3 = view.findViewById<TextView>(R.id.home_d3_view)
        val textView4 = view.findViewById<TextView>(R.id.home_d4_view)

        textView1.setOnClickListener{
            openFragment(BookprocessFragment())
        }

        textView2.setOnClickListener{
            openFragment(BookprocessFragment())
        }

        textView3.setOnClickListener{
            openFragment(BookprocessFragment())
        }

        textView4.setOnClickListener{
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