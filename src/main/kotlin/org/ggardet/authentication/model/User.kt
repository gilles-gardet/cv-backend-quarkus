package org.ggardet.authentication.model

import io.quarkus.security.identity.SecurityIdentity

class User(identity: SecurityIdentity? = null, var userName: String? = null) {
    init {
        val principal = identity?.principal
        println("$principal")
        userName = identity?.principal?.name
    }
}