package org.clulab.sample.common.utils

import com.typesafe.config.Config
import com.typesafe.config.ConfigFactory

trait SampleConfigured extends Configured {
  // This line doesn't work if there is a leading / in the resource name.  I tried.
  lazy val config = ConfigFactory.parseResourcesAnySyntax("Sample")

  override def getConf: Config = config
}
