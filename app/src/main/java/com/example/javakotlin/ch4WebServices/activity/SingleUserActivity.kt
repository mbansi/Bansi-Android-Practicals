package com.example.javakotlin.ch4WebServices.activity

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.javakotlin.R
import com.example.javakotlin.ch4WebServices.interfaces.ApiInterface
import com.example.javakotlin.ch4WebServices.SingleUser
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_single_user.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class SingleUserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_user)

        openSingleUserScreen()
    }

    private fun openSingleUserScreen() {
        val dataIntent = intent
        val id = dataIntent.getIntExtra("id", 1)

        val retrofit = Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).baseUrl(
            com.example.javakotlin.utils.BASE_URL).build()
        val data = retrofit.create(ApiInterface::class.java).getSingleUser(id)

        data.enqueue(object : Callback<SingleUser?> {
            override fun onResponse(call: Call<SingleUser?>, response: Response<SingleUser?>) {
                layout.visibility = View.VISIBLE
                val fullName = response.body()?.data?.first_name + " " + response.body()?.data?.last_name
                tvId.text = response.body()?.data?.id.toString()
                tvFullName.text = fullName
                tvEmail.text = response.body()?.data?.email.toString()
                Picasso.get().load(response.body()?.data?.avatar).resize(400, 400).into(ivAvatar)

            }

            override fun onFailure(call: Call<SingleUser?>, t: Throwable) {
                Toast.makeText(applicationContext,getString(R.string.toast_text_unsuccessful),
                    Toast.LENGTH_SHORT).show()
            }
        })
    }
}