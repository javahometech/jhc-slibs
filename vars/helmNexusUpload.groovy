def call(repoName,helmPath){
   withCredentials([usernameColonPassword(credentialsId: 'nexus3', variable: 'USER')]) {
     sh "curl -u $USER http://172.31.2.39:8081/repository/${repoName}/ --upload-file  ${helmPath}"
    }
}
