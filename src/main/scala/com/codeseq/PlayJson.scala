package com.codeseq

import play.api.libs.json.Json

object PlayJson extends JsonParser {
  def parseToString(jsonStr: String): String = Json.stringify(Json.parse(jsonStr))
}
