// vars/compileStage.groovy
def call() {
    stage('Compile') {
                echo "Running  compile..."
                sh "mvn compile"
    }
}
