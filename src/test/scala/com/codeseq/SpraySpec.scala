package com.codeseq

import org.scalatest.{WordSpec, Matchers}

class SpraySpec extends WordSpec with Matchers {
  val jsonStr = loadJson()

  def go(): Unit = 
    for (_ <- 1 to 1000) {
      Spray.parseToString(jsonStr)
    }

  "Spray" should { //{1
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
  } //}1
}
// vim:fdl=1:
