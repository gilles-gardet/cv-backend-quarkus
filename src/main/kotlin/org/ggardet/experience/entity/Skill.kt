package org.ggardet.experience.entity

import io.quarkus.hibernate.orm.panache.kotlin.PanacheEntity
import javax.persistence.Entity

@Entity
class Skill : PanacheEntity() {
    lateinit var name: String
    var rate: Int = 0
}