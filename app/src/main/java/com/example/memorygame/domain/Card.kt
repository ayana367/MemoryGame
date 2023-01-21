package com.example.memorygame.domain

data class Card<Content>(
    val id:Int,
    var isFacedUp:Boolean = false,
    var isMatched:Boolean = false,
    var content:Content)