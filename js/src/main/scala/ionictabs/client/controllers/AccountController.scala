package ionictabs.client.controllers

import biz.enef.angulate.Controller
import ionictabs.client.domain.AccountSettings

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExportAll

@JSExportAll
class AccountController extends Controller {

  var settings = new AccountSettings(true)

}


