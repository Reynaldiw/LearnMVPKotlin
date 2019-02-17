package com.reynaldiwijaya.learnmvpkotlin

import com.reynaldiwijaya.learnmvpkotlin.Model.ModelMVP

class MVPPresenter (model : MVPContract.View) : MVPContract.FirstPresenter{

    var viewModel : MVPContract.View? = null

    init {
        viewModel = model
    }

    override fun tambahData(msg: String) {
        //TODO 1 check inputan
        if (msg.isNotEmpty()) {

            //TODO 2
            var model = ModelMVP(msg)

            //TODO 3 add ke view
            viewModel?.berhasil(model)

        }else{

            //TODO 4 kalau seandainya kosong
            viewModel?.error()
        }
    }
}