pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
            withMaven(maven : 'maven_3_5_3'){
             sh 'mvn clean install'
             }
            }
        }
        stage('Test') {
            steps {
            withMaven(maven : 'maven_3_5_3'){
             sh 'mvn test'
             }

            }
            post {
                always {
                    junit 'app-api/target/surefire-reports/*.xml'
                }
            }
        }
        
    }
}
