package ionictabs.client.controllers

import biz.enef.angulate.Controller
import ionictabs.client.services.FriendsService

import scala.scalajs.js.annotation.JSExportAll

@JSExportAll
class FriendsController(friendsService: FriendsService) extends Controller {

  val friends = friendsService.all

}
