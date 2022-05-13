package com.example.food.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.food.R
import com.example.food.databinding.FragmentDashboardBinding
import com.example.food.databinding.FragmentNotificationBinding

class NotificationFragment : Fragment() {
    private var _mBinding: FragmentNotificationBinding? = null
    private val mBinding: FragmentNotificationBinding get() = _mBinding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {

        _mBinding = FragmentNotificationBinding.inflate(layoutInflater, container, false)

        return mBinding.root
    }

    override fun onDestroy() {
        _mBinding = null
        super.onDestroy()
    }
}