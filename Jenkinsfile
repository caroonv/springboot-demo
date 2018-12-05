pipeline {
    agent any
    stages {
        stage ('Build Docker Image') {
             steps {
                echo 'Starting Docker Daemon...'
                sudo service docker start
                echo 'Building Docker Image...'
                sh 'docker build -t springboot-demo:latest .'
            }
        }
    }
}