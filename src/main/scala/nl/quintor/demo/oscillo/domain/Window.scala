package nl.quintor.demo.oscillo.domain

import scala.scalajs.js

@js.native
trait Window extends js.Object {
  def setInterval(func: js.Function0[Unit], interval: Int): Unit = js.native
}
