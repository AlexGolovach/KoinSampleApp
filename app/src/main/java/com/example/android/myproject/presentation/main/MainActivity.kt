package com.example.android.myproject.presentation.main

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager.VERTICAL
import com.example.android.myproject.R
import com.example.android.myproject.network.NetworkStatus
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val userViewModel: TeamViewModel by viewModel()
    private lateinit var teamsAdapter: TeamsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
        loadTeams()
    }

    private fun initRecyclerView() {
        teamsAdapter = TeamsAdapter()

        val context = recyclerView.context

        recyclerView.apply {
            layoutManager = LinearLayoutManager(context, VERTICAL, false)
            addItemDecoration(DividerItemDecoration(context, VERTICAL))
            setHasFixedSize(true)
            adapter = teamsAdapter
        }
    }

    private fun loadTeams() {
        userViewModel.getTeamList()

        userViewModel.state.observe(this, Observer {
            when(it) {
                is NetworkStatus.Loading -> {
                    Toast.makeText(this, "Start", Toast.LENGTH_SHORT).show()
                }
                is NetworkStatus.Success -> {
                    teamsAdapter.setItems(it.response.teams)
                }
                is NetworkStatus.Error -> {
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show()
                }
            }
        })
    }
}
