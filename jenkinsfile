post {
    success {
        slackSend color: "good", message: "Build deployed successfully - JOB(${env.JOB_NAME}) BUILD#${env.BUILD_NUMBER} link:${env.BUILD_URL} ${currentBuild.getBuildCauses()[0].userName}"
    }
    failure {
        slackSend failOnError:true ,color : "danger" ,message: "Build failed  - JOB(${env.JOB_NAME}) BUILD#${env.BUILD_NUMBER} link:${env.BUILD_URL} ${currentBuild.getBuildCauses()[0].userName}"
    }
}
