package nl.quintor.presentation.slides

import nl.quintor.presentation.Section
import nl.quintor.reveal._

import scalatags.Text.all._

object Frontpage extends Section {
  override def content =
    frontpage("Scala.js")(
      revealImg("scalajs.svg")(attr("width") := "200"),
      subTitle("And why I like it"),
      p(
        small("Created by ",
          a(href := "http://dstibbe.nl")("David Stibbe"),
          " (",
          a(href := "https://twitter.com/dstibbe")("@dstibbe"),
          ")"

        )
      ),
      p(
        revealImg("quintor.png")
      )
    )
}
