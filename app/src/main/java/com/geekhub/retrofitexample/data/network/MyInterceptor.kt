package com.geekhub.retrofitexample.data.network

import okhttp3.Interceptor
import okhttp3.Response


class MyInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val newRequest = request.newBuilder()
            .header("Authorization", "My test header")
            .build()
        return chain.proceed(newRequest)
    }
}