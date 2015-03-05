package ionictabs.client.controllers

import biz.enef.angulate.Controller
import ionictabs.client.domain.AccountSettings

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExportAll

// TODO: enableFriends should appear as enabled

class AccountController extends Controller {

  var settings = new AccountSettings(true)

}


