package nl.haploid.v1

class Patient(val id: Int,
              val name: String) {

  override def toString = s"$id -> $name"
}