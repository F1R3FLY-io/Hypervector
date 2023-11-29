ThisBuild / version := "0.2.0.1"

ThisBuild / versionScheme := Some("early-semver")

//ThisBuild / scalaVersion := "3.2.1-RC1-bin-20220904-b5fea82-NIGHTLY"
ThisBuild / scalaVersion := "3.3.1"

ThisBuild / publishMavenStyle := true
//ThisBuild / publish / skip := true
ThisBuild / publishTo := Some(
  "GitHub Package Registry " at "https://maven.pkg.github.com/F1R3FLY-io/Hypervector"
)
ThisBuild / credentials += Credentials(
  "GitHub Package Registry", // realm
  "maven.pkg.github.com", // host
  "leithaus", // user
              //sys.env.getOrElse("GITHUB_TOKEN", "abc123")
              //"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" // password
              //"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"
  "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"
)

//resolvers += Resolver.sonatypeOssRepos("snapshots")
//resolvers += Resolver.mavenRepo("GitHub Packages" at "https://maven.pkg.github.com/Owner/Repository")
resolvers += "GitHub Packages" at "https://maven.pkg.github.com/F1R3FLY-io/Hypervector"

lazy val root = (project in file("."))
  .settings(
    name := "Hypervector",
    libraryDependencies += "be.adamv" %% "macroloop-core" % "0.17.2",
    libraryDependencies += "be.adamv" %% "macroloop-collection" % "0.17.2",
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test,
  )
