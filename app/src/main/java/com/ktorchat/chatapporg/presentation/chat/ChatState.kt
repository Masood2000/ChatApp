package com.ktorchat.chatapporg.presentation.chat

import com.ktorchat.chatapporg.domain.model.Message

data class ChatState(
    val messages: List<Message> = emptyList(),
    val isLoading: Boolean = false
)