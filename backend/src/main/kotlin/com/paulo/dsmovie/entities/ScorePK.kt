package com.paulo.dsmovie.entities

import java.io.Serializable
import javax.persistence.Embeddable
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Embeddable
class ScorePK : Serializable {
    @ManyToOne
    @JoinColumn(name = "movie_id")
    private val movie: Movie? = null

    @ManyToOne
    @JoinColumn(name = "user_id")
    private val user: User? = null
}