package org.ggardet.experience.web

import org.ggardet.experience.entity.Mission
import org.ggardet.experience.mapper.toMissionEntity
import org.ggardet.experience.model.MissionDTO
import org.ggardet.experience.repository.MissionRepository
import javax.annotation.security.RolesAllowed
import javax.inject.Inject
import javax.transaction.Transactional
import javax.validation.Valid
import javax.ws.rs.*
import javax.ws.rs.core.MediaType

@Path("/experiences")
@RolesAllowed("USER")
class ExperienceController {

    @Inject
    lateinit var missionRepository: MissionRepository

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    fun createExperience(@Valid missionDTO: MissionDTO): Mission {
        val missionEntity = missionDTO.toMissionEntity()
        missionRepository.persist(missionEntity)
        return missionEntity
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun findExperiences() = missionRepository.listAll()
}