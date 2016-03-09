package nl.haploid.v2

trait Writer {

  def write(lines: Iterator[String]): Unit
}

class ConsoleWriter extends Writer {

  def write(lines: Iterator[String]): Unit = lines.foreach(println)
}
