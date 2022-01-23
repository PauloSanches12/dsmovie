package com.paulo.dsmovie.controllers

import com.paulo.dsmovie.entities.Movie
import com.paulo.dsmovie.services.MovieService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("movies")
class MovieController(val movieService: MovieService) {

    @GetMapping
    fun findAll(pageable: Pageable): Page<Movie> {
        return movieService.findAll(pageable)
    }

    @GetMapping("/{id}")
    fun find(@PathVariable id: Long): Optional<Movie> {
        return movieService.findById(id)
    }
}