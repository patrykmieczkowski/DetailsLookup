package com.mieczkowskidev.detailslookup.custom_alert_dialog

import android.app.AlertDialog
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.mieczkowskidev.detailslookup.R
import com.mieczkowskidev.detailslookup.showDLog
import kotlinx.android.synthetic.main.activity_custom_dialog.*

class CustomDialogActivity : AppCompatActivity() {

    private var notesDialog: AlertDialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_dialog)

        show_dialog_button.setOnClickListener { onButtonClicked() }
    }

    private fun onButtonClicked() {
        if (notesDialog == null)
            notesDialog = showNotesAlertDialog {

                cancelable = false

                closeIconClickListener {
                    showDLog("Close")
                }

                doneIconClickListener {
                    showDLog("Done")
                }
            }
        //  and showing
        notesDialog?.show()
    }
}
