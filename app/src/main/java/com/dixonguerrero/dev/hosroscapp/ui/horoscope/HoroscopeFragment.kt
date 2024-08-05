package com.dixonguerrero.dev.hosroscapp.ui.horoscope

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dixonguerrero.dev.hosroscapp.R
import com.dixonguerrero.dev.hosroscapp.databinding.FragmentHoroscopeBinding


class HoroscopeFragment : Fragment() {

    private var _binding : FragmentHoroscopeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHoroscopeBinding.inflate(inflater, container, false)

        // Inflate the layout for this fragment
        return binding.root
    }


}