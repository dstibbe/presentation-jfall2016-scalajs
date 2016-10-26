package nl.quintor

import scalatags.Text.TypedTag
import scalatags.Text.all._
import scalatags.generic.AttrPair
import scalatags.text.Builder


package object reveal {
  def frontpage(name: String) = tag("section")(id := s"title-${name}")(presentationTitle(name))
  def section(name: String) = tag("section")(id := name)(heading(name))
  def subsection(name: String) = tag("section")(id := name)(h3(name))

  def section = tag("section")

  lazy val slides = div(cls := "slides")
  lazy val presentationTitle = h1
  lazy val subTitle = h3
  lazy val heading = h2
  lazy val inlinequote = tag("q")
  lazy val etc = li("...")

  def revealImg(src:String) = img(attr("data-src") := s"./publish/assets/${src}")

  def revealIframe( src: String) = {
    iframe(height:="1000px", width:="1000px",
      attr("frameborder"):="0",
      attr("marginwidth"):="0",
      attr("marginheight"):="0",
      attr("scrolling"):="no",
      style:="border:3px solid #666; margin-bottom:5px; max-width: 100%;",
      attr("allowfullscreen").empty,
      attr("data-src"):=src)
  }

  lazy val scalaFiddle = a(href:="https://scalafiddle.io/",attr("data-preview-link").empty)("fiddle me")

  case class CodeStyle(value: String)
  lazy val javaScript = CodeStyle("JavaScript")

  lazy val scala = CodeStyle("scala")

  def prettyCode(style: CodeStyle, codeContent: String) = {
    pre(code(cls := s"hljs ${style.value}", contenteditable.empty, attr("data-trim").empty)
    (codeContent.stripMargin))
  }


  def regCode(codeContent: String) = {
    pre(codeContent)
  }

  case class FragmentType(frag: String)
  lazy val grow = FragmentType("grow")
  lazy val highlightRed = FragmentType("highlight-red")
  lazy val shrink = FragmentType("shrink")
  lazy val fadeOut = FragmentType("fade-out")
  lazy val fadeUp = FragmentType("fade-up")
  lazy val currentVisible = FragmentType("current-visible")


  def fragment[ T <: String](tag: TypedTag[T]): TypedTag[T] = {
    tag(fragment)
  }
  def fragment[ T <: String](fragType: FragmentType, tag: TypedTag[T]): TypedTag[T] = {
    tag(fragment(fragType))
  }

  def fragment = cls := "fragment"

  def fragment(fragType: FragmentType): AttrPair[Builder, String] = fragType match {
    case FragmentType(name: String) =>
      cls := s"fragment ${name}"
    case _ => cls := "fragment"
  }
}
