name := "kubernetes-the-functional-way"

// I often declare and do not use things while developing
tpolecatExcludeOptions ++= ScalacOptions.warnUnusedOptions


lazy val root = (project in file("."))
  .aggregate(model)

lazy val model= (project in file("model"))