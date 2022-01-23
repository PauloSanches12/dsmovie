package com.paulo.dsmovie.services

import com.paulo.dsmovie.entities.Movie
import com.paulo.dsmovie.repositories.MovieRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.*

@Service
class MovieService(val movieRepository: MovieRepository) {

    @Transactional(readOnly = true)
    fun findAll(pageable: Pageable): Page<Movie> {
        return movieRepository.findAll(pageable)
    }

    @Transactional(readOnly = true)
    fun findById(id: Long): Optional<Movie> {
        return movieRepository.findById(id)
    }
}