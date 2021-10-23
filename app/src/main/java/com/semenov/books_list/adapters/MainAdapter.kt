package com.semenov.books_list.adapters

import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.semenov.books_list.MainData
import com.semenov.books_list.R
import com.semenov.books_list.activity.GenresActivity
import com.semenov.books_list.databinding.MainItemBinding

class MainAdapter: RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    val mainList = ArrayList<MainData>()

    class MainViewHolder(item: View): RecyclerView.ViewHolder(item) {
        val binding = MainItemBinding.bind(item)
        fun bind(mainData: MainData) = with(binding){
            mainText.text = mainData.name
        }
        item.setOnClickListener(
        object : View.OnClickListener {
            override fun onClick(v: View) {
                val position: Int = getAdapterPosition()
                val context = v.context
                val intent = Intent(context, GenresActivity::class.java)
                intent.putExtra("main_key", mainList.get(position).getMovie())
                context.startActivity(intent)
            }
        })
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.main_item, parent, false)
        return MainViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(mainList[position])
    }

    override fun getItemCount(): Int {
        return mainList.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun addData(mainData: MainData){
        mainList.add(mainData)
        notifyDataSetChanged()
    }
}