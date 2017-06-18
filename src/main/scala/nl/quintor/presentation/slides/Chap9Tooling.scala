package nl.quintor.presentation.slides

import nl.quintor.presentation.Section
import nl.quintor.reveal._

import scalatags.Text.all._

object Chap9Tooling extends Section {
  override def content =
    section("Tooling")(
      subsection("Scala.js Fiddle")(
        p("Just like JavaScript fiddle"),
        scalaFiddle
      ),
      subsection("Dependency management")(
        ul(
          li("Webjars"),
          li("npm")
        )
      ),
      subsection("Workbench")(
        p("Li Haoyi (Dropbox)")
      )
    )
}
