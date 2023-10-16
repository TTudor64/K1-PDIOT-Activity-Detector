package com.example.k1pdiotactivitydetector.ui.recording

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import com.example.k1pdiotactivitydetector.databinding.FragmentRecordingBinding
import com.example.k1pdiotactivitydetector.R

class RecordingFragment : Fragment() {

    private var _binding: FragmentRecordingBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val recordingViewModel =
            ViewModelProvider(this).get(RecordingViewModel::class.java)

        _binding = FragmentRecordingBinding.inflate(inflater, container, false)
        val root: View = binding.root

        root.findViewById<Button>(R.id.button3).setOnClickListener {
            findNavController().navigate(R.id.action_to_upload)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}