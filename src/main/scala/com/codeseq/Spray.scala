package com.codeseq

import spray.json._

object Spray {
  def parseToString(jsonStr: String): String = jsonStr.asJson.compactPrint
}
