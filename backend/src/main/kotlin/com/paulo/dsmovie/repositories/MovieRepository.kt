package com.paulo.dsmovie.repositories

import com.paulo.dsmovie.entities.Movie
import org.springframework.data.jpa.repository.JpaRepository

interface MovieRepository: JpaRepository<Movie, Long> {
}