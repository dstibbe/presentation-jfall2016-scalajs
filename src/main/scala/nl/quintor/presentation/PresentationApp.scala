package nl.quintor.presentation


import org.scalajs.dom
import org.scalajs.dom.raw.Element

import scala.scalajs.js.annotation.JSExport

@JSExport
object PresentationApp {
  @JSExport
  def main() = {
    val reveal = dom.document.getElementsByClassName("reveal")(0).asInstanceOf[Element]
    reveal.innerHTML = Presentation.html.render
  }
}
