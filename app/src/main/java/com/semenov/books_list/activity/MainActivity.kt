package com.semenov.books_list.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.semenov.books_list.MainData
import com.semenov.books_list.R
import com.semenov.books_list.adapters.MainAdapter
import com.semenov.books_list.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val adapter = MainAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init() {
        binding.apply {
            rvMain.layoutManager = LinearLayoutManager(this@MainActivity)
            rvMain.adapter = adapter
           // var books_list: ArrayList<String> = arrayListOf<String>("Художенственные", "Разивающие", "Учебные")
/*            val mainData_list: ArrayList<MainData> = arrayListOf()
                mainData_list.add(MainData("Художенственные"))
                mainData_list.add(MainData("Разивающие"))
                mainData_list.add(MainData("Учебные"))*/

/*            var mainData = MainData("Художенственные")
                mainData = MainData("Разивающие")
                mainData = MainData("Учебные")*/
            adapter.addData(MainData("Художенственные"))
            adapter.addData(MainData("Разивающие"))
            adapter.addData(MainData("Учебные"))

        }
    }
}