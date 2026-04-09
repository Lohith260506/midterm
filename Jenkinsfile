pipeline {
    agent any

    stages {
        stage('Build & Test') {
            steps {
                bat 'mvn clean test'
            }
        }

        stage('Docker Build') {
            steps {
                bat 'docker build -t my-java-app .'
            }
        }
    }
}
