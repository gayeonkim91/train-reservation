package my.gayeon.reservation.api.controller

import my.gayeon.reservation.api.controller.dto.ResponseDto
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ReservationApiControllerAdvice {

    @ExceptionHandler(Exception::class)
    fun defaultExceptionHandler(e: Exception): ResponseDto<Exception> {
        return ResponseDto(false, e.message ?: "", e)
    }
}