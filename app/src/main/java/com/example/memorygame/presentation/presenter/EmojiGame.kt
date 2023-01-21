package com.example.memorygame.presentation.presenter

import com.example.memorygame.domain.Card
import com.example.memorygame.domain.Game

class EmojiGame {
    private val emojiGame= Game (listOf("\uD83C\uDF2E","\uD83C\uDF71","\uD83E\uDD5E","\uD83E\uDDC1","\uD83C\uDF6B","\uD83C\uDF5C").shuffled())
    fun emojiCard()=emojiGame.getCards()fun emojiCardClick(cardModel: Card<String>){
        emojiGame.onCardClick(cardModel)}
}