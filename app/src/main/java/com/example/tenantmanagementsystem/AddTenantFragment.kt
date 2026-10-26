package com.example.tenantmanagementsystem

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
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
        // saveButton <- android:id="@+id/saveButton" in fragment_add_tenant.xml
        binding.saveButton.setOnClickListener {
            // Read the three EditTexts in fragment_add_tenant.xml
            val name = binding.tenantNameEditText.text.toString().trim()
            val phone = binding.phoneEditText.text.toString().trim()
            val rent = binding.rentEditText.text.toString().trim()

            if (name.isEmpty() || phone.isEmpty() || rent.isEmpty()) {
                // A Fragment is not a Context, so ask for the one it's attached to
                Toast.makeText(requireContext(), "Please fill in all fields", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val tenant = Tenant(name, phone, rent)

            // Add to the shared list (the Dashboard and View Tenants read it)
            TenantRepository.addTenant(tenant)

            // SAFE ARGS: this function was generated from the <action> in
            // nav_graph.xml. Because View Tenants has an <argument> of type
            // Tenant, we hand the tenant over here: a wrong type won't compile
            val action = AddTenantFragmentDirections
                .actionAddTenantFragmentToViewTenantsFragment(tenant)

            // Ask the NavController to follow the action
            findNavController().navigate(action)
        }
    }

    // The view is destroyed: let go of it
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
