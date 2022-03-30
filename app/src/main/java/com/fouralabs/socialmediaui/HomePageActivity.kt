package com.fouralabs.socialmediaui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomePageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
        initialize()
    }

    private fun initialize() {
        replaceFG(HomeFragment())
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNavigationHomePage)
        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.pageHome -> {
                    replaceFG(HomeFragment())
                    true
                }
                R.id.pageProfile -> {
                    replaceFG(ProfileFragment())
                    true
                }
                R.id.pageMessages -> {
                    startConversations()
                    true
                }
                else -> false
            }
        }
    }

    private fun replaceFG(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fContainerViewMA, fragment)
        fragmentTransaction.commit()
    }

    private fun startConversations() {
        val intent = Intent(this, ConversationsActivity::class.java)
        startActivity(intent)
    }

    private fun startProfile() {
        val intent = Intent(this, ProfileActivity::class.java)
        startActivity(intent)
    }
}