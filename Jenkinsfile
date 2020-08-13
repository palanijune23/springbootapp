pipeline
{
	agent any
	environment{
	PATH = "D:/softwares/apache-maven-3.6.3/bin:$PATH"
	}
	stages{
			stage("clone code"){
			steps{
				git credentialsId: 'git_credentials', url: 'https://github.com/palanijune23/springbootapp.git'
				 }
			}
			
		   }
}
