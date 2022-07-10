package org.ggardet.error

import org.ggardet.error.model.BadRequestException
import javax.ws.rs.core.Response
import javax.ws.rs.ext.ExceptionMapper

class ErrorHandler : ExceptionMapper<BadRequestException> {
    override fun toResponse(exception: BadRequestException): Response =
        Response.status(Response.Status.BAD_REQUEST).entity(exception.message).build()
}