#!/usr/bin/env groovy

def call() {
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASSWORD', usernameVariable: 'USERNAME')]) {
        sh 'docker build -t zzhoho0110/java-maven-app:jma-1.1.2 .'
        sh "echo $PASSWORD | docker login -u $USERNAME --password-stdin"
        sh 'docker push zzhoho0110/java-maven-app:jma-1.1.2'
    }
}