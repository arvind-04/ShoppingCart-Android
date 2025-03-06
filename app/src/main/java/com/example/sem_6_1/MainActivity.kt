package com.example.sem_6_1

import android.graphics.Paint
import android.media.Image
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var msg  ="CART"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        addDiscount()
//        CART
        val cart : ImageView = findViewById(R.id.cart)

//        RESET
        val reset : ImageView = findViewById(R.id.reset)



        val btn1: Button = findViewById(R.id.btn1)
        val btn2: Button = findViewById(R.id.btn2)
        val btn3: Button = findViewById(R.id.btn3)
        val btn4: Button = findViewById(R.id.btn4)
        val btn5: Button = findViewById(R.id.btn5)
        val btn6: Button = findViewById(R.id.btn6)

        val progressBar1: ProgressBar = findViewById(R.id.pr1)
        val progressBar2: ProgressBar = findViewById(R.id.pr2)
        val progressBar3: ProgressBar = findViewById(R.id.pr3)
        val progressBar4: ProgressBar = findViewById(R.id.pr4)
        val progressBar5: ProgressBar = findViewById(R.id.pr5)
        val progressBar6: ProgressBar = findViewById(R.id.pr6)

        val btn1_1: Button = findViewById(R.id.btn1_1)
        val btn2_1: Button = findViewById(R.id.btn2_1)
        val btn3_1: Button = findViewById(R.id.btn3_1)
        val btn4_1: Button = findViewById(R.id.btn4_1)
        val btn5_1: Button = findViewById(R.id.btn5_1)
        val btn6_1: Button = findViewById(R.id.btn6_1)



        btn1.setOnClickListener{
            showCustomToast("Dumble Added Successfully")
            val cur = msg + "\n 1X Dumble"
            msg = cur
            updateProgress(progressBar1)
        }
        btn2.setOnClickListener {
            showCustomToast("iPhone Added Successfully")
            val cur = msg + "\n 1X IPhone"
            msg = cur
            updateProgress(progressBar2)
        }
        btn3.setOnClickListener {
            showCustomToast("SmartWatch Added Successfully")
            val cur = msg + "\n 1X SmartWatch"
            msg = cur
            updateProgress(progressBar3)
        }
        btn4.setOnClickListener {
            showCustomToast("Shoes Added Successfully")
            val cur = msg + "\n 1X Shoes"
            msg = cur
            updateProgress(progressBar4)
        }
        btn5.setOnClickListener {
            showCustomToast("MacBook Added Successfully")
            val cur = msg + "\n 1X MacBook"
            msg = cur
            updateProgress(progressBar5)
        }
        btn6.setOnClickListener {
            showCustomToast("MousePad Added Successfully")
            val cur = msg + "\n 1X MousePad"
            msg = cur
            updateProgress(progressBar6)
        }


//        Horizontal_1
        btn1_1.setOnClickListener{
            showCustomToast("Dumble Added Successfully")
            val cur = msg + "\n 1X Dumble"
            msg = cur
            updateProgress(progressBar1)
        }
        btn2_1.setOnClickListener {
            showCustomToast("iPhone Added Successfully")
            val cur = msg + "\n 1X IPhone"
            msg = cur
            updateProgress(progressBar2)
        }
        btn3_1.setOnClickListener {
            showCustomToast("SmartWatch Added Successfully")
            val cur = msg + "\n 1X SmartWatch"
            msg = cur
            updateProgress(progressBar3)
        }
        btn4_1.setOnClickListener {
            showCustomToast("Shoes Added Successfully")
            val cur = msg + "\n 1X Shoes"
            msg = cur
            updateProgress(progressBar4)
        }
        btn5_1.setOnClickListener {
            showCustomToast("MacBook Added Successfully")
            val cur = msg + "\n 1X MacBook"
            msg = cur
            updateProgress(progressBar5)
        }
        btn6_1.setOnClickListener {
            showCustomToast("MousePad Added Successfully")
            val cur = msg + "\n 1X MousePad"
            msg = cur
            updateProgress(progressBar6)
        }
        cart.setOnClickListener(){
            showCustomToast2(msg)
        }
        reset.setOnClickListener(){
            Toast.makeText(this, "Clearing Cart....", Toast.LENGTH_SHORT).show()
            msg ="CART"
        }


    }
    private fun addDiscount()
    {
        val originalPrice1 = findViewById<TextView>(R.id.originalPrice1)
        originalPrice1.paintFlags = originalPrice1.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG

        val originalPrice2 = findViewById<TextView>(R.id.originalPrice2)
        originalPrice2.paintFlags = originalPrice2.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
        val originalPrice3 = findViewById<TextView>(R.id.originalPrice3)
        originalPrice3.paintFlags = originalPrice3.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
        val originalPrice4 = findViewById<TextView>(R.id.originalPrice4)
        originalPrice4.paintFlags = originalPrice4.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
        val originalPrice5 = findViewById<TextView>(R.id.originalPrice5)
        originalPrice5.paintFlags = originalPrice5.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
        val originalPrice6 = findViewById<TextView>(R.id.originalPrice6)
        originalPrice6.paintFlags = originalPrice6.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
    }
    private fun updateProgress(progressBar: ProgressBar) {

            progressBar.progress = progressBar.progress-1

    }

    private fun showCustomToast(message: String) {
        val inflater = LayoutInflater.from(this)
        val layout = inflater.inflate(R.layout.custom_toast, null)

        val toastText = layout.findViewById<TextView>(R.id.toastText)
        toastText.text = message

        val toast = Toast(this).apply {
            setGravity(Gravity.FILL, 0, 0) // Make it fullscreen
            duration = Toast.LENGTH_SHORT
            view = layout
        }

        toast.show()

        Handler(Looper.getMainLooper()).postDelayed({
            toast.cancel()
        }, 2000)
    }
    private fun showCustomToast2(message: String) {
        val inflater = LayoutInflater.from(this)
        val layout = inflater.inflate(R.layout.custom_toast2, null)

        val toastText = layout.findViewById<TextView>(R.id.toastText2)
        toastText.text = message

        val toast = Toast(this).apply {
            setGravity(Gravity.FILL, 0, 0) // Make it fullscreen
            duration = Toast.LENGTH_LONG
            view = layout
        }

        toast.show()

        Handler(Looper.getMainLooper()).postDelayed({
            toast.cancel()
        }, 2000)
    }

}
