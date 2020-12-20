pipeline{
       agent any
       stages {
               stage('Preparation') { // for display purposes
                       steps {
                                // Get some code from a GitHub repository
                                // git 'https://github.com/sumi2222/mavenjenkindemo.git'
                       }
               }
               stage('Build') {
                       steps {
                               bat "mvn clean test"
                       }
               }
               stage('Package') {
                       steps {
                                bat "mvn package"
                       }
               }
               stage('Results') {
                       steps {
                               junit '**/target/surefire-reports/TEST-*.xml'
                               archiveArtifacts 'target/*.jar'
                       }
               }
        }
}
