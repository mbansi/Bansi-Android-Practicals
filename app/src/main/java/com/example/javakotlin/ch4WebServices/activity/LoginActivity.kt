package com.example.javakotlin.ch4WebServices.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doOnTextChanged
import com.example.javakotlin.R
import com.example.javakotlin.ch4WebServices.interfaces.ApiInterface
import com.example.javakotlin.ch4WebServices.UserModel
import com.example.javakotlin.utils.APPLICATION_JSON
import com.example.javakotlin.utils.BASE_URL
import com.example.javakotlin.utils.CONTENT_TYPE
import com.example.javakotlin.utils.POST_METHOD
import kotlinx.android.synthetic.main.activity_login.btnLogin
import kotlinx.android.synthetic.main.activity_login.etPassword
import kotlinx.android.synthetic.main.activity_login_web.*
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.lang.Exception
import java.net.HttpURLConnection
import java.net.URL

class LoginActivity : AppCompatActivity() {

    var emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_web)

        onClick()
    }

    private fun onClick() {
        etUsername.doOnTextChanged { _, _, _, _ ->
            if (!etUsername.text.toString().matches(emailPattern.toRegex())) {
                usernameInputLayout.error = getString(R.string.error_text_invalid_email)
                if (etUsername.text.toString().isEmpty()) {
                    usernameInputLayout.error = getString(R.string.error_text_email_required)
                }
            } else {
                usernameInputLayout.error = null
            }
        }
        btnLogin.setOnClickListener {
            if (validateEmail()) {
                Thread(Runnable {
                    try {
                        sendPostRequest()
                    } catch (ex: Exception) {
                        ex.printStackTrace()
                    }
                }).start()

                val openDelayResponseIntent = Intent(this, DelayedResponseActivity::class.java)
                startActivity(openDelayResponseIntent)
            }
        }

        btnLoginGson.setOnClickListener {
            val retrofit = Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL).build()
            val data = retrofit.create(ApiInterface::class.java).loginGson()
            data.enqueue(object : Callback<UserModel?> {
                override fun onResponse(call: Call<UserModel?>, response: Response<UserModel?>) {
                    Toast.makeText(applicationContext,getString(R.string.toast_text_loggged_in_gson),Toast.LENGTH_SHORT).show()
                }

                override fun onFailure(call: Call<UserModel?>, t: Throwable) {
                    Toast.makeText(applicationContext,getString(R.string.toast_text_unsuccessful),Toast.LENGTH_SHORT).show()
                }
            })
        }
    }

    private fun validateEmail(): Boolean {
        if (etUsername.text.toString().matches(emailPattern.toRegex())) {
            return true
        }
        return false
    }


    private fun sendPostRequest() {
        val credential = JSONObject()
        credential.put("username", etUsername.text)
        credential.put("password", etPassword.text)

        val url = URL(BASE_URL + com.example.javakotlin.utils.LOGIN_GSON_URL)
        with(url.openConnection() as HttpURLConnection) {

            requestMethod = POST_METHOD
            setRequestProperty(CONTENT_TYPE, APPLICATION_JSON)

            if (responseCode == 200) {
                val response: InputStream = inputStream
                val reader = BufferedReader(InputStreamReader(response))
                var line: String?
                while (reader.readLine().also { line = it } != null) {
                    println(line)
                }
            } else {
                println(errorStream)
            }

            runOnUiThread {
                if (responseCode == 200) {
                    Toast.makeText(applicationContext,  getString(R.string.toast_success), Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(applicationContext,  getString(R.string.toast_text_unsuccessful), Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}