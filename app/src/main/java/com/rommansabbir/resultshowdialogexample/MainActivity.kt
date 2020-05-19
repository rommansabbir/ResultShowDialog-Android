package com.rommansabbir.resultshowdialogexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rommansabbir.resultshowdialog.ResultShowDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ResultShowDialog.showDialogPrimary(
            this,
            true,
            "Success",
            "This is a dummy test, This is a dummy test, This is a dummy test ,This is a dummy test This is a dummy test This is a dummy testThis is a dummy testThis is a dummy test",
            "Done"
        ) {

            ResultShowDialog.showDialogPrimary(
                this,
                false,
                "Error",
                "This is a dummy test, This is a dummy test, This is a dummy test ,This is a dummy test This is a dummy test This is a dummy testThis is a dummy testThis is a dummy test",
                "OK"
            ) {

            }
        }
    }
}
