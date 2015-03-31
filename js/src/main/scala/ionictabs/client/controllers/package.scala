package ionictabs.client

import biz.enef.angulate._

package object controllers {

  val namespace = "starter.controllers"

  def setup(): Unit = {
    val module = angular.createModule(namespace, Nil)
    module.controllerOf[DashController]         ("DashController")
    module.controllerOf[ChatsController]        ("ChatsController")
    module.controllerOf[ChatDetailController]   ("ChatDetailController")
    module.controllerOf[FriendsController]      ("FriendsController")
    module.controllerOf[FriendDetailController] ("FriendDetailController")
    module.controllerOf[AccountController]      ("AccountController")
  }
}
