package magic.gol.model

import spray.json._
import spray.httpx.SprayJsonSupport

case class Team(
	name: String,
	players: List[Player]
)

trait TeamSerializer extends DefaultJsonProtocol with SprayJsonSupport {
	self: PlayerSerializer =>
  
  implicit val teamFormat = jsonFormat2(Team)
}