package com.fouralabs.socialmediaui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.fouralabs.socialmediaui.R
import com.fouralabs.socialmediaui.model.PersonStory

class StoryAdapter(private val dataSet: Array<PersonStory>) :
    RecyclerView.Adapter<StoryAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageViewStoryProfile: ImageView = view.findViewById(R.id.imageViewStoryProfile)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_story, viewGroup, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        viewHolder.imageViewStoryProfile.setImageResource(dataSet[position].profilePic)
    }

    override fun getItemCount() = dataSet.size

}