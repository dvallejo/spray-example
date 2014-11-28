package magic.gol

import akka.actor.{Actor, ActorSystem, Props, ActorLogging}
import akka.actor.ActorDSL._
import akka.io.IO
import akka.io.Tcp._

import spray.can.Http
import spray.routing._

object Boot extends App with config.ConfigApp {

  implicit val system = ActorSystem("magic-gol-akka-system")

  val serviceActor = system.actorOf(Props[ServiceActor], "service-actor")

  val bootActor = actor("bootActor")(new Act{})
 
  IO(Http).tell(Http.Bind(serviceActor, interface, port), bootActor)

}
