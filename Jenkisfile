pipeline{
agent any
    stage('Preparation') { // for display purposes
        // Get some code from a GitHub repository
       // git 'https://github.com/sumi2222/mavenjenkindemo.git'
    }
    stage('Build') {
        bat "mvn clean test"
    }
        stage('Package') {
        bat "mvn package"
    }
    stage('Results') {
        junit '**/target/surefire-reports/TEST-*.xml'
        archiveArtifacts 'target/*.jar'
    }
}
