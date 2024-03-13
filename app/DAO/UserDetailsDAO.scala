package DAO
import models.{FlightAdmin, UserModel}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import javax.inject.Inject
import scala.concurrent.{ExecutionContext, Future}

class UserDetailsDAO @Inject()(protected val dbConfigProvider: DatabaseConfigProvider)(implicit executionContext: ExecutionContext) {
  private val dbConfig = dbConfigProvider.get[JdbcProfile]
  import dbConfig._
  import profile.api._
  def getAllUsersData(): Future[Seq[FlightAdmin]]=
  {
    val tableQuery = TableQuery[UserModel]
    db.run(tableQuery.result)
  }
}
