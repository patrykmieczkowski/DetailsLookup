package com.mieczkowskidev.detailslookup

import android.util.Log

/**
 * Created by Patryk Mieczkowski on 06.05.2018
 */
fun Any.showVLog(log: String) = Log.v(this::class.java.simpleName, log)

fun Any.showELog(log: String) = Log.e(this::class.java.simpleName, log)

fun Any.showDLog(log: String) = Log.d(this::class.java.simpleName, log)

fun Any.showILog(log: String) = Log.i(this::class.java.simpleName, log)

fun Any.showWLog(log: String) = Log.w(this::class.java.simpleName, log)