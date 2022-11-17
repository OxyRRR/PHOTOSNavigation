package com.example.photos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class ThirdFragment : Fragment() {

    lateinit var button3: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button3 = view.findViewById(R.id.button3)
        button3.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_thirdFragment2_to_mainActivity)
        }
    }
}