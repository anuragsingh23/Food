package com.example.food.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.food.R
import com.example.food.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

        private var _mBinding : FragmentDashboardBinding? = null
        private val mBinding : FragmentDashboardBinding get() = _mBinding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {

        _mBinding = FragmentDashboardBinding.inflate(layoutInflater,container,false)

        return mBinding.root
    }

    override fun onDestroy() {
        _mBinding = null
        super.onDestroy()
    }


}