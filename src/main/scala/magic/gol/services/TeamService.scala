package magic.gol.services

import akka.actor.{ Actor, Props }

class TeamService extends Actor {

	def receive = {
		case GetTeamRequest(name) => sender ! GetTeamResponse(name)
	}

}

object TeamService {

	def props = Props[TeamService]

}

case class GetTeamRequest(name: String)
case class GetTeamResponse(name: String)
