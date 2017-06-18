package nl.quintor.presentation.slides

import nl.quintor.presentation.Section
import nl.quintor.reveal._

import scalatags.Text.all._

object Chap8Libraries extends Section{
  override def content =
    section("")(
      subsection("JavaScript library facades")(
        ul(
          li("scala-js-dom"),
          li("scalajs-jquery"),
          li("scalajs-angular"),
          etc
        )
      ),
      subsection("Scala Libraries")(
        ul(
          li("scalajs-java-time"),
          li("Scalaz"),
          li("uPickle"),
          li("Scala.Rx"),
          etc
        )
      ),
      subsection("Testing")(
        ul(
          li("uTest"),
          li("ScalaTest"),
          li("MiniTest"),
          etc
        )
      )
    )
}
