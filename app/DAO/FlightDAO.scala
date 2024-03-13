package DAO
import models.{FlightAdmin, FlightModel}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile
import javax.inject.Inject
import scala.concurrent.{ExecutionContext, Future}

class FlightDAO @Inject()(protected val dbConfigProvider: DatabaseConfigProvider)(implicit executionContext: ExecutionContext) {
  private val dbConfig = dbConfigProvider.get[JdbcProfile]
  import dbConfig._
  import profile.api._
  def getAllFlightsData(): Future[Seq[FlightAdmin]]=
  {
    val tableQuery = TableQuery[FlightModel]
    db.run(tableQuery.result)
  }
}
