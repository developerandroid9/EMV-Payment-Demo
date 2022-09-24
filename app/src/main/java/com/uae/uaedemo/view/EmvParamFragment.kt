package com.uae.uaedemo.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.uae.uaedemo.databinding.FragmentEmvparamBinding


import com.uae.uaedemo.viewmodel.MainViewModel
import kotlinx.coroutines.flow.collectLatest


class EmvParamFragment : Fragment() {

    private var _binding: FragmentEmvparamBinding? = null
    private val viewModel: MainViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentEmvparamBinding.inflate(inflater, container, false)
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
                    _binding?.data = it.result.data.emvParam
                    _binding?.executePendingBindings()
                    val aidListAdapter = it.result.data.emvParam.aids.let { it1 ->
                        AidListAdapter(
                            it1
                        )
                    }
                    val linearLayoutManager = LinearLayoutManager(requireContext())
                    _binding?.aidList?.layoutManager = linearLayoutManager
                    _binding?.aidList?.adapter = aidListAdapter
                    _binding?.aidList?.setHasFixedSize(false)
                    _binding?.aidList?.isNestedScrollingEnabled=false

                }

            }

        }
    }

}