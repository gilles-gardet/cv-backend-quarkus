package org.ggardet.experience.entity

import io.quarkus.hibernate.orm.panache.kotlin.PanacheEntity
import java.time.LocalDate
import javax.persistence.Entity

@Entity
class Mission(
    var client: String?,
    var startDate: LocalDate?,
    var endDate: LocalDate?,
    var timelapse: String?,
    var description: String?
) : PanacheEntity() {
    constructor() : this("", LocalDate.now(), LocalDate.now(), "", "")
}