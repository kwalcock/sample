package org.clulab.sample.apps

import org.clulab.processors.clu.CluProcessor
import org.clulab.sample.common.utils.SampleApp

object PosApp extends SampleApp {
  org.clulab.dynet.Utils.initializeDyNet()

  val text = "This is a test.  This is only a test."
  val processor = new CluProcessor()
  val document = processor.annotate(text)

  document.sentences.foreach { sentence =>
    sentence.words.zip(sentence.tags.get).foreach { case (word, tag) =>
      println(s"$word\t$tag")
    }
  }
}
