package org.ggardet.experience.mapper

import org.ggardet.experience.entity.Mission
import org.ggardet.experience.model.MissionDTO
import kotlin.reflect.full.memberProperties

fun MissionDTO.toMissionEntity() = Mission(
    client = "$client",
    startDate = startDate!!,
    endDate = endDate!!,
    timelapse = "$timelapse",
    description = "$description"
)

fun Mission.toMissionDTO() = with(::MissionDTO) {
    val propertiesByName = Mission::class.memberProperties.associateBy { it.name }
    callBy(parameters.associateWith { parameter ->
        when (parameter.name) {
            MissionDTO::client.name -> client
            MissionDTO::startDate.name -> startDate
            MissionDTO::endDate.name -> endDate
            MissionDTO::timelapse.name -> client
            MissionDTO::description.name -> description
            else -> propertiesByName[parameter.name]?.get(this@toMissionDTO)
        }
    })
}