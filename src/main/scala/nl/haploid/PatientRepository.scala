package nl.haploid

object PatientRepository {

  val Patients: List[Patient] = List(
    new Patient(1, "Alice"),
    new Patient(2, "Bob"),
    new Patient(3, "Carol"),
    new Patient(4, "Dan"),
    new Patient(5, "Eve"),
    new Patient(6, "Frank")
  )

  //  val Patients: List[Patient] = List(
  //    new Patient(id = 1, name = "Alice", weight = Some(80), height = Some(1.60F)),
  //    new Patient(id = 2, name = "Bob", weight = Some(80), height = None),
  //    new Patient(id = 3, name = "Carol", weight = Some(55), height = Some(1.72F)),
  //    new Patient(id = 4, name = "Dan", weight = None, height = Some(1.97F)),
  //    new Patient(id = 5, name = "Eve", weight = Some(70), height = Some(1.60F)),
  //    new Patient(id = 6, name = "Frank", weight = Some(120), height = Some(1.83F))
  //  )
}

class PatientRepository {

  def findAll: List[Patient] = PatientRepository.Patients

  def findOne(id: Int): Patient = findOneSafely(id).orNull

  def findOneSafely(id: Int): Option[Patient] = findAll.find(_.id == id)

  def printAll(): Unit = findAll.foreach(println)

  def save(patient: Patient): Unit = println(s"Saving $patient")
}
