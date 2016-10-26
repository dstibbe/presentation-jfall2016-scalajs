name := "why-i-like"

scalaVersion in ThisBuild := "2.11.7"

enablePlugins(ScalaJSPlugin)
enablePlugins(SbtWeb)

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.0",
  "biz.enef" %%% "slogging" % "0.4.0",
  "com.lihaoyi" %%% "scalatags" % "0.6.1"
)


jsDependencies ++= Seq(
  RuntimeDOM,
  "org.webjars.bower" % "headjs" % "1.0.3" / "1.0.0/head.min.js" ,
  "org.webjars.bower" % "reveal.js" % "3.3.0" / "reveal.js" dependsOn "1.0.0/head.min.js"
  )
