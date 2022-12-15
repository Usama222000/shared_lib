def call(String buildResult) {
  if ( buildResult == "SUCCESS" ) {
    slackSend color: "good", message: "Build deployed successfully - JOB(${env.JOB_NAME}) BUILD#${env.BUILD_NUMBER} link:${env.BUILD_URL} ${currentBuild.getBuildCauses()[0].userName}"
  }
  else if( buildResult == "FAILURE" ) { 
     slackSend failOnError:true ,color : "danger" ,message: "Build failed  - JOB(${env.JOB_NAME}) BUILD#${env.BUILD_NUMBER} link:${env.BUILD_URL} ${currentBuild.getBuildCauses()[0].userName}"
  }
}
