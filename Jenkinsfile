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
                        docker build -t caroon/springboot-demo:latest .
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
                        docker push caroon/springboot-demo:latest
                        docker rmi -f caroon/springboot-demo:latest
                    """
                }
            }
        }

    }
}
