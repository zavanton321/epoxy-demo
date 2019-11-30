package ru.zavanton.moreepoxydemo.model.epoxy

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.DrawableRes
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import kotlinx.android.synthetic.main.item_cat.view.*
import ru.zavanton.moreepoxydemo.R

@EpoxyModelClass(layout = R.layout.item_cat)
abstract class CatModel : EpoxyModelWithHolder<CatModel.CatHolder>() {

    @EpoxyAttribute
    var breed: String = ""

    @EpoxyAttribute
    var description: String = ""

    @EpoxyAttribute
    @DrawableRes
    var catImage: Int = -1

    override fun bind(holder: CatHolder) {
        holder.breedView.text = breed
        holder.descriptionView.text = description
        holder.catView.setImageResource(catImage)
    }

    inner class CatHolder : EpoxyHolder() {

        lateinit var breedView: TextView
        lateinit var descriptionView: TextView
        lateinit var catView: ImageView

        override fun bindView(itemView: View) {
            breedView = itemView.tvBreed
            descriptionView = itemView.tvDescription
            catView = itemView.ivCat
        }
    }
}