node{
     stage('SCM Checkout'){
     git 'https://github.com/palanijune23/springbootapp'
     }
     stage('Compile-Package'){
          //Get Maven Build Path
     def mvnHome = tool name: 'maven home', type: 'maven'
          sh "${mvnHome}/bin/mvn package"
     }
}
