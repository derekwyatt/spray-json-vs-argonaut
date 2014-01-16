package com.codeseq

import org.parboiled2.examples.JsonParser

object Parboiled2 {
  def parseToString(jsonStr: String): String = new JsonParser(jsonStr).Json.run().get.compactPrint
}
