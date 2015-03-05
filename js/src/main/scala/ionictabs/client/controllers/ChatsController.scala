package ionictabs.client.controllers

import biz.enef.angulate.Controller
import ionictabs.client.domain.Chat
import ionictabs.client.services.ChatsService

class ChatsController(chatsService: ChatsService) extends Controller {

  var chats = chatsService.all

  def remove(chat: Chat) = {
    chats = chatsService.remove(chat)
  }

}
