package com.reynaldiwijaya.learnmvpkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.reynaldiwijaya.learnmvpkotlin.Model.ModelMVP
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.alert
import org.jetbrains.anko.noButton
import org.jetbrains.anko.toast
import org.jetbrains.anko.yesButton

class MainActivity : AppCompatActivity(), MVPContract.View {

    lateinit var presenterImp : MVPContract.FirstPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenterImp = MVPPresenter(this)

        buttonSubmit.setOnClickListener {
            presenterImp.tambahData(inputText.text.toString())
        }
    }

    override fun berhasil(hasil: ModelMVP) {
        alert {
            title = hasil.textmsg

            noButton {  }
            yesButton {
                it.dismiss()
            }
        }
            .show()
    }

    override fun error() {
        toast("Tidak Boleh Kosong")
    }
}
