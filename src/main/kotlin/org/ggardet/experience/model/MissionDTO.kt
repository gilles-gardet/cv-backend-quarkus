package org.ggardet.experience.model

import com.fasterxml.jackson.annotation.JsonProperty
import org.hibernate.validator.constraints.Length
import java.time.LocalDate
import javax.validation.constraints.*

data class MissionDTO(
    @field:JsonProperty("client", required = true)
    @field:NotBlank
    @field:Length(min = 1, max = 100)
    val client: String,

    @field:JsonProperty("startDate", required = true)
    @field:Past
    val startDate: LocalDate,

    @field:JsonProperty("endDate", required = true)
    val endDate: LocalDate,

    @field:JsonProperty("timelapse", required = true)
    @field:NotBlank
    val timelapse: String,

    @field:JsonProperty("description", required = true)
    @field:NotBlank
    @field:Length(min = 1, max = 500)
    val description: String,
)