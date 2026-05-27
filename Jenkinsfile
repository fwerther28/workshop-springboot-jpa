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
				sh 'chmod +x mvnw'
				sh './mvnw test -Dspring.profiles.active=test'
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