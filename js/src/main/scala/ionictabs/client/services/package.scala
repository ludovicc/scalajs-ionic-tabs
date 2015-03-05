package ionictabs.client

import biz.enef.angulate._

package object services {

  val namespace = "starter.services"

  def setup(): Unit = {
    val module = angular.createModule(namespace, Nil)
    module.serviceOf[ChatsService]
  }

}
