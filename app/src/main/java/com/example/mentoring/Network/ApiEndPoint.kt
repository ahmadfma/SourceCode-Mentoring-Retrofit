package com.example.mentoring.Network

import com.example.mentoring.DataFilm
import retrofit2.Call
import retrofit2.http.GET

interface api {

    @GET("newupload")
    fun getDataFilm() : Call<DataFilm>

}