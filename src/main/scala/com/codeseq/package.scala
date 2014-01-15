package com

import scala.io.Source

package object codeseq {
  def loadJson(): String =
    Source.fromInputStream(getClass.getResourceAsStream("/sample.json")).getLines().mkString("\n")
}
