package com.example.utspratikum

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var recycle: RecyclerView
    lateinit var recycleAdapter: AdapterData
    lateinit var listData: ArrayList<DataClass>

    @SuppressLint("MissingInflatedId")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycle = findViewById(R.id.idrecycle)
        listData = ArrayList()

        val layoutManager = GridLayoutManager(this, 1)
        recycle.layoutManager = layoutManager
        recycleAdapter = AdapterData(listData, this)

        recycle.adapter = recycleAdapter
        listData.add(DataClass("Dimas Basori", "210000000001", "20 Tahun", R.drawable.gambar1))
        listData.add(DataClass("Fiola Laurent", "210000000002", "20 tahun", R.drawable.gambar2))
        listData.add(DataClass("Yohan Fadhila", "210000000003", "19 tahun", R.drawable.gambar3))
        listData.add(DataClass("Abdul Hakim", "210000000004", "21 tahun", R.drawable.gambar4))
        listData.add(DataClass("Mahfud Abdul J", "210000000005", "21 tahun", R.drawable.gambar5))
        listData.add(DataClass("Putra Eko D", "210000000006", "21 Tahun", R.drawable.gambar6))
        listData.add(DataClass("Mahendra Pradana", "210000000007", "19 tahun", R.drawable.gambar7))
        listData.add(DataClass("M. Firza ", "210000000008", "20 tahun", R.drawable.gambar8))
        listData.add(DataClass("Rizal Azzam", "210000000009", "19 tahun", R.drawable.gambar9))
        listData.add(DataClass("Alfarizqi", "210000000010", "21 tahun", R.drawable.gambar10))

        listData.add(DataClass("Iqball", "210000000011", "20 Tahun", R.drawable.gambar11))
        listData.add(DataClass("Aldi", "210000000012", "20 tahun", R.drawable.gambar12))
        listData.add(DataClass("Fandi Gema", "210000000013", "19 tahun", R.drawable.gambar13))
        listData.add(DataClass("Salsabilla", "210000000014", "21 tahun", R.drawable.gambar14))
        listData.add(DataClass("Keysya", "210000000015", "21 tahun", R.drawable.gambar15))
        listData.add(DataClass("Riska", "210000000016", "21 Tahun", R.drawable.gambar16))
        listData.add(DataClass("Alif Abian", "210000000017", "19 tahun", R.drawable.gambar17))
        listData.add(DataClass("Naya", "210000000018", "20 tahun", R.drawable.gambar18))
        listData.add(DataClass("Naila", "210000000019", "19 tahun", R.drawable.gambar19))
        listData.add(DataClass("Raihan", "210000000020", "21 tahun", R.drawable.gambar20))

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.grid ->{
                startActivity(Intent(this@MainActivity, MainActivity2::class.java))
                true
            }
            else ->return super.onOptionsItemSelected(item)
        }
        return super.onOptionsItemSelected(item)
    }
}