package com.example.addressselectormodule.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.example.addressselectormodule.R
import com.example.addressselectormodule.utils.PinYinComparator
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_select_city.view.*

/**
 * Created by shenshiqiang.ex.
 * Date: 2020/10/14 15:21
 * Description:
 */
class CityAdapter(
    private val mContext: Context,
    private val mData: List<PinYinComparator.ProvinceBean>
) : RecyclerView.Adapter<CityAdapter.Holder>() {

    private var onSelectListener: ((Pair<String, String>) -> Unit)? = null

    val HAS_STICKY_VIEW = 1
    val NONE_STICKY_VIEW = 2

    var mAreaId = ""
    private var position = 0 //记录当前下标
    private var mSelectedPos = -1//实现单选 变量保存当前选中的position

    fun setOnSelectListener(onSelectListener: ((Pair<String, String>) -> Unit)) {
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
//        val data = mData[position]
//        with(data){
//
//        }

        holder.itemView.item_select_city_text.text = mData[position].areaName
        val selection = mData[position].sortLetter.first()
        val letterPosition = getPositionForSelection(selection.toInt())

        if (letterPosition == position) {
            holder.itemView.item_letter_text.text = mData[position].sortLetter
            holder.itemView.item_letter_text.isVisible = true
            holder.itemView.tag = HAS_STICKY_VIEW
        } else {
            holder.itemView.item_letter_text.isVisible = false
            holder.itemView.tag = NONE_STICKY_VIEW
        }

        holder.itemView.contentDescription = mData[position].sortLetter

        holder.itemView.lv_item_select_city.setOnClickListener {
            Toast.makeText(mContext, "${mData[position].areaName}", Toast.LENGTH_SHORT).show()
            mSelectedPos = holder.adapterPosition
            mAreaId = mData[position].areaId
            onSelectListener?.invoke(Pair(mData[position].areaId, mData[position].areaName))
            notifyDataSetChanged()
        }

        if (mAreaId == "" && position == 0) {
            holder.itemView.iv_select.isVisible = true
            holder.itemView.item_select_city_text.setTextColor(mContext.getColor(R.color.colorAccent))
        } else {
            if (mData[position].areaId == mAreaId) {
                holder.itemView.iv_select.isVisible = true
                holder.itemView.item_select_city_text.setTextColor(mContext.getColor(R.color.colorAccent))
            } else {
                holder.itemView.iv_select.isVisible = false
                holder.itemView.item_select_city_text.setTextColor(mContext.getColor(R.color.colorText_44))
            }
        }
    }


    /**
     * 判断是否为首字母
     *
     * @param selection
     * @return 返回字母第一次出现的位置
     */
    private fun getPositionForSelection(selection: Int): Int {
        for (i in mData.indices) {
            val firstLetter: Char = mData[i].sortLetter.toUpperCase().first()
            if (selection == firstLetter.toInt()) {
                return i
            }
        }
        return -1
    }

    class Holder(override val containerView: View?) : RecyclerView.ViewHolder(containerView!!),
        LayoutContainer

}