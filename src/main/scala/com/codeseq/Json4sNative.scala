package com.codeseq

import org.json4s._
import org.json4s.native.JsonMethods._

object Json4sNative extends JsonParser {
  def parseToString(jsonStr: String): String = compact(render(parse(jsonStr)))
}
