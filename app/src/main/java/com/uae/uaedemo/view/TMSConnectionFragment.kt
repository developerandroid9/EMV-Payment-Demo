package com.uae.uaedemo.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.uae.uaedemo.databinding.FragmentTMSConnectionBinding
import com.uae.uaedemo.viewmodel.MainViewModel
import kotlinx.coroutines.flow.collectLatest


class TMSConnectionFragment : Fragment() {

    private var _binding: FragmentTMSConnectionBinding? = null
    private val viewModel: MainViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTMSConnectionBinding.inflate(inflater, container, false)
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
                    val tmsConnectionAdapter = it.result.data.tmsConnParam.list.let { it1 ->
                        TmsConnectionAdapter(
                            it1
                        )
                    }
                    val linearLayoutManager = LinearLayoutManager(requireContext())
                    _binding?.tmsList?.layoutManager = linearLayoutManager
                    _binding?.tmsList?.adapter = tmsConnectionAdapter
                    _binding?.tmsList?.setHasFixedSize(false)
                    _binding?.tmsList?.isNestedScrollingEnabled = false

                }

            }

        }
    }

}