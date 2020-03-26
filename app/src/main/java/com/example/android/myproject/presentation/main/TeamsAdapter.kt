package com.example.android.myproject.presentation.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android.myproject.R
import com.example.android.myproject.network.model.Team
import kotlinx.android.synthetic.main.item_view_team.view.*

class TeamsAdapter(private var items: List<Team> = listOf()): RecyclerView.Adapter<TeamsAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view_team, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val team = items[position]

        holder.bind(team)
    }

    override fun getItemCount(): Int = items.size

    fun setItems(list: List<Team>){
        items = list
        notifyDataSetChanged()
    }

    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view) {

        fun bind(team: Team){
            itemView.apply {
                teamName.text = team.teamName
                description.text = team.strDescriptionEN
            }
        }
    }
}