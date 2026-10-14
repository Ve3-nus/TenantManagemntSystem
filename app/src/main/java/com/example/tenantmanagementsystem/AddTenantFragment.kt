package com.example.tenantmanagementsystem

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.tenantmanagementsystem.databinding.FragmentAddTenantBinding

class AddTenantFragment : Fragment() {

    // _binding can be null (no view yet, or view destroyed)
    private var _binding: FragmentAddTenantBinding? = null

    // binding is a shortcut we only use while the view exists
    private val binding get() = _binding!!

    // Build this screen's view from its layout XML
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAddTenantBinding.inflate(inflater, container, false)
        return binding.root // hand the view to the NavHost to display
    }

    // The view now exists: set text, add click listeners
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // The SAVE button is added in Practical 3
    }

    // The view is destroyed: let go of it
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
