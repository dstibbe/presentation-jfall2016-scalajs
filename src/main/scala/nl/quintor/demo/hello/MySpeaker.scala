package nl.quintor.demo.hello

import scala.scalajs.js.annotation._

@JSExport("SjsSpeaker")
object MySpeaker {
  @JSExport
  def sayMyName(name: String): String =  s"Speaker says: ${name}"
}
