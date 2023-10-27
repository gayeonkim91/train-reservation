package my.gayeon.reservation.api.controller

import my.gayeon.reservation.api.controller.dto.ResponseDto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DefaultController {
    @GetMapping("/")
    fun main(): ResponseDto<String> {
        return ResponseDto(true, "success", "Hello, worlds!")
    }
}