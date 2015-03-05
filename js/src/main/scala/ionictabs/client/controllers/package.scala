package ionictabs.client

import biz.enef.angulate._

package object controllers {

  val namespace = "starter.controllers"

  def setup(): Unit = {
    val module = angular.createModule(namespace, Nil)
    module.controllerOf[DashController]         ("DashCtrl")
    module.controllerOf[ChatsController]        ("ChatsCtrl")
    module.controllerOf[ChatDetailController]   ("ChatDetailCtrl")
    module.controllerOf[FriendsController]      ("FriendsCtrl")
    module.controllerOf[FriendDetailController] ("FriendDetailCtrl")
    module.controllerOf[AccountController]      ("AccountCtrl")
  }
}
