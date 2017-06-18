package nl.quintor.presentation.slides

import nl.quintor.presentation.Section
import nl.quintor.reveal._

import scalatags.Text.all._

object Chap5Scala extends Section {
  override def content = section("")(
    subsection("Scala")(
      revealImg("scala-features.png")(width := "1024", height := "1024")
    ),
    subsection("Paradigm")(
      ul(
        li("Object Oriented"),
        li("Imperative"),
        li("Functional")
      )
    ),
    subsection("Typing")(
      ul(
        li("Statically Typed"),
        li("Type inference"),
        li("Structural (Duck) Typing ")
      )
    ),
    subsection("Support for DSL")(
      ul(
        li(
          p("arity-0, omission of parenthesis"),
          prettyCode(scala, """foobar() -> foobar""")
        ),
        li(
          p("arity-1, as infix operator"),
          prettyCode(scala,
            """class Person{
              |  def eats(something:Stuff)
              |}
              |
              |  -> john eats apples""".stripMargin)
        ),
        li("implicit conversion")
      )
    ),
    subsection("Support for DSL")(
      prettyCode(scala,
        """"2.0"~m  + "3.0"~km must beEqualTo("3002.0"~m)"""
      )
    )
  )
}
