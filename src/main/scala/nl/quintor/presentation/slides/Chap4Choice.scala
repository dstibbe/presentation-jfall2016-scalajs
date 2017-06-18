package nl.quintor.presentation.slides

import nl.quintor.presentation.Section
import nl.quintor.reveal._

import scalatags.Text.all._

object Chap4Choice extends Section{
  override def content = section("")(
    subsection("Transpilation")(
      p("To overcome the shortcomings of JavaScript"),

      fragment(
        ul(
          li("ES6"),
          li("Typescript"),
          li("Scalajs"),
          li("CoffeeScript"),
          li("Elm"),
          li("...")
        )
      )
    ),
    subsection("How did I come to Scala.js?")(
      fragment(
        p("Initialy: none.")
      ),
      fragment(
        ul(
          li("Yet another language"),
          li("Debugging"),
          li("adds complexity"),
          li("...")
        )
      )
    ),
    subsection("Web Stacks")(
      div(position := "relative")(paddingLeft := "20%", paddingBottom := "40%")(
        fragment(currentVisible,
          div(
            h4("2013 - JSF"),
            ul(
              li("Server: Java, Glassfish"),
              li("Frontend: Generated html & javascript"),
              li("Buildtool: maven")
            )
          )
        )(position := "absolute"),
        fragment(currentVisible,
          div(
            h4("2013 - Basic"),
            ul(
              li("Server: Java (Rest), Tomcat"),
              li("Frontend:  html, plain javascript (jQuery)"),
              li("Buildtool: maven")
            )
          )
        )(position := "absolute"),
        fragment(currentVisible,
          div(
            h4("2014 - MediaWiki"),
            ul(
              li("Server: Java (Rest), Tomcat"),
              li("Frontend:  php (MediaWiki) + javascript libs"),
              li("Buildtool: maven,grunt/gulp")
            )
          )
        )(position := "absolute"),
        fragment(currentVisible,
          div(
            h4("2014 - Scala"),
            ul(
              li("Server: Java (Rest), scala libs, Tomcat"),
              li("Frontend:  php generated (MediaWiki)"),
              li("Buildtool: maven,gulp")
            )
          )
        )(position := "absolute"),
        fragment(currentVisible,
          div(
            h4("2014 - Scala and Angular"),
            ul(
              li("Server: scala, Play"),
              li("Frontend:  JavaScript (AngularJs)"),
              li("Buildtool: sbt, gulp")
            )
          )
        )(position := "absolute"),
        fragment(currentVisible,
          div(
            h4("2015 - Scala and ScalaJs"),
            ul(
              li("Server: Scala, Play"),
              li("Frontend:  ScalaJs (scalajs-angular)"),
              li("Buildtool: sbt")
            )
          )
        )(position := "absolute")
      )
    ),
    subsection("Made it")(
      revealImg("made-it.jpg")(width := "800", height := "450")
    )
  )
}
