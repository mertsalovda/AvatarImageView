package ru.mertsalovda.avatarimageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import ru.mertsalovda.avatarimageview.ui.custom.AvatarImageView

class MainActivity : AppCompatActivity() {

    private val IS_AVATAR = "IS_AVATAR"
    private var isAvatar: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        isAvatar = savedInstanceState?.getBoolean(IS_AVATAR) ?: false
        updateAvatar()

        btn_color.setOnClickListener {
            avatar.setBorderColor(AvatarImageView.bgColors.random())
        }

        btn_border.setOnClickListener {
            avatar.setBorderWidth((2..10).random())
        }

        btn_initials.setOnClickListener {
            avatar.setInitials(arrayListOf("JM", "DM", "YY", "RM").random())
        }

        btn_image.setOnClickListener {
            isAvatar = !isAvatar
            updateAvatar()
//            val resId = if(isAvatar) R.drawable.korra else 0
//            avatar.setImageResource(resId)
        }
    }

    override fun onSaveInstanceState(out: Bundle) {
        out.putBoolean(IS_AVATAR, isAvatar)
        super.onSaveInstanceState(out)
    }

    private fun updateAvatar() {
        val drawable = if (isAvatar) resources.getDrawable(R.drawable.korra, theme) else null
        avatar.setImageDrawable(drawable)
    }
}
