package ru.zavanton.moreepoxydemo.model.epoxy

import android.view.View
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelWithHolder

abstract class CatModel : EpoxyModelWithHolder<>() {


    inner class CatHolder : EpoxyHolder() {




        override fun bindView(itemView: View) {



        }
    }
}