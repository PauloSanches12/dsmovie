package com.paulo.dsmovie.entities

import java.io.Serializable
import javax.persistence.Embeddable
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Embeddable
data class ScorePK (
    @ManyToOne
    @JoinColumn(name = "movie_id")
    val movie: Movie,

    @ManyToOne
    @JoinColumn(name = "user_id")
    val user: User
): Serializable