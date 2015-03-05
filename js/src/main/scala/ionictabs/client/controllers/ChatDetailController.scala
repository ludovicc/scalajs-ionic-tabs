package ionictabs.client.controllers

import biz.enef.angulate.Controller
import ionictabs.client.domain.Chat
import ionictabs.client.services.ChatsService

import scala.scalajs.js

class ChatDetailController($stateParams: js.Dynamic, chatsService: ChatsService) extends Controller {

  val chat: Chat = chatsService.get($stateParams.chatId.asInstanceOf[Int]).getOrElse(Chat.unknown)

}
