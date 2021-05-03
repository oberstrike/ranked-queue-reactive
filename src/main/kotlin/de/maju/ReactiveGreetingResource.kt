package de.maju


import io.smallrye.mutiny.Uni
import javax.enterprise.context.ApplicationScoped
import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello-resteasy-reactive")
@ApplicationScoped
class ReactiveGreetingResource {

    @Inject
    lateinit var greetingRepository: GreetingRepository

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello(): Uni<List<GreetingEntity>> {
        return greetingRepository.findAll().list()
    }
}


