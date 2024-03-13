package models
import slick.jdbc.PostgresProfile.api._

case class FlightAdmin(flight_id: Long = 0, aircraft_id: String, airlines_name: String,price:Double,destination:String,source:String,departure_time:String,arrival_time:String,seat_availability:String)
class FlightModel(tag: Tag) extends Table[FlightAdmin](tag, "FlightDet1") {
  def flight_id = column[Long]("flight_id", O.PrimaryKey, O.AutoInc)
  def aircraft_id = column[String]("aircraft_id")
  def airlines_name = column[String]("airlines_name")
  def price = column[Double]("price")
  def destination = column[String]("destination")
  def source = column[String]("source")
  def departure_time = column[String]("departure_time")
  def arrival_time = column[String]("arrival_time")
  def seat_availability = column[String]("seat_availability")
  def * = (flight_id,aircraft_id,airlines_name,price,destination,source,departure_time,arrival_time,seat_availability) <> (FlightAdmin.tupled,FlightAdmin.unapply)}
object FlightModel{
  val flights=TableQuery[FlightModel]

}
