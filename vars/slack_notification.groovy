def call(String buildResult) {
  if ( buildResult == "SUCCESS" ) {
    slackSend color: "good", message: "Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} ${env.BUILD_URL} was successful - ${currentBuild.getBuildCauses()[0].userName}"
  }
  else if( buildResult == "FAILURE" ) { 
    slackSend color: "danger", message: "Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} ${env.BUILD_URL} was failed - ${currentBuild.getBuildCauses()[0].userName}"
  }
  else if( buildResult == "UNSTABLE" ) { 
    slackSend color: "warning", message: "Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} ${env.BUILD_URL} was unstable - ${currentBuild.getBuildCauses()[0].userName}"
  }
  else {
    slackSend color: "danger", message: "Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} ${env.BUILD_URL} was unclear - ${currentBuild.getBuildCauses()[0].userName}"	
  }
}
