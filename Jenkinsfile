pipeline {
  agent none
  environment {
    DOCKERHUBNAME = "liker163"
  }
  stages {
    stage('maven Build') {
      agent {
        docker {
          image 'maven:3-alpine'
          args '-v /root/.m2:/root/.m2'
        }
      }
      steps {
        sh 'mvn -B -DskipTests clean package'
      }
    }

    stage('docker build & push & run') {
      agent any
      steps {
          sh 'docker image build -t ${DOCKERHUBNAME}/tstorage .'
          sh 'docker run -d -p 8182:8182 --name seatastorage ${DOCKERHUBNAME}/tstorage'
      }
    }

    stage('clean workspace') {
      agent any
      steps {
        // clean workspace after job finished
        cleanWs()
      }
    }
  }
}
