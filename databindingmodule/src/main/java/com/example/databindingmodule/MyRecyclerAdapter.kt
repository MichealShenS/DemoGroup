package com.example.databindingmodule

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.databindingmodule.databinding.UserItemBinding

/**
 * Created by shenshiqiang.ex.
 * Date: 2020/10/29 9:17
 * Description:
 */
class MyRecyclerAdapter(private val userList: List<User>) :
    RecyclerView.Adapter<MyRecyclerAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val binding: UserItemBinding = DataBindingUtil.bind(view)!!

        fun bind(user: User) {
            binding.user = user
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.user_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user = userList[position]
        holder.bind(user)
    }
}