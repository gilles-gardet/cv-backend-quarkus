package org.ggardet.authentication.web

import io.quarkus.security.identity.SecurityIdentity
import org.ggardet.authentication.model.User
import org.jboss.resteasy.reactive.NoCache
import javax.annotation.security.RolesAllowed
import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.Path

@Path("/auth")
class AuthenticationController {

    @Inject
    lateinit var identity: SecurityIdentity

    @GET
    @Path("/me")
    @RolesAllowed("USER")
    @NoCache
    fun me(): User? = User(identity)
}