package nl.quintor.presentation.slides

import nl.quintor.presentation.Section
import nl.quintor.reveal._

import scalatags.Text.all._

object Chap6Scalajs extends Section {
  override def content = section("")(
    subsection("Where does it come from?")(
      ul(
        li("Sébastien Doeraene"),
        li(a(href := "http://lampwww.epfl.ch/~doeraene/presentations/scala-js-scaladays2013")
        ("Scala Days 2013, June 12th")),
        li(a(href := "http://www.scala-lang.org/news/2015/02/05/scala-js-no-longer-experimental.html")
        ("Since februari 2015 (0.6) no longer experimental.")),
        li("Recently: 0.6.13: Use nodejs by default, support for CommonJS")
      )
    ),
    subsection("What does Scala.js offer?")(
      ul(
        li("Scala in the browser!"),
        li("Access Scala.js from JavaScript"),
        li("Facades for JavaScript libraries"),
        li("Can run standalone"),
        li("Cross compiling")
      )
    ),
    subsection("What to expect")(
      ul(
        li("real scala"),
        li("macro's, implicits, case classes, pattern matching, etc.")
      )
    ),
    subsection("Comparison")(
      revealImg("comparison.png")
    ),
    subsection("Limitations")(
      ul(
        li("no reflection on subtypes of js.Any (limited: java.lang.Class)"),
        li("limited Enumerations"),
        li("JVM Specific exceptions"),
        li("All primitive datatypes supported with small caveat")
      )
    ),
    subsection("Example")(
      div(canvas(id := "oscilloCanvas")),
      button(onclick := "nl.quintor.demo.oscillo.Oscillo().run('oscilloCanvas')")("Start oscillo"),
      p(small("Based on code from ", a(href := "http://www.lihaoyi.com/")("Li Haoyi")))
    )
  )
}
