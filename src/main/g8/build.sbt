name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "$scala_version$"

resolvers += ("releases" at "https://oss.sonatype.org/service/local/staging/deploy/maven2")

resolvers += ("snapshots" at "https://oss.sonatype.org/content/repositories/snapshots")

resolvers += ("Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/")

ethcfgScalaStubsPackage := "$scala_stubs_package$"
