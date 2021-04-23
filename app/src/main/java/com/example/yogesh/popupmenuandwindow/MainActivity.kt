package com.example.yogesh.popupmenuandwindow

import android.os.Bundle
import android.widget.ImageView
import android.widget.PopupWindow
import androidx.appcompat.app.AppCompatActivity
import com.example.yogesh.popupmenuandwindow.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_popup.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val views = binding.root
        setContentView( views)
        //setContentView(R.layout.activity_main)

        btn_show_popup.setOnClickListener {
//            val popup = PopupMenu(this,btn_show_popup)
//            popup.inflate(R.menu.test)
//            popup.setOnMenuItemClickListener {
//                Toast.makeText(this, "Item : " + it.title,Toast.LENGTH_SHORT).show()
//                true
//            }
//            popup.show()

            val window = PopupWindow(this)
            val view = layoutInflater.inflate(R.layout.layout_popup,null)
            window.contentView = view
            val imageView = view.findViewById<ImageView>(R.id.imageView)
            imageView.setOnClickListener {
                window.dismiss()
            }
            window.showAsDropDown(btn_show_popup)
        }

    }
}
