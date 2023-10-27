package my.gayeon.reservation.api.controller.dto

import kotlinx.serialization.Serializable

@Serializable
data class ResponseDto<T>(
    val success: Boolean,
    val message: String = "",
    val content: T?
)