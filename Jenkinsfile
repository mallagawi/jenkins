pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2'
            args '-u root:root'
        }
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'app-api/target/surefire-reports/*.xml'
                }
            }
        }
        stage('Deliver') {
                    steps {
                        sh 'echo "............."'
                        sh 'chmod 777 ./jenkins/deliver.sh'
                        sh './jenkins/deliver.sh'
                    }
                }
    }
}