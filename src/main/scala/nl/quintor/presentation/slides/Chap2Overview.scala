package nl.quintor.presentation.slides

import nl.quintor.presentation.Section
import nl.quintor.reveal._

import scalatags.Text.all._

object Chap2Overview extends Section {
  override def content =
    section("Overview")(
      ul(
        li("Dislikings of JavaScript"),
        li("How I ended up at Scala.js"),
        li("Scala"),
        li("Scala.js"),
        li("Tools"),
        li("Live")
      )
    )
}
