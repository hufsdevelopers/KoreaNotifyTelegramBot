package org.hufsdevelopers.koreanotifybot.api

import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class SafeKoreaApiClient {
    val api: SafeKoreaApi

    init {
        val retrofit = Retrofit.Builder()
                .baseUrl("http://mepv2.safekorea.go.kr/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .build()
        api = retrofit.create(SafeKoreaApi::class.java)
    }
}