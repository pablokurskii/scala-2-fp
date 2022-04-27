package lectures.part2oop

object Enum {
  enum Permissions {
    case READ, WRITE, EXECUTE, NONE
  }

  val somePermisssions: Permissions = Permissions.NONE

}
