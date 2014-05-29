lazy val plugins = (project in file("."))
  .dependsOn(buildPlugin, yuiCompressorPlugin)

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.6.0")

lazy val buildPlugin = uri("git://github.com/lift/sbt-lift-build.git#724fb133be")

lazy val yuiCompressorPlugin = uri("git://github.com/indrajitr/sbt-yui-compressor.git#89304ec0c9")