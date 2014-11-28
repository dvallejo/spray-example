package magic.gol.config

import com.typesafe.config.ConfigFactory

trait ConfigApp {

	private val config = ConfigFactory.load().getConfig("api")
 
  lazy val interface = config.getString("interface")
  lazy val port = config.getInt("port")

}
