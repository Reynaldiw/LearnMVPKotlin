package com.reynaldiwijaya.learnmvpkotlin

import com.reynaldiwijaya.learnmvpkotlin.Model.ModelMVP

interface MVPContract {
    interface View {
        fun berhasil(hasil : ModelMVP)
        fun error()
    }

    interface FirstPresenter {
        fun tambahData (msg : String)
    }
}