package com.vlad_kryvovyaz.textview_span_styling

import android.graphics.Color
import android.graphics.Typeface.BOLD
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.*
import androidx.annotation.RequiresApi
import androidx.core.text.set
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.P)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val foregroundSpan = "Foreground Span example with TextView"
        val backgroundSpan = "Background Span example with textView"
        val underlinedSpan1 = "Underlined Span with TextView"
        val resizingTextSpan1 = "I am bigger,that the rest of the string"
        val bulletSpan1 = "Fruits:\nApple\nBanana"
        val styledSpan1 = " I am Style example"

        val foregroundSpannableString = SpannableString(foregroundSpan)
        foregroundSpannableString.setSpan(
            ForegroundColorSpan(Color.BLUE),
            0,
            10,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        foregroundfSpan.text = foregroundSpannableString

        val backgroundSpannableString = SpannableString(backgroundSpan)
        backgroundSpannableString.setSpan(
            BackgroundColorSpan(Color.YELLOW),
            0,
            11,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        backgroundfSpan.text = backgroundSpannableString


        val underlinedSpannableString = SpannableString(underlinedSpan1)
        underlinedSpannableString.setSpan(
            UnderlineSpan(),
            0,
            10,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        underlinedSpan.text = underlinedSpannableString

        val resizeSpannableString = SpannableString(resizingTextSpan1)
        resizeSpannableString.setSpan(
            RelativeSizeSpan(4f),
            0,
            11,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        resizingTextSpan.text = resizeSpannableString


        val styledSpannableString = SpannableString(styledSpan1)
        styledSpannableString.setSpan(
            ForegroundColorSpan(Color.BLUE),
            0,
            11,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        buletTextSpan.text = styledSpannableString

        val bulletSpannableString = SpannableString(bulletSpan1)
        bulletSpannableString.setSpan(
            StyleSpan(BOLD),
            8,
            13,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        bulletSpannableString.setSpan(
            BulletSpan(2, Color.MAGENTA, 10),
            14,
            bulletSpan1.length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        styledSpan.text = bulletSpannableString
    }
}