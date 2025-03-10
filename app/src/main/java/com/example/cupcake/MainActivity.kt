/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.cupcake

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

/**
 * Activity for cupcake order flow.
 */
const val COLUMNS = 5

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Retrieve NavController from the NavHostFragment
//        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
//        navController = navHostFragment.navController

        // Set up the action bar for use with the NavController
//        setupActionBarWithNavController(navController)
        setContent {
            val width = resources.displayMetrics.run { widthPixels / density }
            val size = width.div(COLUMNS).dp
            CustomLayout(
                COLUMNS
            ) {
                Image(
                    modifier = Modifier.size(size),
                    painter = painterResource(R.drawable.cupcake),
                    contentDescription = ""
                )
                Image(
                    modifier = Modifier.size(size),
                    painter = painterResource(R.drawable.cupcake),
                    contentDescription = ""
                )
                Image(
                    modifier = Modifier.size(size),
                    painter = painterResource(R.drawable.cupcake),
                    contentDescription = ""
                )
                Image(
                    modifier = Modifier.size(size),
                    painter = painterResource(R.drawable.cupcake),
                    contentDescription = ""
                )
                Image(
                    modifier = Modifier.size(size),
                    painter = painterResource(R.drawable.cupcake),
                    contentDescription = ""
                )
                Image(
                    modifier = Modifier.size(size),
                    painter = painterResource(R.drawable.cupcake),
                    contentDescription = ""
                )
                Image(
                    modifier = Modifier.size(size),
                    painter = painterResource(R.drawable.cupcake),
                    contentDescription = ""
                )
                Image(
                    modifier = Modifier.size(size),
                    painter = painterResource(R.drawable.cupcake),
                    contentDescription = ""
                )
            }
        }
    }

    /**
     * Handle navigation when the user chooses Up from the action bar.
     */
    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}