package de.maju

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured
import org.hamcrest.CoreMatchers
import org.junit.jupiter.api.Test

@QuarkusTest
class ReactiveGreetingResourceTest {
    @Test
    fun testHelloEndpoint() {
        RestAssured.given()
            .`when`()["/hello-resteasy-reactive"]
            .then()
            .statusCode(200)
            .body(CoreMatchers.`is`("Hello RESTEasy Reactive"))
    }
}
