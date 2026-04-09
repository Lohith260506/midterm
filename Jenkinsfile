pipeline {
    agent any
    stages {
        stage('Build & Test') {
            steps {
                sh 'mvn clean test'
            }
        }
        stage('Docker Build') {
            steps {
                sh 'docker build -t my-java-app .'
            }
        }
    }
}
