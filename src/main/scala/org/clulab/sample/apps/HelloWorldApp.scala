package org.clulab.sample.apps

import org.clulab.sample.Sample
import org.clulab.sample.common.utils.SampleApp

object HelloWorldApp extends SampleApp {
  val appMessage = args.lift(0).getOrElse(getArgString("apps.HelloWorldApp.message", Some("App message not found!")))
  logger.info(appMessage)

  val sample = Sample()
  val classMessage = sample.getArgString("Sample.message", Some("Class message not found!"))
  logger.info(classMessage)
}
