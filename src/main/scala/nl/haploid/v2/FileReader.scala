package nl.haploid.v2

import scala.io.Source

trait Reader {
  def read(filename: String): Iterator[String]
}

class FileReader extends Reader {

  def read(filename: String): Iterator[String] =
    Source.fromFile(filename).getLines()
}
