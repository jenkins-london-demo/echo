#!/usr/bin/groovy

node {
  try {
    slackSend(
      message: "Job started: <${env.BUILD_URL}console|${env.JOB_NAME} #${env.BUILD_NUMBER}>",
      channel: "#jenkins-london-demo",
      color: "good",
      teamDomain: "askattest",
      tokenCredentialId: "slack-token"
    )

    stage("Setup") {
      git url: "git@github.com:jenkins-london-demo/echo.git", credentialsId: "github-credentials"
    }

    stage("Gradle Build") {
      sh "gradle clean compileJava"
    }

    stage("Gradle Test") {
      sh "gradle test"
    }

    stage("Gradle Package") {
      sh "gradle jar"
    }

    slackSend(
      message: "Job success! <${env.BUILD_URL}console|${env.JOB_NAME} #${env.BUILD_NUMBER}>",
      channel: "#jenkins-london-demo",
      color: "good",
      teamDomain: "askattest",
      tokenCredentialId: "slack-token"
    )
  } catch (exception) {
    slackSend(
      message: "Job success! <${env.BUILD_URL}console|${env.JOB_NAME} #${env.BUILD_NUMBER}>",
      channel: "#jenkins-london-demo",
      color: "danger",
      teamDomain: "askattest",
      tokenCredentialId: "slack-token"
    )
    throw exception
  } finally {
    // Do some cleanup, if necessary
  }
}
