package com.sicsha.Main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.sicsha.Main.Adapter.MainMenuTypeAdapter
import com.sicsha.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainContract.ActivityView {

    var presenter: MainContract.Presenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainPresenter()
        menu_type_list.layoutManager = LinearLayoutManager(this)
        presenter?.start()

    }

    override fun setAdapter(adapter: MainMenuTypeAdapter) {
        menu_type_list.adapter = adapter
    }
}
