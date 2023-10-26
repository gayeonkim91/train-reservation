package my.gayeon.reservation.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class ReservationApiApplication

fun main(args: Array<String>) {
    runApplication<ReservationApiApplication>(*args)
}
