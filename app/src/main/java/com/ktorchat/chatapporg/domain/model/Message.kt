package com.ktorchat.chatapporg.domain.model

data class Message(
    val text: String,
    val formattedTime: String,
    val username: String
)