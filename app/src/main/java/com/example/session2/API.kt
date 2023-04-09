package com.example.session2

import retrofit2.http.POST

interface API {
    @POST
    fun signIn()
}