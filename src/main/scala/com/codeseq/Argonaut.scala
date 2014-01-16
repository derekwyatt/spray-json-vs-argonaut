package com.codeseq

import argonaut._, Argonaut._

object Argonaut extends JsonParser {
  def parseToString(jsonStr: String): String = Parse.parseOption(jsonStr).get.nospaces
}
