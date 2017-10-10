package gatling_sample

import gatling_sample.Simulation._
import io.gatling.core.Predef.atOnceUsers
import io.gatling.core.scenario.Simulation


class AppTest extends Simulation {

  setUp(
    theScenarioBuilder.inject(atOnceUsers(1))
  ).protocols(theHttpProtocolBuilder)

}


