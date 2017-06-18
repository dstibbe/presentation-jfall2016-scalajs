package nl.quintor.presentation.slides

import nl.quintor.presentation.Section
import nl.quintor.reveal._

import scalatags.Text.all._

object Chap13Resources extends Section {
  override def content =
    section("Resources")(
      ul(
        li(a(href := "https://www.scala-js.org/")("Scala.js website")),
        li(a(href := "https://gitter.im/scala-js/scala-js")("Gitter"))
      )
    )
}
