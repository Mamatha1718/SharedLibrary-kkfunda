def call
{
  stage('SonarQube')
  {
    sh "mvn sonar:sonar package"
  }
}
