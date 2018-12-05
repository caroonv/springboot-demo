pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Running build automation'
                sh 'mvn clean build'
            }
        }

        stage ('Create Deployable') {
             steps {
                echo 'Installing Demo App...'
                sh 'mvn install'
                archiveArtifacts artifacts: 'target/springboot-demo-0.0.1-SNAPSHOT.jar'
            }
        }
    }
}