package com.example.quotes

//import okhttp3.Response

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST

interface QuoteApi {
    @GET("random")
    suspend fun getRandomQuote() : Response<List<QuoteModel>>

    @GET("today")
    suspend fun getTodayQuote() : Response<List<QuoteModel>>

//    @POST
}