package ionictabs.client.domain

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExportAll

@JSExportAll
class Friend(val id: Long, val name: String, val notes: String, val face: String)

object Friend {
  val unknown: Friend = new Friend(-1, "", "", "")

  def apply(id: Long, name: String, notes: String, face: String) = new Friend(id, name, notes, face)
}
