package com.example.arquitecturaretrofit.models.DTO

class MarvelCharacterDTO(val name: String, val desc: String, var picUrl: String) {

    init {
        picUrl = picUrl.replace("http", "https")
    }

    override fun toString(): String {
        return "MarvelCharacterDTO(name='$name', desc='$desc', picUrl='$picUrl')"
    }
}