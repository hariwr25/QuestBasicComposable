package com.example.food

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var tvPrice: TextView
    private lateinit var spinnerFood: Spinner
    private lateinit var btnOrder: Button

    private val foodItems = listOf("Pizza", "Burger", "Pasta", "Salad")
    private val foodPrices = mapOf(
        "Pizza" to 10.0,
        "Burger" to 8.0,
        "Pasta" to 7.0,
        "Salad" to 5.0
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvPrice = findViewById(R.id.tvPrice)
        spinnerFood = findViewById(R.id.spinnerFood)
        btnOrder = findViewById(R.id.btnOrder)

        // Set up Spinner
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, foodItems)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerFood.adapter = adapter

        spinnerFood.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val selectedFood = foodItems[position]
                val price = foodPrices[selectedFood] ?: 0.0
                tvPrice.text = "Price: $$price"
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }

        btnOrder.setOnClickListener {
            val selectedFood = foodItems[spinnerFood.selectedItemPosition]
            val price = foodPrices[selectedFood] ?: 0.0
            tvPrice.text = "You ordered $selectedFood. Total: $$price"
        }
    }
}
