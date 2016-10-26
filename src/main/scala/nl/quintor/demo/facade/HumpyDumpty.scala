package nl.quintor.demo.facade

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExport

@js.native
object HumptyDumpty extends js.Object {
  val name: String = js.native
}

@JSExport
object Pusher{
  @JSExport
  def pushHumpty():String = { s"I pushed an egg called ${HumptyDumpty.name}"}
}
