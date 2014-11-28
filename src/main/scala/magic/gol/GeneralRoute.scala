package magic.gol

import spray.routing._

import routes._

trait GeneralRoute extends HttpService
	with TeamRoute {

	def route = 
		path("hello") {
			get {
				complete("Hello World!")
			}
		} ~ teamRoute
}
