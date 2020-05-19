package com.rommansabbir.resultshowdialog

import android.app.Activity
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.content_result_dialog_primary.*

object ResultShowDialog {

    fun showDialogPrimary(
        activity: Activity,
        isSuccess: Boolean = true,
        title: String = "Success",
        message: String = "",
        actionButtonText: String = "Done",
        onAction: () -> Unit
    ) {
        val dialog = getDialogInstance(activity)
        dialog.dialog_action_view.setBackgroundResource(if (isSuccess) R.drawable.circular_shape_success else R.drawable.circular_shape_error)
        dialog.dialog_action_view.setImageDrawable(
            if (isSuccess) ContextCompat.getDrawable(
                activity,
                R.drawable.ic_check_white_24dp
            ) else ContextCompat.getDrawable(activity, R.drawable.ic_close_white_24dp)
        )
        dialog.dialog_action_button.setBackgroundResource(if (isSuccess) R.drawable.background_success_button else R.drawable.background_error_button)
        dialog.dialog_action_title.text = title
        dialog.dialog_action_message.text = message
        dialog.dialog_action_button.text = actionButtonText
        dialog.dialog_action_button.setOnClickListener {
            dialog.cancel()
            onAction.invoke()
        }
        dialog.show()
    }

    private fun getDialogInstance(activity: Activity): Dialog {
        val dialog = Dialog(activity)
        dialog.setContentView(R.layout.content_result_dialog_primary)
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.setCanceledOnTouchOutside(false)
        return dialog
    }
}