package magic.gol

import spray.routing._

trait GeneralRoute extends HttpService {

	def route = 
		path("hello") {
			get {
				complete("Hello World!")
			}
		}
}
