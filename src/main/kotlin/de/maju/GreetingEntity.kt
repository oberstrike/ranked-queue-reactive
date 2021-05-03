package de.maju

import io.quarkus.hibernate.reactive.panache.PanacheEntity
import javax.persistence.Entity

@Entity
class GreetingEntity(
    var message: String = "Hello"
) : PanacheEntity()
