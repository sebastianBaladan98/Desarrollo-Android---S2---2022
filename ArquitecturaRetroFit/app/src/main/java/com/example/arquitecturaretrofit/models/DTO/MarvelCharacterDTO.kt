package com.example.arquitecturaretrofit.models.DTO

class MarvelCharacterDTO(
    val id: Int,
    val name: String,
    val desc: String,
    var picUrl: String,
    val comicApps: Int,
    val seriesApps: Int
) {

    init {
        picUrl = picUrl.replace("http", "https")
    }

    override fun toString(): String {
        return "MarvelCharacterDTO(id=$id, name='$name', desc='$desc', picUrl='$picUrl', comicApps=$comicApps, seriesApps=$seriesApps)"
    }
}