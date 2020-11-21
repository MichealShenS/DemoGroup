package com.example.addressrecycler.adapter

import android.content.Context
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.addressrecycler.R
import com.example.addressrecycler.databinding.ItemSelectDataBinding
import com.example.addressrecycler.model.AreaCommonBean
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_select_city.view.*

/**
 * Created by shenshiqiang.ex.
 * Date: 2020/10/19 15:01
 * Description:
 */
open class AreaBaseRecycleAdapter(
    private val mContext: Context/*,
    private val mData: List<AreaCommonBean>,
    private val areaType: Int*/
) : RecyclerView.Adapter<AreaBaseRecycleAdapter.ViewHolder>() {

    lateinit var mData: List<AreaCommonBean>
    private var areaType = 0
    private var mSelectAreaName = ""

    fun initData(mData: List<AreaCommonBean>, areaType: Int, selectAreaName: String) {
        this.mData = mData
        this.areaType = areaType
        this.mSelectAreaName = selectAreaName
    }

//    protected lateinit var onSelectListener1: OnSelectLister
//
//    interface OnSelectLister {
//        fun onSelectListener(areaCommonBean: AreaCommonBean)
//    }


    private var onSelectListener: ((AreaCommonBean) -> Unit)? = null

    //    var mAreaId = ""

    private var mSelectedPos = -1//实现单选 变量保存当前选中的position

    fun setOnSelectListener(onSelectListener: ((AreaCommonBean) -> Unit)) {
        this.onSelectListener = onSelectListener
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val inflaterView =
            LayoutInflater.from(mContext).inflate(R.layout.item_select_city, parent, false)
        return ViewHolder(inflaterView)
    }

    override fun getItemCount(): Int {
        return mData.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val bean = mData[position]
        holder.bind(bean)
//        holder.itemView.item_select_city_text.text = bean.areaName

        holder.itemView.lv_item_select_city.setOnClickListener {
//            Toast.makeText(mContext, "${bean.areaName}", Toast.LENGTH_SHORT).show()
            mSelectedPos = holder.adapterPosition
//            mAreaId = bean.areaId
            mSelectAreaName = bean.areaName
            onSelectListener?.invoke(bean)
            notifyDataSetChanged()
        }

        if (!TextUtils.isEmpty(mSelectAreaName)) {
            if (bean.areaName == mSelectAreaName) {
                holder.itemView.iv_select.isVisible = true
                holder.itemView.item_select_city_text.setTextColor(mContext.getColor(R.color.colorBlack))
            } else {
                holder.itemView.iv_select.isVisible = false
                holder.itemView.item_select_city_text.setTextColor(mContext.getColor(R.color.color_text_31))
            }
        } else {
            holder.itemView.iv_select.isVisible = false
            holder.itemView.item_select_city_text.setTextColor(mContext.getColor(R.color.color_text_31))
        }

//        if (mAreaId == "" && position == 0) {
//            holder.itemView.iv_select.isVisible = true
//            holder.itemView.item_select_city_text.setTextColor(mContext.getColor(R.color.colorAccent))
//        } else {
//            if (bean.areaId == mAreaId) {
//                holder.itemView.iv_select.isVisible = true
//                holder.itemView.item_select_city_text.setTextColor(mContext.getColor(R.color.colorAccent))
//            } else {
//                holder.itemView.iv_select.isVisible = false
//                holder.itemView.item_select_city_text.setTextColor(mContext.getColor(R.color.colorText_44))
//            }
//        }
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val binding: ItemSelectDataBinding = DataBindingUtil.bind(view)!!

        fun bind(bean: AreaCommonBean) {
            binding.areaBean = bean
        }
    }


//    inner class Holder(override val containerView: View?) :
//        RecyclerView.ViewHolder(containerView!!),
//        LayoutContainer


}