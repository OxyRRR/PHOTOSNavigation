package com.example.photos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class SecondFragment : Fragment() {

    lateinit var button2: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button2 = view.findViewById(R.id.button2)
        button2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_secondFragment2_to_thirdFragment2)
        }
    }
}