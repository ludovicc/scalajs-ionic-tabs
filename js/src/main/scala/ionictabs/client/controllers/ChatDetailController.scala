package ionictabs.client.controllers

import biz.enef.angulate.Controller
import ionictabs.client.domain.Chat
import ionictabs.client.services.ChatsService

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExportAll

trait ChatDetailParams extends js.Object {
  val chatId: Long = js.native
}

@JSExportAll
class ChatDetailController($stateParams: ChatDetailParams, chatsService: ChatsService) extends Controller {

  val chat: Chat = chatsService.get($stateParams.chatId).getOrElse(Chat.unknown)

}
