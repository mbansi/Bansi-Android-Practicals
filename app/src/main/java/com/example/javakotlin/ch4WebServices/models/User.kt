package com.example.javakotlin.ch4WebServices

import com.google.gson.annotations.SerializedName

data class User(
    val data: List<Data>,
    val page: Int,
    val per_page: Int,
    val support: Support,
    val total: Int,
    val total_pages: Int
)

data class Support(
    val text: String,
    val url: String
)

data class Data(
    val avatar: String,
    val email: String,
    val first_name: String,
    val id: Int,
    val last_name: String
)

data class SingleUser(
    val data: Data,
    val support: Support
)

data class UserModel(
    @SerializedName("email")
    val emailID: String,
    @SerializedName("password")
    val password: String
)