package ru.mertsalovda.avatarimageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import ru.mertsalovda.avatarimageview.ui.custom.AvatarImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_color.setOnClickListener{
            avatar.setBorderColor(AvatarImageView.bgColors.random())
        }

        btn_border.setOnClickListener {
            avatar.setBorderWidht((2..10).random())
        }

        btn_initials.setOnClickListener {
            avatar.setInitials(arrayListOf("JM", "DM", "YY", "RM").random())
        }
    }
}
