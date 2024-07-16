#!/usr/bin/env groovy

def call(){
    echo "testing..."
    sh 'mvn test'
}
