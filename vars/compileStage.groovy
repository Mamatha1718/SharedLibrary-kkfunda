// vars/compileStage.groovy
def call(String tool = 'mvn') {
    stage('Compile') {
                echo "Running ${tool} compile..."
                sh "${tool} compile"
    }
}
