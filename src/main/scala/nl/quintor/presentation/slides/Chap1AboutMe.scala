package nl.quintor.presentation.slides

import nl.quintor.presentation.Section
import nl.quintor.reveal._

import scalatags.Text.all._


object Chap1AboutMe extends Section {
  override def content =
    section("About me")(
      ul(
        li("Java developer by day, Scala by night"),
        fragment(
          li("and dad")
        )
      )
    )
}
