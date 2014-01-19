package com.codeseq

import org.json4s._
import org.json4s.jackson.JsonMethods._

object Json4sJackson extends JsonParser {
  def parseToString(jsonStr: String): String = compact(render(parse(jsonStr)))
}
