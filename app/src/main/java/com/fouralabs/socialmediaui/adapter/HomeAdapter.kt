package com.fouralabs.socialmediaui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.fouralabs.socialmediaui.R
import com.fouralabs.socialmediaui.model.PersonHome

class HomeAdapter(private val dataSet: Array<PersonHome>) :
    RecyclerView.Adapter<HomeAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textViewCHName: TextView = view.findViewById(R.id.textViewCHName)
        val imageViewCHProfile: ImageView = view.findViewById(R.id.imageViewCHProfile)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_card_homepage, viewGroup, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        viewHolder.textViewCHName.text = dataSet[position].name
        viewHolder.imageViewCHProfile.setImageResource(dataSet[position].profilePic)
    }

    override fun getItemCount() = dataSet.size

}