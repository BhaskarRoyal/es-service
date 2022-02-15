node {
    def mvnHome
    stage('CheckOut SCM') { // for display purposes
        // Get some code from a GitHub repository
        git 'https://github.com/BhaskarRoyal/es-service.git'
        // Get the Maven tool.
        // ** NOTE: This 'M3' Maven tool must be configured
        // **       in the global configuration.
        mvnHome = tool 'maven'
    }
    stage('Build') {
        // Run the maven build
        withEnv(["MVN_HOME=$mvnHome"]) {
            if (isUnix()) {
                sh '"$MVN_HOME/bin/mvn" -Dmaven.test.failure.ignore clean package'
            } else {
                bat(/"%MVN_HOME%\bin\mvn" -Dmaven.test.failure.ignore clean package/)
            }
        }
    }
     
     stage('Publish test results') {
      junit '**\\surefire-reports\\*.xml'
     } 
   
    
    stage('Deploy') {
        withEnv(['TOMCAT_DIRECTORY=C:\\bhaskar\\apache-tomcat-8.5.75']) {
         if (isUnix()) {
                sh 'cp "$JENKINS_HOME/workspace/es-service-pipeline/target/Entittlement_Service-0.0.1-SNAPSHOT.war" "$TOMCAT_DIRECTORY/webapps/"'
            } else {
                bat 'copy  "%JENKINS_HOME%\\workspace\\es-service-pipeline\\target\\Entittlement_Service-0.0.1-SNAPSHOT.war" "%TOMCAT_DIRECTORY%\\webapps\\%'
            }
    }
        
    }
}
