package ionictabs.client

import angulate.ionic.{Platform => IonicPlatform}
import angulate.cordova._
import angulate.cordova.plugins.StatusBar._
import biz.enef.angulate.AnnotatedFunction
import biz.enef.angulate.AnnotatedFunction._

import scala.scalajs.js

object PlatformInitializer {

  val initialize: AnnotatedFunction = annotatedFunction { $ionicPlatform: IonicPlatform =>
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
}

