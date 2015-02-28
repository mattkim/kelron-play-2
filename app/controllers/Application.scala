package controllers

import play.api._
import play.api.mvc._



class Images {
  var front: String = "https://s3-us-west-2.amazonaws.com/kelron-play-2/kelron_front_page_1.jpg"
  var bride: String = "https://s3-us-west-2.amazonaws.com/kelron-play-2/bride.jpg"
  var groom: String = "https://s3-us-west-2.amazonaws.com/kelron-play-2/groom.jpg"
  var photo1: String = "https://s3-us-west-2.amazonaws.com/kelron-play-2/kelron_album_1.jpg"
  var photo2: String = "https://s3-us-west-2.amazonaws.com/kelron-play-2/kelron_album_2.jpg"
  var photo3: String = "https://s3-us-west-2.amazonaws.com/kelron-play-2/kelron_album_3.jpg"
  var photo4: String = "https://s3-us-west-2.amazonaws.com/kelron-play-2/kelron_album_4.jpg"
  var photo5: String = "https://s3-us-west-2.amazonaws.com/kelron-play-2/kelron_album_5.jpg"
  var photo6: String = "https://s3-us-west-2.amazonaws.com/kelron-play-2/kelron_album_6.jpg"
  var photo7: String = "https://s3-us-west-2.amazonaws.com/kelron-play-2/kelron_album_7.jpg"
  var photo8: String = "https://s3-us-west-2.amazonaws.com/kelron-play-2/kelron_album_8.jpg"
  var macys: String = "https://s3-us-west-2.amazonaws.com/kelron-play-2/macys_logo.jpg"
  var amazon: String = "https://s3-us-west-2.amazonaws.com/kelron-play-2/amazon_logo.jpg"
}

object Application extends Controller {
  def index = Action {
    var images = new Images
    Ok(views.html.index(images))
  }
  
  def sendRSVP(){
    println("testt")
  }

}
