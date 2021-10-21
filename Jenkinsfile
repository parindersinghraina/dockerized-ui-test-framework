pipeline {
    agent any
    parameters {
        choice(
          choices: ['all'],
          description: 'Select a suite.',
          name: 'SUITE')
        choice(
          choices: ['stagging'],
          description: 'Select a target environment.',
          name: 'ENVIRONMENT')
    }
    environment {
        AUTOMATED_TEST_SUITE = "${params.SUITE}"
        AUTOMATED_TEST_ENV_CONFIG = "${params.ENVIRONMENT}"
        AUTOMATED_TEST_WD_CONFIG = "docker-compose"
    }
    stages {
        stage('test') {
            steps {
                echo "BRANCH:            ${env.BRANCH_NAME}"
                echo "SUITE:             ${env.AUTOMATED_TEST_SUITE}"
                echo "ENVIRONMENT:       ${env.AUTOMATED_TEST_ENV_CONFIG}"
                echo "WEBDRIVER:         ${env.AUTOMATED_TEST_WD_CONFIG}"
                sh "/usr/local/bin/docker-compose up --no-color --abort-on-container-exit"
            }
        }
    }
    post {
        always {
            sh '/usr/local/bin/docker-compose down'
            sh 'docker rm $(docker ps -a -q) && docker rmi $(docker images -a -q)'
        }
    }
}