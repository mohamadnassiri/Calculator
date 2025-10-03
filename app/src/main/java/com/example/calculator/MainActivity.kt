package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(),View.OnClickListener {

    lateinit var btn0: Button
    lateinit var btn1: Button
    lateinit var btn2: Button
    lateinit var btn3: Button
    lateinit var btn4: Button
    lateinit var btn5: Button
    lateinit var btn6: Button
    lateinit var btn7: Button
    lateinit var btn8: Button
    lateinit var btn9: Button
    lateinit var btnplus: Button
    lateinit var btnperc: Button
    lateinit var btnequal: Button
    lateinit var btnmul: Button
    lateinit var btndiv: Button
    lateinit var btnsub: Button
    lateinit var btnpoint: Button
    lateinit var btnBackspace: Button
    lateinit var btnRadical: Button
    lateinit var btnclear: Button
    lateinit var result: TextView


    var calculate = CalcClass()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    fun init(){
        btn0 = findViewById(R.id.btn0)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)
        btn6 = findViewById(R.id.btn6)
        btn7 = findViewById(R.id.btn7)
        btn8 = findViewById(R.id.btn8)
        btn9 = findViewById(R.id.btn9)
        btnplus = findViewById(R.id.btnplus)
        btnperc = findViewById(R.id.btnperc)
        btnequal = findViewById(R.id.btnequal)
        btnmul = findViewById(R.id.btnmul)
        btndiv = findViewById(R.id.btndiv)
        btnsub = findViewById(R.id.btnsub)
        btnpoint = findViewById(R.id.btnpoint)
        btnBackspace = findViewById(R.id.btnBackspace)
        btnRadical = findViewById(R.id.btnRadical)
        btnclear = findViewById(R.id.btnclear)
        result = findViewById(R.id.result)




        btn0.setOnClickListener(this)
        btn1.setOnClickListener(this)
        btn2.setOnClickListener(this)
        btn3.setOnClickListener(this)
        btn4.setOnClickListener(this)
        btn5.setOnClickListener(this)
        btn6.setOnClickListener(this)
        btn7.setOnClickListener(this)
        btn8.setOnClickListener(this)
        btn9.setOnClickListener(this)
        btnplus.setOnClickListener(this)
        btnperc.setOnClickListener(this)
        btnequal.setOnClickListener(this)
        btnmul.setOnClickListener(this)
        btndiv.setOnClickListener(this)
        btnsub.setOnClickListener(this)
        btnpoint.setOnClickListener(this)
        btnBackspace.setOnClickListener(this)
        btnRadical.setOnClickListener(this)
        btnclear.setOnClickListener(this)
        result.setOnClickListener(this)


        calculate.setResultView(result)






    }






    override fun onClick(p0: View?) {


        when(p0?.id)
        {
            R.id.btn0         -> calculate.addnumber("0")
            R.id.btn1         -> calculate.addnumber("1")
            R.id.btn2         -> calculate.addnumber("2")
            R.id.btn3         -> calculate.addnumber("3")
            R.id.btn4         -> calculate.addnumber("4")
            R.id.btn5         -> calculate.addnumber("5")
            R.id.btn6         -> calculate.addnumber("6")
            R.id.btn7         -> calculate.addnumber("7")
            R.id.btn8         -> calculate.addnumber("8")
            R.id.btn9         -> calculate.addnumber("9")
            R.id.btndiv       -> calculate.setOperator("÷")
            R.id.btnsub       -> calculate.setOperator("-")
            R.id.btnmul       -> calculate.setOperator("×")
            R.id.btnplus      -> calculate.setOperator("+")
            R.id.btnperc      -> calculate.setOperator("%")
            R.id.btnequal     -> calculate.calculate()
            R.id.btnclear     -> calculate.clear()
            R.id.btnRadical   ->calculate.calcSqrt()
            R.id.btnBackspace ->calculate.BackSpace()
            R.id.btnpoint       ->calculate.dot(".")









        }



    }
}