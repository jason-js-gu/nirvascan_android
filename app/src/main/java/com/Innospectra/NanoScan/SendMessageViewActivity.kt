package com.Innospectra.NanoScan

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.net.URL
import javax.net.ssl.HttpsURLConnection

class SendMessageViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send_message_view)
    }

    fun sendMessage(view: View) {
        val url = URL("https://nirvascan.herokuapp.com/admin/core/spectrum/")
        url.readText()
    }
}