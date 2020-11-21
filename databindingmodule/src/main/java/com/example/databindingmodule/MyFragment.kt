package com.example.databindingmodule

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.databindingmodule.databinding.FragmentDataBinding

/**
 * Created by shenshiqiang.ex.
 * Date: 2020/10/29 9:34
 * Description:
 */
class MyFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentDataBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false)
        binding.user = User("李", "四")
        return binding.root
    }
}