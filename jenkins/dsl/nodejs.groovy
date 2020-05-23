job('NodeJS example') {
	scm {
		git() { 
			remote {
				github('acruzr/infrastructure-as-code', 'ssh')
				credentials('ssh_jenkins_ID')
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