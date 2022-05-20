package com.benhul.uts_if5_10119170_elbarunawifaldzan

import android.app.Dialog
import android.content.ActivityNotFoundException
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.Button

class ProfileActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnDialog : Button
    private lateinit var btnLokasi : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        btnLokasi = findViewById(R.id.btn_lokasiSaya)
        btnLokasi.setOnClickListener(this)

        btnDialog = findViewById(R.id.btn_custom_dialog)
        btnDialog.setOnClickListener{
            customDialog()
        }

        val insta = findViewById<View>(R.id.btn_instragram) as Button
        insta.setOnClickListener(View.OnClickListener {
            val uri = Uri.parse("https://www.instagram.com/elbaruna.wifaldzan")
            val instragram = Intent(Intent.ACTION_VIEW, uri)
            instragram.setPackage("com.instagram.android")
            try {
                startActivity(instragram)
            } catch (e: ActivityNotFoundException) {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/elbaruna.wifaldzan")))
            }
        })

    }
    private fun customDialog(){
        val dialog = Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.setContentView(R.layout.custom_dialog)

        val btnTutup = dialog.findViewById<Button>(R.id.btnTutup)
        btnTutup.setOnClickListener{
            dialog.dismiss()
        }
        dialog.show()
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_lokasiSaya -> {
                val intentLokasi = Intent(this@ProfileActivity, MapActivity::class.java)
                startActivity(intentLokasi)
            }
        }
    }
}