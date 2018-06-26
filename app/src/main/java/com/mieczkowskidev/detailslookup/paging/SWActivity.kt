package com.mieczkowskidev.detailslookup.paging

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.mieczkowskidev.detailslookup.R
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class SWActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sw)

        getData()
    }

    private fun getData() {

        val retrofit = Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://swapi.co/")
                .build()

        val service = retrofit.create(SwAPI::class.java)


        val getPeople = service.getPeople(1)

    }
}
