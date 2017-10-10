package gatling_sample

import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder
import io.gatling.http.Predef._
import io.gatling.http.protocol.HttpProtocolBuilder


object Simulation {

  val theHttpProtocolBuilder: HttpProtocolBuilder = http
    .baseURL("https://jsonplaceholder.typicode.com")

  val theScenarioBuilder: ScenarioBuilder = scenario("Scenario1")
    .exec(
      http("myRequest1").get("/posts")
    )



}
