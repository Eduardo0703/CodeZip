// comment
pipeline {
 agent any
 stages {
        stage('Checkout-git'){
               steps{
		git poll: true, url: 'https://github.com/Eduardo0703/promad.git'
               }
        }
        stage('CreateVirtualEnv') {
            steps {
				sh "gradle build"

            }
        }
  }
}

