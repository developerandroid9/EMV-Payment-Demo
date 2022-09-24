package com.uae.uaedemo.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import com.uae.uaedemo.databinding.FragmentNOLParamBinding
import com.uae.uaedemo.viewmodel.MainViewModel
import kotlinx.coroutines.flow.collectLatest


class NOLParamFragment : Fragment() {
    private var _binding: FragmentNOLParamBinding? = null
    private val viewModel: MainViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        _binding = FragmentNOLParamBinding.inflate(inflater, container, false)
        return _binding?.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lifecycleScope.launchWhenStarted {
            viewModel.uiState.collectLatest {
                if (it.isLoading) {
                    _binding?.progressBar?.visibility = View.VISIBLE
                } else if (it.error != null) {
                    _binding?.progressBar?.visibility = View.GONE
                    //show error
                } else if (it.result != null) {
                    _binding?.progressBar?.visibility = View.GONE
                    _binding?.data = it.result.data.paramNOL
                    _binding?.executePendingBindings()

                }

            }

        }
    }
}