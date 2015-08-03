package springsecurity.poc

import grails.plugin.springsecurity.annotation.Secured;

class EventController {

	@Secured(['ROLE_USER'])
	def index() {
		println "event index"
		render "Hello World!"
	}
}
