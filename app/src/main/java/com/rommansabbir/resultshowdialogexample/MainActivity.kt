package com.rommansabbir.resultshowdialogexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rommansabbir.resultshowdialog.ResultShowDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * It's easy to show the dialog. It follows The Builder Pattern
         */
        val result = ResultShowDialog.Companion.Builder()
            //Default: True
            .setIsSuccess(false)
            //Default: Successful
            .setTitle("Test Successful")
            //Default: Your task was completed successfully
            .setMessage("This is just a custom message")
            //Default: OK
            .setActionButtonText("Okay")
            //return an instance of ResultShowDialog by providing the activity context
            .build(this)

        result.show {
            /*
            This callback is invoked when user press the action button.
            Do your stuff here.
             */
        }
    }
}
