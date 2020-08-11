node{
     stage('SCM Checkout'){
     git 'https://github.com/palanijune23/springbootapp'
     }
     stage('Compile-Package'){
     def mvnHome = tool name: 'maven home', type: 'maven'
     sh 'mvn package'
     }
}
