package com.fouralabs.socialmediaui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fouralabs.socialmediaui.adapter.HomeAdapter
import com.fouralabs.socialmediaui.adapter.StoryAdapter
import com.fouralabs.socialmediaui.model.PersonHome
import com.fouralabs.socialmediaui.model.PersonStory

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        load(view)
        return view
    }

    private fun load(view: View){
        val dennis = PersonHome("Dennis", R.drawable.img_dennis_profile)
        val charlie = PersonHome("Charlie", R.drawable.img_charlie_profile)
        val persons = arrayOf(dennis, charlie)
        val homeAdapter = HomeAdapter(persons)
        val recyclerViewHome = view.findViewById<RecyclerView>(R.id.recyclerViewHomePage)
        recyclerViewHome.adapter = homeAdapter

        val story1 = PersonStory(R.drawable.img_story1)
        val story2 = PersonStory(R.drawable.img_story2)
        val story3 = PersonStory(R.drawable.img_story3)
        val story4 = PersonStory(R.drawable.img_story4)
        val stories = arrayOf(story1, story2, story3, story4)
        val recyclerViewHomePageStory = view.findViewById<RecyclerView>(R.id.recyclerViewHomePageStory)
        val storyAdapter = StoryAdapter(stories)
        recyclerViewHomePageStory.adapter = storyAdapter
        val horizontalLayout = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        recyclerViewHomePageStory.layoutManager = horizontalLayout

    }
}