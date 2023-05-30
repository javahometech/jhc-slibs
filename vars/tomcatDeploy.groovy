def call(user,ip,credId,warName){
  sshagent([credId]) {
    sh "scp -o StrictHostKeyChecking=no target/${warName}.war ${user}@${ip}:/opt/tomcat9/webapps/"
    sh "ssh ${user}@${ip} /opt/tomcat9/bin/shutdown.sh"
      sh "ssh ${user}@${ip} /opt/tomcat9/bin/startup.sh"
    }
}
