package com.fouralabs.socialmediaui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.fouralabs.socialmediaui.adapter.ConversationAdapter
import com.fouralabs.socialmediaui.model.PersonConversation

class ConversationsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conversations)
        load()
    }

    private fun load(){
        val malena = PersonConversation("Malena Tudi", R.drawable.img_malena_profile, "Hey, how’s it goin?")
        val jakob = PersonConversation("Jakob Curtis", R.drawable.img_jakob_profile, "Yo, are you going to the Jake’s wedding?")
        val abram = PersonConversation("Abram Levin", R.drawable.img_abram_profile, "Amir said we’d be staying over for a while... but ...")
        val marilyn = PersonConversation("Marilyn Herwitz", R.drawable.img_marilyn_profile, "hey, i got new memes for you")
        val desirae = PersonConversation("Desirae Saris", R.drawable.img_desirae_profile, "GoT really took a nose dive huh")
        val persons = arrayOf(malena, jakob, abram, marilyn, desirae)
        val adapter = ConversationAdapter(persons)
        val recyclerViewCAConversations = findViewById<RecyclerView>(R.id.recyclerViewCAConversations)
        recyclerViewCAConversations.adapter = adapter

        findViewById<ImageView>(R.id.imageViewCABackButton).setOnClickListener{
            finish()
        }
        findViewById<ImageView>(R.id.imageViewCAMessageButton).setOnClickListener{
            val intent = Intent(this, MessageActivity::class.java)
            startActivity(intent)
        }
    }
}