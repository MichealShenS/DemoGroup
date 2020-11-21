package com.example.databindingmodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil.setContentView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.databindingmodule.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private val userList = ArrayList<User>()

    private val fragment = MyFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = setContentView(this, R.layout.activity_main)
        binding.user = User("张", "三")
        binding.age = Age("20")
        userList.add(User("张", "三"))
        userList.add(User("李", "四"))
        userList.add(User("王", "五"))

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        rlUserRecycler.layoutManager = layoutManager
        val adapter = MyRecyclerAdapter(userList)
        rlUserRecycler.adapter = adapter

        supportFragmentManager.beginTransaction().add(R.id.fr_layout, fragment).commit()
    }

    fun refreshData(view: View) {
        binding.user = User("李", "四")
        binding.age = Age("40")
    }
}
