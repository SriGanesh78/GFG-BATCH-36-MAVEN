pipeline {
    agent any
    tools {
        maven 'MAVEN_HOME'
    }
    stages {
        stage('Welcome') {
            steps {
                echo 'Welcome to the Jenkins Pipeline!'
            }
        }
        stage('Clean') {
            steps {
                echo 'Cleaning workspace...'
                // Add maven commands
                sh 'mvn clean'
            }
        }
        stage('Build') {
            steps {
                echo 'Building...'
                // Add Maven build commands
                sh 'mvn install'
            }
        }
        stage('Build Success') {
            steps {
                echo 'Build was successful!'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
                // Add Maven test commands
                sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
                // Add your deployment commands here
            }
        }
    }
    post {
        always {
            echo 'This will always run after the stages complete.'
        }
        success {
            echo 'This will run only if the pipeline succeeds.'
        }
        failure {
            echo 'This will run only if the pipeline fails.'
        }
    }
}
