package com.example.addressrecycler.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.example.addressrecycler.R
import com.example.addressrecycler.model.AreaCommonBean
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_select_city.view.*

class CityAdapter(
    private val mContext: Context,
    private val mData: List<AreaCommonBean>
) : RecyclerView.Adapter<CityAdapter.Holder>() {

    private var onSelectListener: ((AreaCommonBean) -> Unit)? = null

    var mAreaId = ""
    private var mSelectedPos = -1//实现单选 变量保存当前选中的position

    fun setOnSelectListener(onSelectListener: ((AreaCommonBean) -> Unit)) {
        this.onSelectListener = onSelectListener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val inflaterView =
            LayoutInflater.from(mContext).inflate(R.layout.item_select_city, parent, false)
        return Holder(inflaterView)
    }

    override fun getItemCount(): Int {
        return mData.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val bean = mData[position]
        holder.itemView.item_select_city_text.text = bean.areaName

        holder.itemView.lv_item_select_city.setOnClickListener {
            Toast.makeText(mContext, "${bean.areaName}", Toast.LENGTH_SHORT).show()
            mSelectedPos = holder.adapterPosition
            mAreaId = bean.areaId
            onSelectListener?.invoke(bean)
            notifyDataSetChanged()
        }

        if (mAreaId == "" && position == 0) {
            holder.itemView.iv_select.isVisible = true
            holder.itemView.item_select_city_text.setTextColor(mContext.getColor(R.color.colorAccent))
        } else {
            if (bean.areaId == mAreaId) {
                holder.itemView.iv_select.isVisible = true
                holder.itemView.item_select_city_text.setTextColor(mContext.getColor(R.color.colorAccent))
            } else {
                holder.itemView.iv_select.isVisible = false
                holder.itemView.item_select_city_text.setTextColor(mContext.getColor(R.color.colorText_44))
            }
        }
    }


    class Holder(override val containerView: View?) : RecyclerView.ViewHolder(containerView!!),
        LayoutContainer

}