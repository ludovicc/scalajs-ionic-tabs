package ionictabs.client.controllers

import biz.enef.angulate.Controller
import ionictabs.client.domain.Friend
import ionictabs.client.services.FriendsService

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExportAll

trait FriendDetailParams extends js.Object {
  val friendId: Long = js.native
}

@JSExportAll
class FriendDetailController($stateParams: FriendDetailParams, friendsService: FriendsService) extends Controller {

  val friend: Friend = friendsService.get($stateParams.friendId).getOrElse(Friend.unknown)

}
