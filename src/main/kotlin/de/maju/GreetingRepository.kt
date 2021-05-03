package de.maju

import io.quarkus.hibernate.reactive.panache.PanacheRepository
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class GreetingRepository: PanacheRepository<GreetingEntity>
