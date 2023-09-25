pipeline{
    agent any
    stages {
        stage("Build") {
          steps {
            echo("BUILDING PROJECT")
          }
        }

        stage("Start") {
          steps {
            echo("RUNNING PROJECT")
          }
        }

      }

      post {
        success {
          echo "SUCCESS"
        }
        failure {
          echo "FAILED"
        }
        cleanup {
          echo "CLEAN"
        }
      }
}