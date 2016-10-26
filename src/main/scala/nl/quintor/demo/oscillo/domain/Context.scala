
package nl.quintor.demo.oscillo.domain
import scala.scalajs.js

@js.native
trait Context extends js.Object {
  def clearRect(a: Double, b: Double, c: Double, d: Double): Unit = js.native

  var fillStyle: String = js.native

  def fillRect(a: Double, b: Double, c: Double, d: Double): Unit = js.native
}
