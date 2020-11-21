package com.example.zhifbrecyclerviewmodule.adapter

import android.content.Context
import android.graphics.Rect
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.zhifbrecyclerviewmodule.MenuManagerActivity
import com.example.zhifbrecyclerviewmodule.R
import com.example.zhifbrecyclerviewmodule.model.MenuBaseBean
import com.example.zhifbrecyclerviewmodule.utils.DataManager
import com.example.zhifbrecyclerviewmodule.utils.MyDiffCallBack
import com.example.zhifbrecyclerviewmodule.utils.MyViewHolder
import com.example.zhifbrecyclerviewmodule.utils.SpaceItemDecoration
import kotlinx.android.synthetic.main.menu_item_layout.view.*

/**
 * Created by shenshiqiang.ex.
 * Date: 2020/11/2 15:49
 * Description:
 */
class MenuAdapter(
    private val mContext: Context,
    private val menuBaseBeanList: List<MenuBaseBean>
) :
    RecyclerView.Adapter<MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.menu_item_layout, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return menuBaseBeanList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data = menuBaseBeanList[position]
        holder.itemView.tv_menu_title.text = data.name

        val itemGridAdapter = MenuGridItemAdapter(mContext)
        itemGridAdapter.setData(data.itemList)
        holder.itemView.rv_menu_item.layoutManager = GridLayoutManager(mContext, 5)
        holder.itemView.rv_menu_item.addItemDecoration(SpaceItemDecoration(5, 50, false))
        holder.itemView.rv_menu_item.adapter = itemGridAdapter

        itemGridAdapter.setOnSelectedListener {
            if (mContext is MenuManagerActivity) {
                mContext.addItemData(it)
            }
        }

    }


}