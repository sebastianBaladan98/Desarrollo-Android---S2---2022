package com.example.arquitecturaretrofit.models.DTO

import com.example.arquitecturaretrofit.models.Result

object MarvelCharacterConverter {

    fun toMarvelCharacter(char: Result): MarvelCharacterDTO {
        val name = char.name
        val desc = char.description
        val picUrl = "${char.thumbnail.path}.${char.thumbnail.extension}"

        return MarvelCharacterDTO(name, desc, picUrl)
    }

}