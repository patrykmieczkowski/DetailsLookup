package com.mieczkowskidev.detailslookup.custom_alert_dialog

import android.app.AlertDialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.View

/**
 * Created by Patryk Mieczkowski on 06.05.2018
 */
abstract class BaseDialogHelper {

    abstract val dialogView: View
    abstract val builder: AlertDialog.Builder

    //  required bools
    open var cancelable: Boolean = true
    open var isBackGroundTransparent: Boolean = true

    //  dialog
    open var dialog: AlertDialog? = null

    //  dialog create
    open fun create(): AlertDialog {
        dialog = builder
                .setCancelable(cancelable)
                .create()

        //  very much needed for customised dialogs
        if (isBackGroundTransparent)
            dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        return dialog!!
    }

    //  cancel listener
    open fun onCancelListener(func: () -> Unit): AlertDialog.Builder? =
            builder.setOnCancelListener {
                func()
            }
}