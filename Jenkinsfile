pipeline {
      environment { 
        registry = "fehdkh/fehd" 
        registryCredential = 'fehdkh' 
        dockerImage = '' 
    }

    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "M3"
    }

    stages {
        stage('Clone Git repository') {
            steps {
                // Get some code from a GitHub repository
                git branch: 'main', url:'https://github.com/fehdkh/SpringOPS.git'
                }
            }
        stage('Maven clean'){
            steps{
                // Clean artifacts and package a new one.
                sh "mvn -Dmaven.test.failure.ignore=true clean package"
                }
            }
        stage('Maven compile'){
            steps{
                // Deploys a new artifact in target/ directory
                sh "mvn -Dmaven.test.failure.ignore=true install"
                }
            }
        
        stage('SonarQube analysis'){
            steps{
            sh "mvn sonar:sonar -Dsonar.projectKey=achat -Dsonar.host.url=http://192.168.1.108:9000 -Dsonar.login=e9089c644161984200094a6d5f866b3abb8da74c"
            }
        }
        
        /*stage('JUnit/Mockito'){
            steps{
            sh 'mvn test -Dmaven.test.failure.ignore=true'
            }
        }*/
        stage('mvn nexus') {
            steps {
                // Get some code from a GitHub repository
                sh 'mvn deploy'
                }
            }
      tage('Building our image') { 
            steps { 
                script { 
                    dockerImage = docker.build registry + ":$BUILD_NUMBER" 
                }
            } 
        }
        stage('Deploy our image') { 
            steps { 
                script { 
                    docker.withRegistry( '', registryCredential ) { 
                        dockerImage.push() 
                    }
                } 
            }
        } 
        stage('Cleaning up') { 
            steps { 
                sh "docker rmi $registry:$BUILD_NUMBER" 
            }
        } 
    }
}
