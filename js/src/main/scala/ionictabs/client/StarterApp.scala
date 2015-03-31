package ionictabs.client

import biz.enef.angulate._

import scala.scalajs.js.JSApp

object StarterApp extends JSApp {

  override def main(): Unit = {

    val app = angular.createModule("starter", Seq("ionic" /*, "ngCordova"*/, controllers.namespace, services.namespace ))

    app.run(PlatformInitializer.initializeIonic)
       .run(PlatformInitializer.initializeUIRouter)

    services.setup()
    controllers.setup()

    app.config(StateConfig.setupStates)
  }

}
