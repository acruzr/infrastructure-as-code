job('NodeJS example') {
	scm {
		git() { 
			remote {
				github('acruzr/service-web-app', 'ssh')
				credentials('ssh_jenkins_ID')
				branches('master')
			}
		}
	}
	wrappers {
		nodejs('nodejs') // this is the name of the nodeJS installation in
						 // Manager Jenkins -> Configure Tools -> NodeJS Installatios -> Name
	}
	steps {
		shell('npm install')
	}
}