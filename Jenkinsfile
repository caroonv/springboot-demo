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
                        docker build -t caroon/springboot-demo .
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
                        docker tag springboot-demo:latest caroon/springboot-demo
                        docker push caroon/springboot-demo
                        docker rmi -f caroon/springboot-demo
                    """
                }
            }
        }

    }
}
