package nl.haploid.v2

import org.junit.runner.RunWith
import org.scalatest._
import org.scalatest.junit.JUnitRunner
import org.scalatest.mock.EasyMockSugar

@RunWith(classOf[JUnitRunner])
class FilePrinterTest extends FlatSpec with EasyMockSugar with ShouldMatchers {

  it should "print a file" in {

    // TODO: problem: we need an actual file as test input
    // we're not testing the file reader
    val viewer = new FilePrinter("data/words", Seq())

    // TODO: problem: we can't really assert what it printed
    // assert that all filters are applied
    // assert that only filtered lines are sent to the printer
    viewer.print()
  }
}
