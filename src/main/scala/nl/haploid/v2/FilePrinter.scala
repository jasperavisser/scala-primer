package nl.haploid.v2

class FilePrinter(val filename: String, val filters: Seq[(String => Boolean)]) {

  protected[v2] val reader: Reader = new FileReader

  protected[v2] val writer: Writer = new ConsoleWriter

  protected[v2] def filter(line: String): Boolean =
    !filters.exists(f => !f(line))

  def print(): Unit = {
    val lines = reader.read(filename)
    val filteredLines = lines.filter(filter)
    writer.write(filteredLines)
  }
}
