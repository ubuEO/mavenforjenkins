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
                echo 'Building...'
                sh 'mvn package'
            }
        }
}
