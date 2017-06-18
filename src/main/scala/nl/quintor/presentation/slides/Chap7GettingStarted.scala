package nl.quintor.presentation.slides

import nl.quintor.presentation.Section
import nl.quintor.reveal._

import scalatags.Text.all._

object Chap7GettingStarted extends Section {
  override def content =
    section("")(
      subsection("Getting started")(
        p("JDK and SBT"),
        p("Latest version uses Nodejs for the JavaScript engine (by default). Also requires the " +
          "jsdom npm dependency."),
        p("Previous version default was RhinoJS and Nashorn as alternative.")
      ),
      subsection("Run standalone")(
        p("scala.scalajs.js.JSApp")
      ),
      subsection("Access SJS from JS")(
        prettyCode(scala,
          """
            |package nl.quintor.demo.hello
            |
            |object MySpeaker {
            |  def sayMyName(name: String): String =  s"Speaker says: ${name}"
            |}
          """),
        fragment(
          prettyCode(scala,
            """
              |package nl.quintor.demo.hello
              |
              |import scala.scalajs.js
              |import js.annotation._
              |
              |@JSExport("SjsSpeaker")
              |object MySpeaker {
              |  @JSExport
              |  def sayMyName(name: String): String =  s"Speaker says: ${name}"
              |}
            """)
        ),
        fragment(
          prettyCode(javaScript,
            """SjsSpeaker().sayMyName("David")""")
        )
      ),
      subsection("Facades: Access JS from SJS")(
        p("JS Interfaces"),
        ul(
          li("Trait"),
          li("Extends js.Any (usually js.Object) "),
          li("@js.native")
        ),
        p("JS Classes"),
        ul(
          li("Class"),
          li("Extends js.Any (usually js.Object) "),
          li("@js.native"),
          li("@JSName({javascript name})")
        )
      ),
      subsection("Facades: Access JS from SJS")(
        p("Top Level objects"),
        ul(
          li("Object"),
          li("Extends js.Any (usually js.Object) "),
          li("@js.native"),
          li("@JSName({javascript name})")
        ),
        p("Global scope variables and functions"),
        ul(
          li("Object"),
          li("Extends js.Any (usually js.Object) "),
          li("@js.native"),
          li("@JSGlobalScope")
        )
      ),
      subsection("Facades: Access JS from SJS")(
        prettyCode(scala,
          """package nl.quintor.demo.facade
            |
            |import scala.scalajs.js
            |import scala.scalajs.js.annotation.JSExport
            |
            |@js.native
            |object HumptyDumpty extends js.Object {
            |  val name: String = js.native
            |}"""),

        fragment(
          prettyCode(scala,
            """package nl.quintor.demo.facade
              |@JSExport
              |object Pusher{
              |  @JSExport
              |  def pushHumpty():String = { s"I pushed an egg called ${HumptyDumpty.name}"}
              |}""")
        ),
        fragment(
          prettyCode(javaScript,
            """nl.quintor.demo.facade.Pusher().pushHumpty()""")
        )
      ),
      subsection("Debugging")(
        p("JavaScript source mapping")
      )
    )
}
