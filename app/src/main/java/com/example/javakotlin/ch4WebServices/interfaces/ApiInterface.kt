package com.example.javakotlin.ch4WebServices.interfaces

import com.example.javakotlin.ch4WebServices.SingleUser
import com.example.javakotlin.ch4WebServices.User
import com.example.javakotlin.ch4WebServices.UserModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ApiInterface {
    @GET(com.example.javakotlin.utils.DELAYED_RESPONSE)
    fun getDelayedResponse(): Call<User>

    @GET(com.example.javakotlin.utils.SINGLE_USER_URL)
    fun getSingleUser(@Path("id") id: Int): Call<SingleUser>

    @POST(com.example.javakotlin.utils.LOGIN_GSON_URL)
    fun loginGson() : Call<UserModel>
}