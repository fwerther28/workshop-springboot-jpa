pipeline {
	agent any
	
	stages {
		stage('1. Checkout') {
			steps {
				checkout scm
			}
		}
		
		stage('2. Test') {
			steps {
				sh './mvnw test'
			}
		}
		
		stage('3. Build Package') {
			steps {
				sh './mvnw clean package -DskipTests'
			}
		}
		
		stage('4. Build Docker Image') {
			steps {
				sh 'docker build -t workshop-jpa-api:latest .'
			}
		}
	}
}