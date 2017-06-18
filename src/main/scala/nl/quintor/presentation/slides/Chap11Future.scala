package nl.quintor.presentation.slides

import nl.quintor.presentation.Section
import nl.quintor.reveal._

import scalatags.Text.all._

object Chap11Future extends Section{
  override def content =
    section("Future of Scala.js")(
      ul(
        li("Roadmap is represented as a list of ")(a(href := "https://github.com/scala-js/scala-js/milestones")("issues on Github")),
        li("Will not be based upon asm.js")
      )
    )
}
