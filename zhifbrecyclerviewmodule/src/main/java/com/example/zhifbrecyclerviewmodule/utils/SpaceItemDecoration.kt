package com.example.zhifbrecyclerviewmodule.utils

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by shenshiqiang.ex.
 * Date: 2020/11/3 13:34
 * Description: RecyclerView Grid分割
 */
class SpaceItemDecoration(spanCount: Int, spacing: Int, includeEdge: Boolean) :
    RecyclerView.ItemDecoration() {

    private val mSpanCount = spanCount //列数
    private val mSpacing = spacing//间隔
    private val mIncludeEdge = includeEdge//是否包含边缘

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
//            super.getItemOffsets(outRect, view, parent, state)
        val position = parent.getChildAdapterPosition(view) // item position
        val column = position % mSpanCount // item column
        if (mIncludeEdge) {
            outRect.left =
                mSpacing - column * mSpacing / mSpanCount; // mSpacing - column * ((1f / mSpanCount) * mSpacing)
            outRect.right =
                (column + 1) * mSpacing / mSpanCount; // (column + 1) * ((1f / mSpanCount) * mSpacing)

            if (position < mSpanCount) { // top edge
                outRect.top = mSpacing;
            }
            outRect.bottom = mSpacing; // item bottom
        } else {
            outRect.left =
                column * mSpacing / mSpanCount; // column * ((1f / mSpanCount) * mSpacing)
            outRect.right =
                mSpacing - (column + 1) * mSpacing / mSpanCount; // mSpacing - (column + 1) * ((1f /    mSpanCount) * mSpacing)
            if (position >= mSpanCount) {
                outRect.top = mSpacing; // item top
            }
        }
    }

}