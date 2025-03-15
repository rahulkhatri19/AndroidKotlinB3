package com.geeksforgeek.elearningapp

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.geeksforgeek.elearningapp.Utility.RAZORPAY_SECREAT_KEY
import com.razorpay.Checkout
import com.razorpay.PayloadHelper
import com.razorpay.PaymentResultListener

class PaymentActivity : AppCompatActivity(), PaymentResultListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_payment)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Checkout.preload(applicationContext)
        val checkout = Checkout()
        // rzp_test_g.....
        checkout.setKeyID(RAZORPAY_SECREAT_KEY)

        val payloadHelper = PayloadHelper("INR", 100, "123456")
        checkout.open(this, payloadHelper.getJson())

    }

    override fun onPaymentSuccess(paymentId: String?) {
        Log.d("PaymentAct", "Success: paymentId $paymentId")
    }

    override fun onPaymentError(errorCode: Int, reponse: String?) {
        Log.d("PaymentAct", "Failure: response $reponse")
    }
}