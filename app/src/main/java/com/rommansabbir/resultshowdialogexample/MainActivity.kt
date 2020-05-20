package com.rommansabbir.resultshowdialogexample

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rommansabbir.resultshowdialog.ResultShowDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /**
         * To show the result show dialog just call [ResultShowDialog.showDialogPrimary]
         *
         * @param activity, [Activity] reference
         * @param isSuccess, Show dialog for success result or error result
         * @param title, Provide title for the result show dialog
         * @param message, Provide a message for the result show dialog
         * @param actionButtonText, Provide own text for the action button
         *
         * Get notified about action button event by Kotlin's Higher Order Function
         */
        ResultShowDialog.showDialogPrimary(
            this,
            true,
            "Success",
            "This is a dummy test, This is a dummy test, This is a dummy test ,This is a dummy test This is a dummy test This is a dummy testThis is a dummy testThis is a dummy test",
            "Done"
        ) {
            //Do your stuff here
        }
    }
}
