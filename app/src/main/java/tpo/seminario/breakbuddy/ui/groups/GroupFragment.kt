package tpo.seminario.breakbuddy.ui.groups

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import tpo.seminario.breakbuddy.R

class GroupsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_groups, container, false)

        val createGroupButton = view.findViewById<View>(R.id.btnCreateGroup)
        createGroupButton.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_groups_to_createGroupFragment)
        }

        return view
    }
}