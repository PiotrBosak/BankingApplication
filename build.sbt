import Dependencies._
ThisBuild / organization := "com.example"
ThisBuild / scalaVersion := "2.13.5"

lazy val root = (project in file(".")).settings(
  name := "banking-application",
    scalacOptions ++= List("-Ymacro-annotations", "-Yrangepos", "-Wconf:cat=unused:info"),
  libraryDependencies ++= Seq(
    // "core" module - IO, IOApp, schedulers
    // This pulls in the kernel and std modules automatically.
    Libraries.cats,
    Libraries.catsEffect,
    //Libraries.catsRetry,
    Libraries.circeCore,
    Libraries.circeGeneric,
    Libraries.circeParser,
    Libraries.circeRefined,
    Libraries.fs2,
    Libraries.http4sDsl,
    Libraries.http4sServer,
    Libraries.http4sClient,
    Libraries.http4sCirce,
    Libraries.http4sJwtAuth,
    Libraries.log4cats,
    // better monadic for compiler plugin as suggested by documentation
    compilerPlugin("com.olegpy" %% "better-monadic-for" % "0.3.1"),
    "org.typelevel" %% "munit-cats-effect-3" % "1.0.5" % Test
  )
)
