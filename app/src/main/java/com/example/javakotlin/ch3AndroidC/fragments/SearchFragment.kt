package com.example.javakotlin.ch3AndroidC.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.javakotlin.R
import com.example.javakotlin.ch3AndroidC.adapters.ExpandableRecyclerAdapter
import com.example.javakotlin.ch3AndroidC.viewmodels.MovieModel
import kotlinx.android.synthetic.main.fragment_search.*

class SearchFragment : Fragment() {

    private var movieList = ArrayList<MovieModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_search, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = ExpandableRecyclerAdapter(setData())
        rvMovies.layoutManager = LinearLayoutManager(context)
        rvMovies.adapter = adapter
    }

    private fun setData(): ArrayList<MovieModel> {
        movieList.add(MovieModel("Steve Rogers", "Captain America", "Avengers", "1941"))
        movieList.add(MovieModel("Iron Man", "Tony Stark", "Avengers", "1963"))
        movieList.add(MovieModel("Wolvarine", "James Howlett", "X-Men", "1974"))
        movieList.add(MovieModel("Spiderman", "Peter Parker", "Avengers", "1962"))
        movieList.add(MovieModel("Thor", "Thor Odinson", "Avengers", "1962"))
        movieList.add(MovieModel("Steve Rogers", "Captain America", "Avengers", "1941"))
        movieList.add(MovieModel("Iron Man", "Tony Stark", "Avengers", "1963"))
        movieList.add(MovieModel("Wolvarine", "James Howlett", "X-Men", "1974"))
        movieList.add(MovieModel("Spiderman", "Peter Parker", "Avengers", "1962"))
        movieList.add(MovieModel("Thor", "Thor Odinson", "Avengers", "1962"))
        movieList.add(MovieModel("Steve Rogers", "Captain America", "Avengers", "1941"))
        movieList.add(MovieModel("Iron Man", "Tony Stark", "Avengers", "1963"))
        movieList.add(MovieModel("Wolvarine", "James Howlett", "X-Men", "1974"))
        movieList.add(MovieModel("Spiderman", "Peter Parker", "Avengers", "1962"))
        movieList.add(MovieModel("Thor", "Thor Odinson", "Avengers", "1962"))
        return movieList
    }
}