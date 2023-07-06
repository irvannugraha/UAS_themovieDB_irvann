package com.example.uas_themoviedb_yurifa.services

import com.example.uas_themoviedb_yurifa.models.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=90815fba49dc64faccc22cbef96a0934")
    fun getMovieList(): Call<MovieResponse>
}