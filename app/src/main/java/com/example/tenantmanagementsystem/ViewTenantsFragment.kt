package com.example.tenantmanagementsystem

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.tenantmanagementsystem.databinding.FragmentViewTenantsBinding

class ViewTenantsFragment : Fragment() {

    // _binding can be null (no view yet, or view destroyed)
    private var _binding: FragmentViewTenantsBinding? = null

    // binding is a shortcut we only use while the view exists
    private val binding get() = _binding!!

    // Build this screen's view from its layout XML
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentViewTenantsBinding.inflate(inflater, container, false)
        return binding.root // hand the view to the NavHost to display
    }

    // The view now exists: set text, add click listeners
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // For now, hide the "Just added" section.
        // Practical 3 shows it when a tenant is passed in.
        binding.newTenantGroup.visibility = View.GONE

        val tenants = TenantRepository.tenants
        if (tenants.isEmpty()) {
            binding.allTenantsTextView.text = "No tenants yet. Add one from the Dashboard."
        } else {
            binding.allTenantsTextView.text = tenants.joinToString("\n\n") { it.summary() }
        }
    }

    // The view is destroyed: let go of it
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
