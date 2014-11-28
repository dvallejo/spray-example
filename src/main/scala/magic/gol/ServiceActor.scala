package magic.gol

import akka.actor._

class ServiceActor extends Actor with ActorLogging with GeneralRoute {
	
	def actorRefFactory = context

	def receive = runRoute(route)

}

object ServiceActor {

	def props = Props[ServiceActor]

}
