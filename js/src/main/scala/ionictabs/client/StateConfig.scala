package ionictabs.client

import angulate.uirouter._
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
      .state("tab", State2.abstractUrl("/tab").templateUrl("templates/tabs.html"))

      // Each tab has its own nav history stack:

      .state("tab.dash", State2.url("/dash").views(
         Views.view("tab-dash", "templates/tab-dash.html", "DashController as dash")
       ))

      .state("tab.chats", State2.url("/chats").views(
        Views.view("tab-chats","templates/tab-chats.html", "ChatsController as chats")
      ))

      .state("tab.chat-detail", State2.url("/chats/:chatId").views(
        Views.view("tab-chats", "templates/chat-detail.html", "ChatDetailController as detail")
      ))

      .state("tab.friends", State2.url("/friends").views(
        Views.view("tab-friends", "templates/tab-friends.html", "FriendsController as friends")
      ))

      .state("tab.friend-detail", State2.url("/friend/:friendId").views(
        Views.view("tab-friends", "templates/friend-detail.html", "FriendDetailController as detail")
      ))

      .state("tab.account", State2.url("/account").views(
        Views.view("tab-account", "templates/tab-account.html", "AccountController as account")
       ))

    // if none of the above states are matched, use this as the fallback
    $urlRouterProvider.otherwise("/tab/dash")

  }
}
