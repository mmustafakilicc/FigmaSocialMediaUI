package com.fouralabs.socialmediaui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.fouralabs.socialmediaui.R
import com.fouralabs.socialmediaui.model.PersonConversation

class ConversationAdapter(private val dataSet: Array<PersonConversation>) :
    RecyclerView.Adapter<ConversationAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textViewCIName: TextView = view.findViewById(R.id.textViewCIName)
        val imageViewCIProfile: ImageView = view.findViewById(R.id.imageViewCIProfile)
        val textViewCILastMessage: TextView = view.findViewById(R.id.textViewCILastMessage)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_conversation, viewGroup, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        viewHolder.textViewCIName.text = dataSet[position].name
        viewHolder.imageViewCIProfile.setImageResource(dataSet[position].profilePic)
        viewHolder.textViewCILastMessage.text = dataSet[position].lastMessage
    }

    override fun getItemCount() = dataSet.size

}