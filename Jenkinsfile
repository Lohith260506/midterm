pipeline {
    agent any
    environment {
        // Change these to match your Docker Hub account
        DOCKER_REPO = "your_username/java-console-app"
        DOCKER_HUB_CREDS = 'docker-hub-creds' 
    }
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build Maven') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Build Docker Image') {
            steps {
                script {
                    // This builds the image locally on the Jenkins server
                    dockerImage = docker.build("${DOCKER_REPO}:${env.BUILD_NUMBER}")
                }
            }
        }
        stage('Push to Docker Hub') {
            steps {
                script {
                    // This logs into Docker Hub and pushes the image
                    docker.withRegistry('https://docker.io', DOCKER_HUB_CREDS) {
                        dockerImage.push()
                        dockerImage.push("latest")
                    }
                }
            }
        }
    }
}
