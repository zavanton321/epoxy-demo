package ru.zavanton.moreepoxydemo.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import ru.zavanton.moreepoxydemo.R
import ru.zavanton.moreepoxydemo.viewmodel.CatController

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val catController = CatController()

        rvItems.layoutManager = LinearLayoutManager(this)
        rvItems.adapter = catController.adapter

        catController.requestModelBuild()
    }
}
