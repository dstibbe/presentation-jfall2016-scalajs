
package nl.quintor.demo.oscillo.domain

import scala.scalajs.js



@js.native
trait Canvas extends js.Object {
  def getContext(id: String): Context = js.native

  var height: Int = js.native
  var width: Int = js.native
}
