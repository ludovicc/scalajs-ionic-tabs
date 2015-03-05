package ionictabs.client

import angulate.uirouter.{View, State, UrlRouterProvider, StateProvider}
import biz.enef.angulate.AnnotatedFunction
import biz.enef.angulate.AnnotatedFunction._

import scala.scalajs.js

object StateConfig {

  val setupStates: AnnotatedFunction = annotatedFunction { ($stateProvider: StateProvider, $urlRouterProvider: UrlRouterProvider) =>

    // Ionic uses AngularUI Router which uses the concept of states
    // Learn more here: https://github.com/angular-ui/ui-router
    // Set up the various states which the app can be in.
    // Each state"s controller can be found in controllers.js
    $stateProvider

      // setup an abstract state for the tabs directive
      .state("tab", State
        (
          url = "/tab",
          isAbstract = true,
          templateUrl = "templates/tabs.html"
        ))

    // Each tab has its own nav history stack:

      .state("tab.dash", State
        (
          url = "/dash",
          views = Map(
            "tab-dash" -> View (
              templateUrl = "templates/tab-dash.html",
              controller = "DashCtrl"
            )
          )
        ))

      .state("tab.chats", State
        (
          url = "/chats",
          views = Map(
            "tab-chats" -> View (
              templateUrl = "templates/tab-chats.html",
              controller = "ChatsCtrl "
            )
          )
      )) /*
    .state("tab.chat - detail ",
    (
      url = "/ chats / = chatId ",
      views = (
        "tab - chats " = (
        templateUrl = "templates / chat - detail.html ",
        controller = "ChatDetailCtrl "
      )
      )
    ))

    .state("tab.friends ",
    (
      url = "/ friends ",
      views = (
        "tab - friends " = (
        templateUrl = "templates / tab - friends.html ",
        controller = "FriendsCtrl "
      )
      )
    ))
    .state("tab.friend - detail ",
    (
      url = "/ friend / = friendId ",
      views = (
        "tab - friends " = (
        templateUrl = "templates / friend - detail.html ",
        controller = "FriendDetailCtrl "
      )
      )
    ))

    .state("tab.account ",
    (
      url = "/ account ",
      views = (
        "tab - account " = (
        templateUrl = "templates / tab - account.html ",
        controller = "AccountCtrl "
      )
      )
    ));
*/
    // if none of the above states are matched, use this as the fallback
    $urlRouterProvider.otherwise("/tab/dash")

  }
}
