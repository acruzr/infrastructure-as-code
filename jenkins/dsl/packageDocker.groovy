job('service-web-app Docker') {
	scm {
		git {
			 remote {
			 	github('acruzr/service-web-app', 'ssh')
			 	credentials('ssh_jenkins_ID')
			 	branches('master')
			 }
		}
	}
	steps {
		dockerBuildAndPublish {
			repositoryName('acruzr/service-web-app')
			registryCredentials('052d6a55-7fa3-49a6-8925-5bf2871fa151')
			forcePull(false)
			forceTag(false)
			createFingerprints(false)
			skipDecorate()
		}
	}
}