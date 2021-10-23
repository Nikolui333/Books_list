package com.semenov.books_list.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.semenov.books_list.GeneresData
import com.semenov.books_list.R
import com.semenov.books_list.adapters.GenresAdapter
import com.semenov.books_list.databinding.ActivityGenresBinding

class GenresActivity : AppCompatActivity() {

    lateinit var binding: ActivityGenresBinding
    private var adapter = GenresAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_genres)
    }

    init {
        binding.apply {
            rvGeneres.layoutManager = LinearLayoutManager(this@GenresActivity)
            rvGeneres.adapter = adapter
            adapter.addData(GeneresData("какой-то жанр"))
            adapter.addData(GeneresData("другой жанр"))

        }
    }
}