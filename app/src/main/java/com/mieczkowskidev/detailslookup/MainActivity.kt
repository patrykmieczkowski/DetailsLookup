package com.mieczkowskidev.detailslookup

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.mieczkowskidev.detailslookup.constraint.ConstraintExample
import com.mieczkowskidev.detailslookup.custom_alert_dialog.CustomDialogActivity
import com.mieczkowskidev.detailslookup.room.RoomActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        private val TAG = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate()")
        showDLog("onCreate")

        setListeners()
    }

    private fun setListeners() {

        main_button_room.setOnClickListener {

            val intent = Intent(this, RoomActivity::class.java)
            startActivity(intent)
        }

        main_button_room.setOnClickListener {

            val intent = Intent(this, ConstraintExample::class.java)
            startActivity(intent)
        }

        main_button_alert_dialog.setOnClickListener {

            val intent = Intent(this, CustomDialogActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()

        Log.d(TAG, "onStart()")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)

        Log.d(TAG, "onRestoreInstanceState()")
    }

    override fun onResume() {
        super.onResume()

        showVLog("resume")
        Log.d(TAG, "onResume()")
    }

    override fun onPause() {
        super.onPause()

        Log.d(TAG, "onPause()")
    }

    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {
        super.onSaveInstanceState(outState, outPersistentState)

        Log.d(TAG, "onSaveInstanceState()")
    }

    override fun onStop() {
        super.onStop()

        Log.d(TAG, "onStop()")
    }

    override fun onRestart() {
        super.onRestart()

        Log.d(TAG, "onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d(TAG, "onDestroy()")
    }
}
