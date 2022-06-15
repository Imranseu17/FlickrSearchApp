package com.flickrSearch.image.presentration.activities


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.flickrSearch.image.R
import com.flickrSearch.image.databinding.ActivityMainBinding
import com.flickrSearch.image.usecase.BottomNavBar
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navController = findNavController(R.id.nav_host_fragment_activity_main)



        val bottomNavBar: BottomNavBar.OnBottomNavigationListener =
            BottomNavBar.OnBottomNavigationListener {
                when (it.getItemId()) {
                    R.id.restaurant_data -> {
                        navController.navigate(R.id.Photo_list_fragment)

                    }
                    R.id.restaurant_search_data -> {
                        navController.navigate(R.id.photo_list_search)
                    }


                }
                NavigationUI.onNavDestinationSelected(it, navController)
                return@OnBottomNavigationListener true
            }

        val bottomNavView: BottomNavBar = findViewById(R.id.bottom_nav_view)
        bottomNavView.setBottomNavigationListener(bottomNavBar)


    }
}
