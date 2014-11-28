package magic.gol.model

import spray.json._
import spray.httpx.SprayJsonSupport

case class Player(
	name: String,
	position: String
)

trait PlayerSerializer extends DefaultJsonProtocol with SprayJsonSupport {
  implicit val playerFormat = jsonFormat2(Player)
}