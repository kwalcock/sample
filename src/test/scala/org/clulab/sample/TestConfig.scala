package org.clulab.sample

import org.clulab.sample.common.utils.Test

class TestConfig extends Test {

  behavior of "config"

  it should "be accessible" in {
    val sample = Sample()
    val message = sample.getArgString("Sample.message", None)

    println(message)
  }
}
