package models
import slick.jdbc.PostgresProfile.api._

case class UserAdmin(user_id: Long = 0, username: String, aadhar_card: String,aircraft_id:String)
class UserModel(tag: Tag) extends Table[FlightAdmin](tag, "FlightDet1") {
  def user_id = column[Long]("flight_id", O.PrimaryKey, O.AutoInc)
  def username = column[String]("aircraft_id")
  def aaadhar_card = column[String]("airlines_name")
  def aircraft_id = column[String]("destination")
  def * = (user_id,username,aaadhar_card,aircraft_id) <> (UserAdmin.tupled,UserAdmin.unapply)}
}
object UserModel{
  val users=TableQuery[UserModel]
}
