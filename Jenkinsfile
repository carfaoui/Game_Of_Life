pipeline {
  agent {
    docker {
      image 'maven3.3.9-jdk-8'
      args '-v /root/.m2:/root/.m2'
    }

  }
  stages {
    stage('build') {
      steps {
        sh 'mvn --version'
        sh 'mvn install'
      }
    }
  }
}