package com.paulo.dsmovie.entities

import javax.persistence.EmbeddedId
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "tb_score")
data class Score(

    @EmbeddedId
    val id: ScorePK,
    val value: Double
)