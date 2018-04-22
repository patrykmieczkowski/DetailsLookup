package com.mieczkowskidev.detailslookup.room

import android.arch.persistence.room.Room
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.mieczkowskidev.detailslookup.R
import kotlinx.android.synthetic.main.activity_room.*

class RoomActivity : AppCompatActivity() {

    var myDatabase: MyDatabase? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room)

        prepareDataForRoom()
        listeners()
    }

    private fun prepareDataForRoom() {
        val productList = ArrayList<Product>()
        productList.add(Product("rower", "http rower png"))
        productList.add(Product("hustawka", "http hustawka jpg"))
        productList.add(Product("samochod", "http samochod gif"))
        productList.add(Product("dom", "domek obraz"))

        saveDataToRoom(productList)
    }

    private fun saveDataToRoom(productList: ArrayList<Product>) {
        myDatabase = Room.databaseBuilder(applicationContext, MyDatabase::class.java, "my_database").build()

        myDatabase?.productDao()!!.insertAll(productList)
    }

    private fun listeners() {
        room_button.setOnClickListener { v -> getDataFromDb() }
    }

    private fun getDataFromDb() {

        val product = myDatabase?.productDao()!!.findByName("samochod")
        room_text.text = product.imageUrl
    }
}
