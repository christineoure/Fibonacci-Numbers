package dev.oure.fibonaccinumbers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.oure.fibonaccinumbers.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayNumbers()
    }
    fun displayNumbers(){


        var numbersList = Fnums(100)

        val numbersAdapter = NumbersRecyclerViewAdapter(numbersList)

        binding.rvNumbers.layoutManager = LinearLayoutManager(this)
        binding.rvNumbers.adapter = numbersAdapter
    }

    fun Fnums(args: Int):List<Int> {
        val list = ArrayList<Int> ()
        var t1 = 0
        var t2 = 1

        for (i in 1..args) {
//            print("$t1 + ")

            var sum = t1 + t2
            t1 = t2
            t2 = sum
            list+=sum
        }
        return list
    }
}