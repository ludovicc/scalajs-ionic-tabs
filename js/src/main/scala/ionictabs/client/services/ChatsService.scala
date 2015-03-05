package ionictabs.client.services

import biz.enef.angulate.Service
import ionictabs.client.domain.Chat

class ChatsService extends Service {

  // Might use a resource here that returns a JSON array

  // Some fake testing data
  private var chats = Seq[Chat](
    Chat(
      id = 0,
      name= "Ben Sparrow",
      lastText = "You on your way?",
      face = "https =//pbs.twimg.com/profile_images/514549811765211136/9SgAuHeY.png"
    ), Chat(
      id = 1,
      name = "Max Lynx",
      lastText = "Hey, it\"s me",
      face = "https =//avatars3.githubusercontent.com/u/11214?v=3&s=460"
    ), Chat(
      id = 2,
      name = "Andrew Jostlin",
      lastText = "Did you get the ice cream?",
      face = "https =//pbs.twimg.com/profile_images/491274378181488640/Tti0fFVJ.jpeg"
    ), Chat(
      id = 3,
      name = "Adam Bradleyson",
      lastText = "I should buy a boat",
      face = "https =//pbs.twimg.com/profile_images/479090794058379264/84TKj_qa.jpeg"
    ), Chat(
      id = 4,
      name = "Perry Governor",
      lastText = "Look at my mukluks!",
      face = "https =//pbs.twimg.com/profile_images/491995398135767040/ie2Z_V6e.jpeg"
    ))

  def all: Seq[Chat] = chats

  def remove(chat: Chat): Seq[Chat] = {
    chats = chats.filter(_ == chat)
    chats
  }

  def get(chatId: Int): Option[Chat] = chats.find(_.id == chatId)

}
