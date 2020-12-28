pipeline{
       agent any
       stages {
               stage('Build') {
                       steps {
                               bat "mvn clean test"
                       }
               }
               stage('Sonar Code Coverage') {
                       steps {
                                bat "mvn clean test sonar:sonar"
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
