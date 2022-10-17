package com.example.arquitecturaretrofit.models.converter

import com.example.arquitecturaretrofit.models.DTO.MarvelCharacterDTO
import com.example.arquitecturaretrofit.models.Result

object MarvelCharacterConverter {

    fun toMarvelCharacter(char: Result): MarvelCharacterDTO {
        return MarvelCharacterDTO(
            char.id,
            char.name,
            char.description,
            "${char.thumbnail.path}.${char.thumbnail.extension}",
            char.comics.available,
            char.series.available
        )
    }

}