pipeline {
    agent any
    stages {
        stage('Fetch Code') {
            steps {
                git 'https://github.com'
            }
        }
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
