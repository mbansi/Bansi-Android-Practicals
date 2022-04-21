package com.example.javakotlin.ch4WebServices.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.javakotlin.R
import com.example.javakotlin.ch4WebServices.interfaces.ApiInterface
import com.example.javakotlin.ch4WebServices.adapters.DelayedResponseAdapter
import com.example.javakotlin.ch4WebServices.User
import kotlinx.android.synthetic.main.activity_delay_response.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class DelayedResponseActivity : AppCompatActivity() {
    private lateinit var layout: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delay_response)

        layout = LinearLayoutManager(this@DelayedResponseActivity)
        recyclerView.layoutManager = layout

        getData()
        onCreateClick()
    }

    private fun onCreateClick() {
        fabCreate.setOnClickListener {
            val openCreateUserIntent = Intent(this, CreateUserActivity::class.java)
            startActivity(openCreateUserIntent)
        }
    }

    private fun getData() {

        val retrofit = Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
            .baseUrl(com.example.javakotlin.utils.BASE_URL).build()
        val data = retrofit.create(ApiInterface::class.java).getDelayedResponse()

        data.enqueue(object : Callback<User?> {
            override fun onResponse(call: Call<User?>, response: Response<User?>) {
                val response: User? = response.body()
                if (response != null) {
                    val adapter = DelayedResponseAdapter(response.data)
                    progressCircular.visibility = View.GONE
                    recyclerView.adapter = adapter
                }
            }

            override fun onFailure(call: Call<User?>, t: Throwable) {
                Toast.makeText(applicationContext, getString(R.string.toast_text_login_again), Toast.LENGTH_SHORT).show()
            }
        })
    }
}