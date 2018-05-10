package com.mieczkowskidev.detailslookup.custom_alert_dialog

import android.app.Activity
import android.app.AlertDialog
import android.app.Fragment

/**
 * Created by Patryk Mieczkowski on 06.05.2018
 */

inline fun Activity.showNotesAlertDialog(func: NotesDialogHelper.() -> Unit): AlertDialog =
        NotesDialogHelper(this).apply {
            func()
        }.create()

inline fun Fragment.showNotesAlertDialog(func: NotesDialogHelper.() -> Unit): AlertDialog =
        NotesDialogHelper(this.activity!!).apply {
            func()
        }.create()
