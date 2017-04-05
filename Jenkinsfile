#!/usr/bin/groovy

@Library('sharedPipeline@1.0.0') _

node {
  withSlackStatusReporting {
    stage("Setup") {
      git url: "git@github.com:jenkins-london-demo/echo.git", credentialsId: "github-credentials"
    }

    stage("Gradle Build") {
      gradle("clean compileJava")
    }

    stage("Gradle Test") {
      gradle("test")
    }

    stage("Gradle Package") {
      gradle("jar")
    }
  }
}
