package com.semenov.books_list.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.semenov.books_list.GeneresData
import com.semenov.books_list.MainData
import com.semenov.books_list.R
import com.semenov.books_list.databinding.MainItemBinding

class GenresAdapter: RecyclerView.Adapter<GenresAdapter.GeneresViewHolder>() {

    val generesList = ArrayList<GeneresData>()

    class GeneresViewHolder(item: View): RecyclerView.ViewHolder(item) {
        val binding = MainItemBinding.bind(item)
        fun bind(generesData: GeneresData) = with(binding){
            mainText.text = generesData.gener
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GeneresViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.main_item, parent, false)
        return GenresAdapter.GeneresViewHolder(view)
    }

    override fun onBindViewHolder(holder: GeneresViewHolder, position: Int) {
        holder.bind(generesList[position])
    }

    override fun getItemCount(): Int {
        return generesList.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun addData(generesData: GeneresData){
        generesList.add(generesData)
        notifyDataSetChanged()
    }

}