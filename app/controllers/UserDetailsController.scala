package controllers
import DAO.UserDetailsDAO
import play.api.mvc._

import javax.inject._
import scala.concurrent.ExecutionContext
@Singleton
class UserDetailsController @Inject()(val controllerComponents: ControllerComponents,userDetailsDao: UserDetailsDAO)(implicit ec: ExecutionContext) extends BaseController {
  def showAllUserDetails() = Action.async { implicit request: Request[AnyContent] =>
    userDetailsDao.getAllUsersData().map {userData =>
      Ok(views.html.flightDetailsView(userData))
    }
  }
}
