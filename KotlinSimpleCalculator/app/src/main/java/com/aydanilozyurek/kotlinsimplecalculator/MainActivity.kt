package com.aydanilozyurek.kotlinsimplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.aydanilozyurek.kotlinsimplecalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var number1 :Double? = null
    var number2 :Double? = null
    var result :Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


    }

    fun sum(view : View){
         number1 = binding.firstNum.text.toString().toDoubleOrNull()
         number2 = binding.secondNum.text.toString().toDoubleOrNull()

        if(number1 != null && number2 !=null){
             result = number1!! + number2!!
            binding.resultText.text = "Result: ${result}"
        } else {
            binding.resultText.text = "Enter invalid number!"
        }
    }
    fun divide(view : View){

        number1 = binding.firstNum.text.toString().toDoubleOrNull()
        number2 = binding.secondNum.text.toString().toDoubleOrNull()

        if(number1 != null && number2 !=null){
            result = number1!! / number2!!
            binding.resultText.text = "Result: ${result}"
        } else {
            binding.resultText.text = "Enter valid number!"
        }
    }
    fun multiply(view : View){

        number1 = binding.firstNum.text.toString().toDoubleOrNull()
        number2 = binding.secondNum.text.toString().toDoubleOrNull()

        if(number1 != null && number2 !=null){
            result = number1!! * number2!!
            binding.resultText.text = "Result: ${result}"
        } else {
            binding.resultText.text = "Enter invalid number!"
        }
    }
    fun extract(view : View){

        number1 = binding.firstNum.text.toString().toDoubleOrNull()
        number2 = binding.secondNum.text.toString().toDoubleOrNull()

        if(number1 != null && number2 !=null){
            result = number1!! - number2!!
            binding.resultText.text = "Result: ${result}"
        } else {
            binding.resultText.text = "Enter invalid number!"
        }
    }
}
