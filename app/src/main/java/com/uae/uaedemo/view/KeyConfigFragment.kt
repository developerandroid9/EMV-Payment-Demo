package com.uae.uaedemo.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.uae.uaedemo.databinding.FragmentKeyConfigBinding
import com.uae.uaedemo.viewmodel.MainViewModel
import kotlinx.coroutines.flow.collectLatest


class KeyConfigFragment : Fragment() {

    private var _binding: FragmentKeyConfigBinding? = null
    private val viewModel: MainViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentKeyConfigBinding.inflate(inflater, container, false)
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
                    val keyValueAdapter =
                        it.result.data.KeyValueConfigParam.parmKeyConfigList.let { it1 ->
                            KeyValueAdapter(
                                it1
                            )
                        }
                    val linearLayoutManager = LinearLayoutManager(requireContext())
                    _binding?.keyConfigList?.layoutManager = linearLayoutManager
                    _binding?.keyConfigList?.adapter = keyValueAdapter
                    _binding?.keyConfigList?.setHasFixedSize(false)
                    _binding?.keyConfigList?.isNestedScrollingEnabled = false

                }

            }

        }
    }


}