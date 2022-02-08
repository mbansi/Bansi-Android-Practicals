package com.example.javakotlin.bottomnavigation.expandable

data class MovieModel(val name: String?, val realName : String? ,
                 val team : String?,
                 var firstAppearance : String?, var expand: Boolean = false)