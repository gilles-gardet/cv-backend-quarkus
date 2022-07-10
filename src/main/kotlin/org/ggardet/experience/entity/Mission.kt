package org.ggardet.experience.entity

import com.fasterxml.jackson.annotation.JsonProperty
import io.quarkus.hibernate.orm.panache.kotlin.PanacheEntity
import java.time.LocalDate
import javax.persistence.Entity

@Entity
data class Mission(
    val client: String,
    val startDate: LocalDate,
    val endDate: LocalDate,
    val timelapse: String,
    val description: String,
) : PanacheEntity() {
    constructor() : this("", LocalDate.now(), LocalDate.now(), "", "")
}