package com.example.assignment2

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class ExampleDialogFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return MaterialAlertDialogBuilder(requireContext())
            .setTitle("Thank you!")
            .setMessage("Item not Found in Our Playlist!")
            .setPositiveButton("Back") { dialog, _ ->
                dialog.dismiss()
            }
            .create()
    }
}
