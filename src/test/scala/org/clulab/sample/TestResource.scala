package org.clulab.sample

import org.clulab.sample.common.utils.BuildUtils
import org.clulab.sample.common.utils.Sourcer
import org.clulab.sample.common.utils.Test

class TestResource extends Test {

  def getTextFromResource(path: String): String = {
    val source = Sourcer.sourceFromResource(path)
    val text = source.mkString

    source.close
    text
  }

  behavior of "resource"

  it should "be accessible" in {
    // package;format="packaged" results in backlashes and
    // syntax errors on Windows, so this is converted manually.
    println(getTextFromResource("/" + BuildUtils.pkgToDir("org.clulab.sample") + "/resource.txt"))
  }
}
