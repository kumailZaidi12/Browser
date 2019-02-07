package com.example.mybrowser


import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.browsers_lay.*

class Browsers : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.browsers_lay)

        val string=intent.data

       // val uri=Uri.parse(string)

        wb.webViewClient= WebViewClient()

        wb.loadUrl(string.toString())

        wb.settings.javaScriptEnabled=true

    }
}