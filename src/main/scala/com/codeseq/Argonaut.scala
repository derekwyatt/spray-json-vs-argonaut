package com.codeseq

import argonaut._, Argonaut._

object Argonaut {
  def parseToString(jsonStr: String): String = Parse.parseOption(jsonStr).get.nospaces
}
