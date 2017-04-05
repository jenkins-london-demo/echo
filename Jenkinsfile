#!/usr/bin/groovy

@Library('sharedPipeline@1.0.0') _

node {
  withSlackStatusReporting {
    stage("Setup") {
      git url: "git@github.com:jenkins-london-demo/echo.git", credentialsId: "github-credentials"
    }

    stage("Gradle Build") {
      String gradleHome = tool 'Gradle 2.14.1'
      sh "${gradleHome}/bin/gradle clean compileJava"
    }

    stage("Gradle Test") {
      String gradleHome = tool 'Gradle 2.14.1'
      sh "${gradleHome}/bin/gradle test"
    }

    stage("Gradle Package") {
      String gradleHome = tool 'Gradle 2.14.1'
      sh "${gradleHome}/bin/gradle jar"
    }
  }
}
