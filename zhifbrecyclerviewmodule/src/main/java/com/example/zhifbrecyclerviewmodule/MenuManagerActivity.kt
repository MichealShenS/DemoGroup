package com.example.zhifbrecyclerviewmodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.zhifbrecyclerviewmodule.adapter.MenuAdapter
import com.example.zhifbrecyclerviewmodule.adapter.MenuGridItemAdapter
import com.example.zhifbrecyclerviewmodule.model.MenuItemAppBean
import com.example.zhifbrecyclerviewmodule.utils.DataManager
import com.example.zhifbrecyclerviewmodule.utils.MyDiffCallBack
import com.example.zhifbrecyclerviewmodule.utils.SpaceItemDecoration
import kotlinx.android.synthetic.main.activity_menu_manager.*

class MenuManagerActivity : AppCompatActivity() {

    private lateinit var myAppAdapter: MenuGridItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_manager)
        initMyApp()
        initAllApp()

    }

    private fun initMyApp() {
        myAppAdapter = MenuGridItemAdapter(this)
        myAppAdapter.setData(DataManager.myAppList)
        rv_my_app.layoutManager = GridLayoutManager(this, 5)
        rv_my_app.addItemDecoration(SpaceItemDecoration(5, 50, false))
        rv_my_app.adapter = myAppAdapter

        myAppAdapter.setOnSelectedListener {
            refreshAdapter(false, it)
        }

    }

    private fun initAllApp() {
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        rv_all_app.layoutManager = layoutManager
        val allAppAdapter = MenuAdapter(this, DataManager.menuBaseList)
        rv_all_app.adapter = allAppAdapter
    }

    fun addItemData(item: MenuItemAppBean) {
        refreshAdapter(true, item)
    }

    private fun refreshAdapter(isAdd: Boolean, item: MenuItemAppBean) {
        val oldData = myAppAdapter.dataList
        if (isAdd) {
            if (!DataManager.myAppList.contains(item)) {
                DataManager.myAppList.add(item)
            }
        } else {
            DataManager.myAppList.remove(item)
        }
        val result =
            DiffUtil.calculateDiff(MyDiffCallBack(oldData, DataManager.myAppList), true)
        myAppAdapter.setData(DataManager.myAppList)
        result.dispatchUpdatesTo(myAppAdapter)
    }

}