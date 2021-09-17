pipeline {
    agent {
        docker { image 'node:14-alpine' }
    }    
    environment {
        DOCKERHUB_CREDENTIALS = credentials('andrewxie')
    }    
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
                sh 'docker build -t creditcard:1 .'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }        
        stage('Login') {
            steps {
                sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
            }
       }
       stage('Push') {
            steps {
                sh 'docker push creditcard:1'
            }
            post {
                always {
                    sh 'docker logout'
                }
            }
       }   
       stage('Deliver') {
            steps {
               sh './jenkins/scripts/deliver.sh'
            }
       }
    }
     
}

