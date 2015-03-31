package ionictabs.client

import angulate.ionic.{Platform => IonicPlatform}
import angulate.cordova._
import angulate.cordova.plugins.StatusBar._
import angulate.uirouter.State
import biz.enef.angulate.{Scope, AnnotatedFunction}
import biz.enef.angulate.AnnotatedFunction._

import scala.scalajs.js

object PlatformInitializer {

  val initializeIonic: AnnotatedFunction = annotatedFunction { $ionicPlatform: IonicPlatform =>
    $ionicPlatform.ready { () =>
      // TODO : use ngCordova to communicate with the cordova API in an angular way
      // TODO : find a way to use cordova plugins with ionic serve in a web browser.

      cordova.foreach { c =>
        // Hide the accessory bar by default (remove this to show the accessory bar above the keyboard
        // for form inputs)
        c.plugins.Keyboard.foreach { _.hideKeyboardAccessoryBar(true) }
      }

      // org.apache.cordova.statusbar required
      statusBar.foreach {_.styleDefault() }
    }
  }

  val initializeUIRouter: AnnotatedFunction = annotatedFunction { $rootScope: Scope => {

      val onError: js.Function = (event: js.Dynamic, toState: String, toParams: js.Dynamic, fromState: String, fromParams: js.Dynamic, error: String) => {
        js.Dynamic.global.console.log("Error from state " + fromState + " to state " + toState + ": " + error)
      }
      $rootScope.$on("$stateChangeError", onError)
    }
  }
}

