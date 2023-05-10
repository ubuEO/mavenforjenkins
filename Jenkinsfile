#!/usr/bin/env groovy

pipeline {

    agent {
        docker {
            image 'python'
            args '-u root'
        }
    }

    stages {
        stage('Build') {
            steps {
                echo 'Building.'
                sh 'mvn package'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing.'
                sh 'mvn package'
            }
        }
    }
}
