package com.example.javakotlin.bottomnavigation.expandable

internal object ListData {
    val data: HashMap<String, List<String>>
    get() {
        val expandableListDetail = HashMap<String, List<String>>()
        val movieNameCaptainAmerica: MutableList<String> = ArrayList()
        movieNameCaptainAmerica.add("Steve Rogers")
        movieNameCaptainAmerica.add("Avengers")
        movieNameCaptainAmerica.add("First Appearance : 1941")

        val movieNameIronMan: MutableList<String> = ArrayList()
        movieNameIronMan.add("Tony Stark")
        movieNameIronMan.add("Avengers")
        movieNameIronMan.add("First Appearance : 1963")

        val movieNameWolvarine: MutableList<String> = ArrayList()
        movieNameWolvarine.add("James Howlett")
        movieNameWolvarine.add("X-Men")
        movieNameWolvarine.add("First Appearance : 1974")

        expandableListDetail["Captain America"] = movieNameCaptainAmerica
        expandableListDetail["Iron Man"] = movieNameIronMan
        expandableListDetail["Wolvarine"] = movieNameWolvarine

        return expandableListDetail
    }
}