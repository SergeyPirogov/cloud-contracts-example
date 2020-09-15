import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return true when age is 31"
    request{
        method GET()
        url("/age") {
            queryParameters {
                parameter("year", "29/07/1989")
            }
        }
    }
    response {
        body("{ \"age\": 31, \"sex\": \"male\" } ")
        status 200
        headers {
            contentType(applicationJson())
        }
    }
}
