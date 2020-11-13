package com.rommansabbir.resultshowdialog

import android.app.Activity
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.content_result_dialog_primary.*

/*
Copyright (C) 2020 Romman Sabbir

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
class ResultShowDialog private constructor() {
    companion object {
        private var mActivity: Activity? = null
        private var mIsSuccess: Boolean = true
        private var mTitle: String = "Success"
        private var mMessage: String = "Task was completed successfully"
        private var mActionButtonText: String = "OK"

        class Builder {
            fun withActivity(activity: Activity): Builder {
                mActivity = activity
                return this
            }

            fun setIsSuccess(isSuccess: Boolean): Builder {
                mIsSuccess = isSuccess
                return this
            }

            fun setTitle(title: String): Builder {
                mTitle = title
                return this
            }

            fun setMessage(message: String): Builder {
                mMessage = message
                return this
            }

            fun setActionButtonText(actionButtonText: String): Builder {
                mActionButtonText = actionButtonText
                return this
            }

            @Throws(Exception::class)
            fun build(): ResultShowDialog {
                if (mActivity == null) {
                    throw (Exception("Activity is required"))
                }
                return ResultShowDialog()
            }
        }
    }

    fun show(onAction: () -> Unit) {
        val dialog = getDialogInstance(mActivity!!)
        dialog.dialog_action_view.setBackgroundResource(if (mIsSuccess) R.drawable.circular_shape_success else R.drawable.circular_shape_error)
        dialog.dialog_action_view.setImageDrawable(
                if (mIsSuccess) ContextCompat.getDrawable(
                        mActivity!!,
                        R.drawable.ic_check_white_24dp
                ) else ContextCompat.getDrawable(mActivity!!, R.drawable.ic_close_white_24dp)
        )
        dialog.dialog_action_button.setBackgroundResource(if (mIsSuccess) R.drawable.background_success_button else R.drawable.background_error_button)
        dialog.dialog_action_title.text = mTitle
        dialog.dialog_action_message.text = mMessage
        dialog.dialog_action_button.text = mActionButtonText
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
        dialog.setCancelable(false)
        return dialog
    }
}