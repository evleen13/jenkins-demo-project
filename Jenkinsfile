pipeline {
    agent any

    tools {
        maven 'Maven-3.6.3'
    }

    environment {
        JAR_FILENAME = "math-work"
        JAR_VERSION = "1.0.0-SNAPSHOT"
    }

    stages {
        stage("Test") {
            steps {
                sh "mvn clean test"
            }
        }

        stage("Build") {
            steps {
                sh "mvn package -DskipTests"
            }
        }

        stage("Execute") {
            steps {
                sh "Executing"
            }
        }
    }
    post {
        always {
            echo "always be executed"
        }
        success {
            echo "executed only when all stages succeed"
            junit '**/*xml'
            archiveArtifacts artifacts: "target/${JAR_FILENAME}-${JAR_VERSION}.jar", followSymlinks: false
            deleteDir()
        }
    }
}