package com.example.wechatshartmodule

import android.content.Context
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.wechat_share_dialog_layout.*

/**
 * Created by shenshiqiang.ex.
 * Date: 2020/10/20 9:34
 * Description:
 */
class WeChatShareDialog(private val mContext: Context) : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.wechat_share_dialog_layout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setListeners()
    }

    private fun setListeners() {
        tv_cancel.setOnClickListener {
            dismiss()
        }
        lv_weChat.setOnClickListener {
            Toast.makeText(mContext, "微信", Toast.LENGTH_SHORT).show()
        }
        lv_weChat_pyq.setOnClickListener {
            Toast.makeText(mContext, "朋友圈", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onStart() {
        super.onStart()

//        dialog!!.setCanceledOnTouchOutside(true)

        // 设置宽度为屏宽, 靠近屏幕底部。
        val window = dialog!!.window

        //设置dialog的 进出 动画
        window!!.setWindowAnimations(R.style.animate_bottom_dialog)
        val lp = window.attributes as WindowManager.LayoutParams
        lp.gravity = Gravity.BOTTOM // 紧贴底部
        lp.width = WindowManager.LayoutParams.MATCH_PARENT // 宽度持平
        window.attributes = lp
        window.setBackgroundDrawable(
            ColorDrawable(
                ActivityCompat.getColor(context!!, R.color.transparent)
            )
        )
    }
}