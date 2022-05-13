package com.example.food.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.food.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private var _mBinding: FragmentHomeBinding? = null
    private val mBinding: FragmentHomeBinding get() = _mBinding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {

        _mBinding = FragmentHomeBinding.inflate(layoutInflater, container, false)

        return mBinding.root
    }

    override fun onDestroy() {
        _mBinding = null
        super.onDestroy()
    }
}