package com.example.newlab1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.newlab1.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var btn: Button
    lateinit var btn2: Button
    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        //var rabb = Rabbit("Fluffy", 2, "White", 2.5, true)
       // val intent = Intent(this, MainActivity2::class.java)
        //intent.putExtra("rabb", Rabbit)
        //startActivity(intent)

        val button = findViewById<Button>(R.id.button1)

        button.setOnClickListener {
            val rabb = Rabbit("Fluffy", 2, "White", 2.5, true)
            val intent = Intent(this, MainActivity2::class.java)
            val bundle = Bundle()
            bundle.putString("field1", rabb.name)
            bundle.putInt("field2", rabb.age)
            bundle.putString("field3", rabb.color)
            bundle.putDouble("field4", rabb.weight)
            bundle.putBoolean("field5", rabb.isVegetarian)

            intent.putExtras(bundle)
            startActivity(intent)

        }
        val button2 = findViewById<Button>(R.id.button2)

        button2.setOnClickListener {
            val mous = Mouse("Brain", 1, "Black", 0.5, false)
            val intent = Intent(this, MainActivity2::class.java)
            val bundle = Bundle()
            bundle.putString("field1", mous.name)
            bundle.putInt("field2", mous.age)
            bundle.putString("field3", mous.color)
            bundle.putDouble("field4", mous.weight)
            bundle.putBoolean("field5", mous.isVegetarian)

            intent.putExtras(bundle)
            startActivity(intent)

        }

        val button3 = findViewById<Button>(R.id.button3)

        button3.setOnClickListener {
            val spd = Spider("Arahna", 3, "Brown", 1.5, false)
            val intent = Intent(this, MainActivity2::class.java)
            val bundle = Bundle()
            bundle.putString("field1", spd.name)
            bundle.putInt("field2", spd.age)
            bundle.putString("field3", spd.color)
            bundle.putDouble("field4", spd.weight)
            bundle.putBoolean("field5", spd.isVegetarian)

            intent.putExtras(bundle)
            startActivity(intent)

        }

        //@Parcelize
        // data class Rabbit(
        // val name: String,
        // val age: Int,
        // val color: String,
        // val weight: Double,
        //  val isVegetarian: Boolean
        // ): Parcelable {
        // Реалізуйте методи Parcelable тут
        // }


        //val rabbit = Rabbit("Fluffy", 2, "White", 2.5, true)
        //binding.button1.setOnClickListener{
        //Toast.makeText(this@MainActivity, "Clicked", Toast.LENGTH_SHORT).show()
        // Створюємо Intent для переходу на іншу MainActivity
        //val intent = Intent(this, MainActivity2::class.java)
        // Передаємо об'єкт Data-класу через Intent
        //intent.putExtra("rabbit", rabbit)
        // startActivity(intent)





    }











        //go to second activity
            //val intent = Intent(this, MainActivity2::class.java)
            // Передаємо об'єкт Data-класу через Inten
            //intent.putExtra("Fluffy", rabb)
            // Запускаємо іншу Activity
            //startActivity(intent)

                //startActivity(Intent(
              //  this,
               // MainActivity2::class.java
           // ).apply {
             //   putExtra("asas", rabb)
           // })

        }




        //val btn = findViewById<Button>(R.id.button1)











