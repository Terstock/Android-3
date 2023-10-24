package com.example.newlab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.Spliterator.OfLong

//import kotlinx.android.synthetic.main.MainActivity2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //val rabbit = intent.getParcelableExtra<Rabbit>("rabbit")

        // Відображаємо дані у TextView чи інших елементах
        //textViewName.text = rabbit?.name
        //textViewAge.text = rabbit?.age.toString()
        //textViewColor.text = rabbit?.color
        //textViewWeight.text = rabbit?.weight.toString()
        //textViewIsVegetarian.text = if (rabbit?.isVegetarian == true) "Yes" else "No"
       // intent.getIntExtra()

        val receivedBundle = intent.extras
        if (receivedBundle != null) {
            val name = receivedBundle.getString("field1", "")
            val age = receivedBundle.getInt("field2", 0)
            val color = receivedBundle.getString("field3", "")
            val weight = receivedBundle.getDouble("field4", 0.0)
            val isVegetarian = receivedBundle.getBoolean("field5", true)

            val field1String = name.toString()
            val field2String = age.toString()
            val field3String = color.toString()
            val field4String = weight.toString()
            val field5String = isVegetarian.toString()

            val textView1 = findViewById<TextView>(R.id.textViewName)
            val textView2 = findViewById<TextView>(R.id.textViewAge)
            val textView3 = findViewById<TextView>(R.id.textViewColor)
            val textView4 = findViewById<TextView>(R.id.textViewWeight)
            val textView5 = findViewById<TextView>(R.id.textViewIsVegetarian)

            // Встановіть значення в відповідні TextView
            textView1.text = "Animal's name: $field1String"
            textView2.text = "Animal's age: $field2String"
            textView3.text = "Animal's color: $field3String"
            textView4.text = "Animal's weight: $field4String"
            textView5.text = "Is Animal Vegetarian: $field5String"
        }

            // Використовуйте отримані дані за потреби
        /*
            if (receivedBundle != null) {
                val name1 = receivedBundle.getString("field1", "")
                val age1 = receivedBundle.getString("field2", "")
                val color1 = receivedBundle.getString("field3", "")
                val weight1 = receivedBundle.getString("field4", "")
                val isVegetarian1 = receivedBundle.getString("field5", "")

                // Знайдіть TextView за його ідентифікатором
                val Textname = findViewById<TextView>(R.id.textViewName) // Замініть "textViewId" на ідентифікатор вашого TextView
                val Textage = findViewById<TextView>(R.id.textViewAge)
                val Textcolor = findViewById<TextView>(R.id.textViewColor)
                val Textweight = findViewById<TextView>(R.id.textViewWeight)
                val TextisVegeterian = findViewById<TextView>(R.id.textViewIsVegetarian)

                Textname.text = name1
                Textage.text = age1
                Textcolor.text = color1
                Textweight.text = weight1
                TextisVegeterian.text = isVegetarian1
            }
            */


        }


    }
