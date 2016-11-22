package controllers

/**
  * Created by nandpa on 11/22/16.
  */

import javax.inject._
import play.api._
import play.api.mvc._

class CharacterController  @Inject() extends Controller {

  /**
    * Create an Action to render an HTML page with a welcome message.
    * The configuration in the `routes` file means that this method
    * will be called when the application receives a `GET` request with
    * a path of `/`.
    */
  def characters = Action {
    println("It came here!")
    Ok(views.html.all())
  }



}