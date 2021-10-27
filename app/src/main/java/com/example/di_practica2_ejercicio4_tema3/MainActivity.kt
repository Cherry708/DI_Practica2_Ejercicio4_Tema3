package com.example.di_practica2_ejercicio4_tema3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val listaItems = ArrayList<ShopItem>()
        listaItems.add(ShopItem(R.drawable.images, R.string.cafe0, R.string.subtitulo0))
        listaItems.add(ShopItem(R.drawable.images1, R.string.cafe1, R.string.subtitulo1))
        listaItems.add(ShopItem(R.drawable.images2, R.string.cafe2, R.string.subtitulo2))
        listaItems.add(ShopItem(R.drawable.images3, R.string.cafe3, R.string.subtitulo3))
        listaItems.add(ShopItem(R.drawable.images4, R.string.cafe4, R.string.subtitulo4))
        listaItems.add(ShopItem(R.drawable.images5, R.string.cafe5, R.string.subtitulo5))
        listaItems.add(ShopItem(R.drawable.images6, R.string.cafe6, R.string.subtitulo6))

        val recView = findViewById<RecyclerView>(R.id.rvShops)
        recView.setHasFixedSize(true)

        val adaptador = ShopItemAdapter(listaItems)
        recView.adapter = adaptador
        recView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        adaptador.onClick = {
            Toast.makeText(this,"Click",Toast.LENGTH_SHORT).show()
        }
    }
}
