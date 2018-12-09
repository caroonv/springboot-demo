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
                        sudo service docker start
                        sudo docker build -t springboot-demo .
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
