package com.dicoding.submissionproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvCar: RecyclerView
    private var title = "Mode List"
    private val list = ArrayList<Car>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)

        rvCar = findViewById(R.id.rv_cars)
        rvCar.setHasFixedSize(true)

        list.addAll(CarsData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvCar.layoutManager = LinearLayoutManager(this)
        val listCarAdapter = ListCarAdapter(list)
        rvCar.adapter = listCarAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                title = "Halaman Utama"
                showRecyclerList()
            }
        }
        setActionBarTitle(title)
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

}