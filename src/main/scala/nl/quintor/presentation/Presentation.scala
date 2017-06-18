package nl.quintor.presentation

import nl.quintor.presentation.slides._
import nl.quintor.reveal


object Presentation {
  lazy val myslides = reveal.slides
  lazy val html =
    myslides(
      Frontpage.content,
      Chap1AboutMe.content,
      Chap2Overview.content,
      Chap3JavaScript.content,
      Chap4Choice.content,
      Chap5Scala.content,
      Chap6Scalajs.content,
      Chap7GettingStarted.content,
      Chap8Libraries.content,
      Chap9Tooling.content,
      Chap10LiveCode.content,
      Chap11Future.content,
      Chap12Questions.content,
      Chap13Resources.content
    )
}
