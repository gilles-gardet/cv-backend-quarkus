package org.ggardet.experience.entity

import com.fasterxml.jackson.annotation.JsonProperty
import io.quarkus.hibernate.orm.panache.kotlin.PanacheEntity
import java.time.LocalDate
import javax.persistence.Entity

@Entity
data class Mission(
    @field:JsonProperty("client")
    val client: String? = null,

    @field:JsonProperty("startDate")
    val startDate: LocalDate? = null,

    @field:JsonProperty("endDate")
    val endDate: LocalDate? = null,

    @field:JsonProperty("timelapse")
    val timelapse: String? = null,

    @field:JsonProperty("description")
    val description: String? = null,
) : PanacheEntity() {
    constructor() : this("", LocalDate.now(), LocalDate.now(), "", "")
}