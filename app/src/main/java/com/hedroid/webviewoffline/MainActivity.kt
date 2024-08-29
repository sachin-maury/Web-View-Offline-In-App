package com.hedroid.webviewoffline

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.hedroid.webviewoffline.databinding.ActivityMainBinding  // Import the generated binding class

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding  // Correct type for binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)  // Initialize binding correctly
        setContentView(binding.root)  // Set content view using binding root


        binding.webView.loadUrl("https://github.com/sachin-maury")

        binding.webView.settings.javaScriptEnabled
        binding.webView.webViewClient = WebViewClient()

    }
}
