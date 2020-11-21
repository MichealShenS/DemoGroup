package com.example.zhifbrecyclerviewmodule.utils

import androidx.recyclerview.widget.DiffUtil
import com.example.zhifbrecyclerviewmodule.model.MenuItemAppBean

/**
 * Created by shenshiqiang.ex.
 * Date: 2020/11/3 14:04
 * Description:
 */
class MyDiffCallBack(
    private val oldData: List<MenuItemAppBean>,
    private val newData: List<MenuItemAppBean>
) : DiffUtil.Callback() {

    // 判断Item是否已经存在
    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldData[oldItemPosition].name == newData[newItemPosition].name
    }

    override fun getOldListSize() = oldData.size
    override fun getNewListSize() = newData.size

    // 如果Item已经存在则会调用此方法，判断Item的内容是否一致
    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldData[oldItemPosition].name == newData[newItemPosition].name
    }
}