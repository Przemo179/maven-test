pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Przemo179/maven-test.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying application...'
            }
        }
    }
}
