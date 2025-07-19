// vars/compileStage.groovy
def call() {
    stage('Compile') {
        steps {
            script {
                // You can add logging or error handling here too
                echo "Running compile step..."
                sh 'mvn compile'
            }
        }
    }
}
