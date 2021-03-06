package ionictabs.client.domain

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExportAll

@JSExportAll
class Chat(val id: Long, val name: String, val lastText: String, val face: String)

object Chat {
  val unknown: Chat = new Chat(-1, "", "", "")

  def apply(id: Long, name: String, lastText: String, face: String) = new Chat(id, name, lastText, face)
}
