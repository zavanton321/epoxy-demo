package ru.zavanton.moreepoxydemo.viewmodel

import com.airbnb.epoxy.EpoxyController
import ru.zavanton.moreepoxydemo.data.CatRepo
import ru.zavanton.moreepoxydemo.model.Cat
import ru.zavanton.moreepoxydemo.model.epoxy.CatModel_

class CatController : EpoxyController() {

    private val cats: List<Cat> = CatRepo.cats

    private var index: Int = 0

    override fun buildModels() {
        cats.forEach { cat ->
            CatModel_()
                .id(index++)
                .breed(cat.breed)
                .description(cat.description)
                .catImage(cat.image)
                .addTo(this)
        }
    }
}