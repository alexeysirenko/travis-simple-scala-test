
import java.io.File

import com.typesafe.config.{Config, ConfigFactory, ConfigParseOptions}

object Application extends App {

  val conf = ConfigFactory.load() // .withFallback(default).resolve()

  println(conf.getString("foo"))
  println(conf.getString("bar"))

}
