package org.ggardet.experience.repository

import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import org.ggardet.experience.entity.Mission
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class MissionRepository : PanacheRepository<Mission> {
    fun findByClient(client: String) = find("client", client).firstResult()
}