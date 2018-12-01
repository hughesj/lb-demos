addSbtPlugin("com.lightbend.rp" % "sbt-reactive-app" % "1.3.1")

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.3.4")

addSbtPlugin("com.lightbend.cinnamon" % "sbt-cinnamon" % "2.10.10")

resolvers += Resolver.url("lightbend-commercial", url("https://repo.lightbend.com/commercial-releases"))(Resolver.ivyStylePatterns)
