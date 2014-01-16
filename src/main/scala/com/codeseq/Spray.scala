package com.codeseq

import spray.json._

object Spray extends JsonParser {
  def parseToString(jsonStr: String): String = jsonStr.asJson.compactPrint
}
