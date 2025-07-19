// vars/compileStage.groovy
def call(String tool = 'mvn') {
    stage('Compile') {
        steps {
            script {
                echo "Running ${tool} compile..."
                sh "${tool} compile"
            }
        }
    }
}
