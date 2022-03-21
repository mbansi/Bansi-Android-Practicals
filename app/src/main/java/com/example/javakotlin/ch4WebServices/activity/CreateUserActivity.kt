package com.example.javakotlin.ch4WebServices.activity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_create_user.*
import org.json.JSONObject
import java.lang.Exception
import java.net.HttpURLConnection
import java.net.URL
import com.example.javakotlin.R
import com.example.javakotlin.utils.APPLICATION_JSON
import com.example.javakotlin.utils.CONTENT_TYPE

class CreateUserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_user)

        onClick()
    }

    private fun onClick() {
        etName.doOnTextChanged { _, _, _, _ ->
            if (etName.text.toString().isEmpty()) {
                nameInputLayout.error = getString(R.string.error_text_enter_name)
            } else {
                nameInputLayout.error = null
            }
        }
        etJob.doOnTextChanged { _, _, _, _ ->
            if (etJob.text.toString().isEmpty()) {
                jobInputLayout.error = getString(R.string.error_text_enter_job)
            } else {
                jobInputLayout.error = null
            }
        }
        btnCreate.setOnClickListener {
            Thread(Runnable {
                try {
                    createUserRequest()
                } catch (ex: Exception) {
                    ex.printStackTrace()
                }
            }).start()
        }
    }

    private fun createUserRequest() {
        val credential = JSONObject()
        credential.put("name", etName.text)
        credential.put("job", etJob.text)

        val url = URL(com.example.javakotlin.utils.CREATE_USER_URL)
        with(url.openConnection() as HttpURLConnection) {
            requestMethod = com.example.javakotlin.utils.POST_METHOD
            setRequestProperty(CONTENT_TYPE, APPLICATION_JSON)

            if (responseCode == 201) {
                val response = inputStream.bufferedReader().use {
                    it.readText()
                }
                val jsonObject = JSONObject(response)
                val name = jsonObject.getString("name")
                val job = jsonObject.getString("job")
                val id = jsonObject.getString("id")
                val createdAt = jsonObject.getString("createdAt")
                val message = getString(R.string.dialog_message,id,name,job,createdAt)
                runOnUiThread {
                    displayDialog(message)
                    Toast.makeText(applicationContext, getString(R.string.toast_success), Toast.LENGTH_SHORT).show()
                }
            } else {
                println(errorStream)
            }
        }
    }

    private fun displayDialog(message: String) {
        val builder = AlertDialog.Builder(this)
        builder.setTitle(getString(R.string.dialog_text_user_created))
        builder.setMessage(message)

        builder.setPositiveButton(getString(R.string.dialog_text_ok)) { _, _ ->
            Toast.makeText(applicationContext, getString(R.string.dialog_text_welcome), Toast.LENGTH_LONG).show()
        }

        val alertDialog: AlertDialog = builder.create()
        alertDialog.setCancelable(false)
        alertDialog.show()
    }
}
