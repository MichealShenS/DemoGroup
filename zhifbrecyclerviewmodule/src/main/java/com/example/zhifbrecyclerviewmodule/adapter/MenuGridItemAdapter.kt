package com.example.zhifbrecyclerviewmodule.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.zhifbrecyclerviewmodule.R
import com.example.zhifbrecyclerviewmodule.model.MenuItemAppBean
import com.example.zhifbrecyclerviewmodule.utils.MyViewHolder
import kotlinx.android.synthetic.main.menu_grid_item_layout.view.*

/**
 * Created by shenshiqiang.ex.
 * Date: 2020/11/2 15:56
 * Description:
 */
class MenuGridItemAdapter(
    private val mContext: Context/*,
    private val list: List<MenuItemAppBean>*/
) : RecyclerView.Adapter<MyViewHolder>() {

    lateinit var dataList: List<MenuItemAppBean>

    fun setData(list: List<MenuItemAppBean>) {
        this.dataList = ArrayList<MenuItemAppBean>(list)
    }

    private var onSelectedListener: ((MenuItemAppBean) -> Unit)? = null

    fun setOnSelectedListener(onSelectedListener: ((MenuItemAppBean) -> Unit)) {
        this.onSelectedListener = onSelectedListener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.menu_grid_item_layout, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount() = dataList.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data = dataList[position]
        holder.itemView.iv_app_icon.setBackgroundResource(data.icon)
        holder.itemView.tv_app_name.text = data.name
        holder.itemView.setOnClickListener {
            Toast.makeText(mContext, data.name, Toast.LENGTH_SHORT).show()
            onSelectedListener?.invoke(data)
        }
    }
}