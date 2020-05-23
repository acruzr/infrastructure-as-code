job('NodeJS example') {
	scm {
		git('git@github.com:acruzr/service-web-app.git', 'ssh') { node -> // is hundson.plugins.git.GitSCM
			node / gitConfigName('DSL user')
			node / gitConfigEmail('acruzr135@gmail.com')
			credentials('ssh_jenkins_ID')
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