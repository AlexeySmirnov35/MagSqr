package com.example.squre

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    fun <T> hasDuplicates(arr: Array<T>): Boolean {
        arr.sort()
        var previous: T? = null
        for (e in arr)
        {
            if (e != null && e == previous) {
                return true
            }
            previous = e
        }
        return false
    }
    fun <T> zeropr(arr:Array<T>):Boolean{
        var prev:T?=null
        for (e in arr){
            if(e!=null && e==0){
                return true
            }
        }
        return false
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.button)
        val editText1: EditText = findViewById(R.id.editTextNumber5)
        val editText2: EditText = findViewById(R.id.editTextNumber4)
        val editText3: EditText = findViewById(R.id.editTextNumber6)
        val editText4: EditText = findViewById(R.id.editTextNumber7)
        val editText5: EditText = findViewById(R.id.editTextNumber8)
        val editText6: EditText = findViewById(R.id.editTextNumber9)
        val editText7: EditText = findViewById(R.id.editTextNumber10)
        val editText8: EditText = findViewById(R.id.editTextNumber11)
        val editText9: EditText = findViewById(R.id.editTextNumber12)
        val textView: TextView = findViewById((R.id.textView3))

        button.setOnClickListener {
            var s1:String = editText1.text.toString()
            var s2: String = editText2.text.toString()
            var s3: String = editText3.text.toString()
            var s4: String = editText4.text.toString()
            var s5: String = editText5.text.toString()
            var s6: String = editText6.text.toString()
            var s7: String = editText7.text.toString()
            var s8: String = editText8.text.toString()
            var s9: String = editText9.text.toString()
            var i1 = s1.toInt()
            var i2 = s2.toInt()
            var i3 = s3.toInt()
            var i4 = s4.toInt()
            var i5 = s5.toInt()
            var i6 = s6.toInt()
            var i7 = s7.toInt()
            var i8 = s8.toInt()
            var i9 = s9.toInt()
            var myarray = arrayOf(i1, i2, i3, i4, i5, i6, i7, i8, i9)
            for (i in 0 until myarray.size) {
                    if (zeropr(myarray)) {
                        textView.text = ("0 не вводим");
                        break
                    }
                     if(hasDuplicates(myarray)){
                        textView.text=("Числа повторяются")
                        break
                    }
                        else if ((i1+i2+i3)==(i5+i4+i6) && (i5+i4+i6)==(i7+i8+i9) && (i1+i4+i7)==(i2+i5+i8) && (i2+i5+i8)==(i3+i6+i9) && (i1+i5+i9)==(i3+i5+i7)&&(i3+i5+i7)==(i1+i2+i3)){
                        textView.text = ("Квадрат магический");

                    }
                     else{
                         textView.text=("Увы,квадрат обычный(")
                         break
                         }
                }
            }

        }

    }



