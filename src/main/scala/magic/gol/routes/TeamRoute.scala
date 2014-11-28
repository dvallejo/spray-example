package magic.gol.routes

import spray.routing._

import akka.actor.Props

import magic.gol.services.TeamService

trait TeamRoute extends HttpService {

	val teamService = actorRefFactory.actorOf(Props[TeamService], "team-service")

	def teamRoute = 
		path("team" / Segment ) { team => 
			get {
				complete(team)
			}
		}
}