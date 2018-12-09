pipeline {
    agent any
    stages {
        stage ('Build Docker Image') {
            when {
                branch 'master'
            }
            steps {
                script {
                    sh """
                        docker build -t springboot-demo:latest .
                    """
                }
            }
        }

        stage ('Push Docker Image') {
            when {
                branch 'master'
            }
            steps {
                script {
                    sh """
                        docker tag springboot-demo:latest docker.io/caroon/springboot-demo
                        docker push docker.io/caroon/springboot-demo:latest
                        docker rmi -f springboot-demo:latest
                    """
                }
            }
        }

    }
}
