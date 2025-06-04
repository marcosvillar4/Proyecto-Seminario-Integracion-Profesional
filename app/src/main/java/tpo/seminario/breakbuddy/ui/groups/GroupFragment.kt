package tpo.seminario.breakbuddy.ui.groups

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import tpo.seminario.breakbuddy.R

class GroupsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_groups, container, false)

        val createGroupButton = view.findViewById<Button>(R.id.btnCreateGroup)
        createGroupButton.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_groups_to_createGroupFragment)
        }

        // AGREGAR ESTA LÍNEA - findViewById para btnViewAllGroups
        val btnViewAllGroups = view.findViewById<Button>(R.id.btnViewAllGroups)
        btnViewAllGroups.setOnClickListener {
            findNavController().navigate(R.id.action_groupsFragment_to_groupsListFragment)
        }

        val btnJoinGroup = view.findViewById<Button>(R.id.btnJoinGroup)
        btnJoinGroup.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_group_to_joinGroupFragment)
        }

        return view
    }
}