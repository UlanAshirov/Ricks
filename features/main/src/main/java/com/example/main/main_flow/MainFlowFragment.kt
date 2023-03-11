package com.example.main.main_flow

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.core.base.BaseFragment
import com.example.main.R
import com.example.main.databinding.FragmentMainFlowBinding

class MainFlowFragment: BaseFragment<FragmentMainFlowBinding, MainFlowViewModel>(R.layout.fragment_main_flow) {

    override val binding: FragmentMainFlowBinding by viewBinding(FragmentMainFlowBinding::bind)
    override val viewModel: MainFlowViewModel by viewModels()

}