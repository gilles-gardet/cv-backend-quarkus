package org.ggardet.experience.web

import org.ggardet.experience.entity.Mission
import org.ggardet.experience.repository.MissionRepository
import java.time.LocalDate
import javax.annotation.security.RolesAllowed
import javax.inject.Inject
import javax.transaction.Transactional
import javax.ws.rs.GET
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType


@Path("/experiences")
@RolesAllowed("USER")
class ExperienceController {

    @Inject
    lateinit var missionRepository: MissionRepository

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    fun createExperience(): Mission {
        val mission = Mission(
            "Air France" + LocalDate.now(),
            LocalDate.now(),
            LocalDate.now(),
            "test",
            "My first persisted mission",
        )
        missionRepository.persist(mission)
        return mission
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun findExperiences() = missionRepository.listAll()
}