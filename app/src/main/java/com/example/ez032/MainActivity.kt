package com.example.ez032

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sub1: EditText = findViewById(R.id.sub1)
        val sub2: EditText = findViewById(R.id.sub2)
        val sub3: EditText = findViewById(R.id.sub3)
        val sub4: EditText = findViewById(R.id.sub4)
        val sub5: EditText = findViewById(R.id.sub5)
        val cre1: EditText = findViewById(R.id.cre1)
        val cre2: EditText = findViewById(R.id.cre2)
        val cre3: EditText = findViewById(R.id.cre3)
        val cre4: EditText = findViewById(R.id.cre4)
        val cre5: EditText = findViewById(R.id.cre5)
        val pt1: EditText = findViewById(R.id.pt1)
        val pt2: EditText = findViewById(R.id.pt2)
        val pt3: EditText = findViewById(R.id.pt3)
        val pt4: EditText = findViewById(R.id.pt4)
        val pt5: EditText = findViewById(R.id.pt5)
        val TTCre: TextView = findViewById(R.id.TTCre)
        val GPA: TextView = findViewById(R.id.GPA)
        val OK: Button = findViewById(R.id.OK)
        val CLEAR: Button = findViewById(R.id.CLEAR)

        OK.setOnClickListener {
            if(sub1.text.toString() == "" || sub2.text.toString() == "" || sub3.text.toString() == ""
                || sub4.text.toString() == "" || sub5.text.toString() == "" || cre1.text.toString() == ""
                || cre2.text.toString() == "" || cre3.text.toString() == "" || cre4.text.toString() == ""
                || cre5.text.toString() == "" || pt1.text.toString() == "" || pt2.text.toString() == ""
                || pt3.text.toString() == "" || pt4.text.toString() == "" || pt5.text.toString() == ""){
                Toast.makeText(
                    this,
                    "Please Input All Text Box Before Press OK !!!",
                    Toast.LENGTH_SHORT)
                    .show()
            } else if(cre1.text.toString().toInt() < 1 || cre1.text.toString().toInt() > 3 ||
                cre2.text.toString().toInt() < 1 || cre2.text.toString().toInt() > 3 ||
                cre3.text.toString().toInt() < 1 || cre3.text.toString().toInt() > 3 ||
                cre4.text.toString().toInt() < 1 || cre4.text.toString().toInt() > 3 ||
                cre5.text.toString().toInt() < 1 || cre5.text.toString().toInt() > 3 ){
                Toast.makeText(
                    this,
                    "Please Input Credit 1 To 3 !!!",
                    Toast.LENGTH_SHORT)
                    .show()
            } else if(pt1.text.toString().toDouble() < 1 || pt1.text.toString().toDouble() > 4 ||
                pt2.text.toString().toDouble() < 1 || pt2.text.toString().toDouble() > 4 ||
                pt3.text.toString().toDouble() < 1 || pt3.text.toString().toDouble() > 4 ||
                pt4.text.toString().toDouble() < 1 || pt4.text.toString().toDouble() > 4 ||
                pt5.text.toString().toDouble() < 1 || pt5.text.toString().toDouble() > 4 ){
                Toast.makeText(
                    this,
                    "Please Input Point 1 To 4 !!!",
                    Toast.LENGTH_SHORT)
                    .show()
            } else{
            var c = cre1.text.toString().toInt() + cre2.text.toString().toInt() +
                    cre3.text.toString().toInt() + cre4.text.toString().toInt() +
                    cre5.text.toString().toInt()
            TTCre.setText(c.toString())

                var cmp1 = cre1.text.toString().toDouble() * pt1.text.toString().toDouble()
                var cmp2 = cre2.text.toString().toDouble() * pt2.text.toString().toDouble()
                var cmp3 = cre3.text.toString().toDouble() * pt3.text.toString().toDouble()
                var cmp4 = cre4.text.toString().toDouble() * pt4.text.toString().toDouble()
                var cmp5 = cre5.text.toString().toDouble() * pt5.text.toString().toDouble()

                var cmps = cmp1+cmp2+cmp3+cmp4+cmp5

                var gpa = cmps.toString().toDouble() / c.toString().toDouble()
                val gs = String.format("%.2f",gpa)

                GPA.setText(gs)
            }
        }
        CLEAR.setOnClickListener {
            sub1.setText("")
            sub2.setText("")
            sub3.setText("")
            sub4.setText("")
            sub5.setText("")
            cre1.setText("")
            cre2.setText("")
            cre3.setText("")
            cre4.setText("")
            cre5.setText("")
            pt1.setText("")
            pt2.setText("")
            pt3.setText("")
            pt4.setText("")
            pt5.setText("")
            TTCre.setText("")
            GPA.setText("")
        }
    }
}