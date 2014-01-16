package com.codeseq

import org.scalatest.{WordSpec, Matchers}

trait JsonParserSpec extends WordSpec with Matchers {
  def parser: JsonParser
  def parserName: String

  val jsonStr = loadJson()

  def go(): Unit =
    for (_ <- 1 to 1000) {
      parser.parseToString(jsonStr)
    }

  parserName should { //{1
    "parse it 1,000 times (01)" in { //{2
      go()
    } //}2
    "parse it 1,000 times (02)" in { //{2
      go()
    } //}2
    "parse it 1,000 times (03)" in { //{2
      go()
    } //}2
    "parse it 1,000 times (04)" in { //{2
      go()
    } //}2
    "parse it 1,000 times (05)" in { //{2
      go()
    } //}2
    "parse it 1,000 times (06)" in { //{2
      go()
    } //}2
    "parse it 1,000 times (07)" in { //{2
      go()
    } //}2
    "parse it 1,000 times (08)" in { //{2
      go()
    } //}2
    "parse it 1,000 times (09)" in { //{2
      go()
    } //}2
    "parse it 1,000 times (10)" in { //{2
      go()
    } //}2
    "parse it 1,000 times (11)" in { //{2
      go()
    } //}2
    "parse it 1,000 times (12)" in { //{2
      go()
    } //}2
    "parse it 1,000 times (13)" in { //{2
      go()
    } //}2
    "parse it 1,000 times (14)" in { //{2
      go()
    } //}2
    "parse it 1,000 times (15)" in { //{2
      go()
    } //}2
    "parse it 1,000 times (16)" in { //{2
      go()
    } //}2
    "parse it 1,000 times (17)" in { //{2
      go()
    } //}2
    "parse it 1,000 times (18)" in { //{2
      go()
    } //}2
    "parse it 1,000 times (19)" in { //{2
      go()
    } //}2
    "parse it 1,000 times (20)" in { //{2
      go()
    } //}2
  } //}1
}
