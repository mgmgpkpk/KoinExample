package jp.mgmgpkpk.koinexample.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import jp.mgmgpkpk.koinexample.R
import jp.mgmgpkpk.koinexample.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity: AppCompatActivity() {

    private val viewModel: MainViewModel by viewModel()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        observe()
    }

    private fun observe() {

        viewModel.session.observe(this, Observer {
            binding.session.text = it.toString()
        })

        viewModel.speaker.observe(this, Observer {
            binding.speaker.text = it.toString()
        })
    }
}
