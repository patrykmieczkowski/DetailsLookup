package com.mieczkowskidev.detailslookup.paging

import io.reactivex.Single
import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Patryk Mieczkowski on 19.06.2018
 */
interface SwAPI {

    @GET("people/")
    fun getPeople(@Query("page") page: Int): Single<ResponseBody>
}