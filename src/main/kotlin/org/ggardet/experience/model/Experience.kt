package org.ggardet.experience.model

import com.fasterxml.jackson.annotation.JsonProperty

data class Experience(
    @field:JsonProperty("name")
    val name: String? = null,

    @field:JsonProperty("short")
    val short: String? = null
)
