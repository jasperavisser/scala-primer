package nl.haploid.v2

object MyApp extends App {

  private[this] def containsDoubleO(line: String): Boolean =
    line.contains("oo")

  private[this] def startsWithZ(line: String): Boolean =
    line.startsWith("z")

  val filters = Seq(containsDoubleO _, startsWithZ _)
  val printer = new FilePrinter("data/words", filters)
  printer.print()
}
