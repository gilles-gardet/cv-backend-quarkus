package org.ggardet.experience.web

import org.ggardet.experience.model.Experience
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/experiences")
class ExperienceController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun experiences(): Experience {
        return Experience("name", "short")
    }
}