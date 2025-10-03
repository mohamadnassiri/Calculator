package com.example.calculator

import android.util.Log
import android.widget.TextView
import java.lang.NumberFormatException
import kotlin.math.sqrt

class CalcClass {

    private var firstNumber = ""
    private var secondNumber = ""
    private var operator = ""
    private var point=false

    private var Calculated = false

    private lateinit var result: TextView




    fun addnumber(number:String){
        if (result == null){
            Log.e("Calc","Result view is null")
        }

        if (operator==""){
            if (Calculated){
                firstNumber = ""
                result.text = ""
                firstNumber += number
                Calculated = false
            }
            else{
                firstNumber += number
            }

            Calculated = false

            Log.e("Calc","adding to firstnumber $number")
        }else{
            secondNumber += number

            Log.e("Calc","adding to secondnumber $number")
        }

        result.append((number))


    }

    fun setOperator(op:String){
        if (result == null){
            Log.e("Calc","Result view is null")
            return
        }
        Log.e("Calc","oper is $op")

        if (firstNumber=="") {
            Log.e("Calc","First number is null")
            return
        }
        if (operator==""){
            operator=op
            result.append(op)
            point=false

        }else{
            if (firstNumber !="" && secondNumber !=""){
                // result
            }
        }
    }

    fun calculate(op:String = "") {

        if (result == null) {

            Log.e("Calc", "Result view is null")
            return
        }
        Log.e("Calc", "calculate")

        if (firstNumber == "" || secondNumber == "" || operator == "") {
            Log.e("Calc", "Not enough data ...")
            return
        }

        try {
            var a:Double = firstNumber.toDouble()
            var b:Double = secondNumber.toDouble()

            var calculatedResult:Double = when(operator){
                "+" -> this.sum(a,b)
                "-" -> this.minus(a,b)
                "×" -> this.mult(a,b)
                "÷" -> this.div(a,b)
                "%" -> this.perc(a,b)
                else -> (0).toDouble()



            }
            result.text="$calculatedResult$op"
            firstNumber = "$calculatedResult"
            operator = op
            secondNumber = ""
            Calculated = true




        }catch (e:NumberFormatException){
            Log.e("calc","NumberFormatException")
        }


    }

    fun clear(){
        firstNumber = ""
        secondNumber = ""
        operator = ""
        result.text = ""
        point=false
    }


    fun calcSqrt(){
        var res:Double = 0.0
        if (firstNumber !=""&&operator==""){
            res = sqrt(firstNumber.toDouble())
            this.result.text=res.toString()
            firstNumber=res.toString()
            Calculated = true
        }else{
            when(operator){
                "+"->res = sqrt(sum(firstNumber.toDouble(),secondNumber.toDouble()))
                "-"->res = sqrt(minus(firstNumber.toDouble(),secondNumber.toDouble()))
                "×"->res = sqrt(mult(firstNumber.toDouble(),secondNumber.toDouble()))
                "÷"->res = sqrt(div(firstNumber.toDouble(),secondNumber.toDouble()))
            }
            this.result.text =res.toString()

            firstNumber=res.toString()
            secondNumber=""
            operator=""
            Calculated = true
        }
    }




    fun BackSpace() {
        if (this.result.text.length > 0)
            this.result.text = result.text.substring(0,result.text.length -1)
        else
            this.clear()
    }




    fun dot(number: String){
        if (point==false) {
            if (result == null) {
                Log.e("Calc", "result view is null")
            }

            if (operator == "") {
                if (Calculated) {
                    firstNumber = ""
                    result.text = ""
                    firstNumber += number
                    Calculated = false
                } else {
                    firstNumber += number
                }
                Calculated = false
                point = true
                Log.e("calc", "add to firstnumber$number")
            } else {
                secondNumber += number
                Log.e("calc", "add to secoundnmber$number")
                point = true
            }
            result.append(number)
        }
    }








    fun setResultView(result:TextView){
        this.result = result
        Log.e("Calc","Result view is set")
    }








    fun perc(a: Double,b: Double):Double = a/b *100
    fun sum(a:Double,b:Double):Double = a+b
    fun minus(a:Double,b:Double):Double = a-b
    fun mult(a:Double,b:Double):Double = a*b
    fun div(a:Double,b:Double):Double{
        if (b==0.0)return 0.0
        else return a/b




    }





}