pipeline {
    agent {
        image 'maven:3.8.1-adoptopenjdk-11' 
        args '-v /root/.m2:/root/.m2' 
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

