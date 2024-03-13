package controllers
import DAO.FlightDAO
import play.api.mvc._
import javax.inject._
import scala.concurrent.ExecutionContext
@Singleton
class FlightDetailsController @Inject()(val controllerComponents: ControllerComponents,flightDao: FlightDAO)(implicit ec: ExecutionContext) extends BaseController {
  def showAllFlightDetails() = Action.async { implicit request: Request[AnyContent] =>
    flightDao.getAllFlightsData().map { flightsData=>
      Ok(views.html.flightDetailsView(flightsData))
    }
  }
}
