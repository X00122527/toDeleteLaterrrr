
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object editProfile_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

     object editProfile_Scope1 {
import helper._

class editProfile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.27*/("""
"""),_display_(/*4.2*/main("Fill in profile", user)/*4.31*/ {_display_(Seq[Any](format.raw/*4.33*/("""


        """),format.raw/*7.9*/("""<div class="form-white-background">


            """),_display_(/*10.14*/helper/*10.20*/.form(action = controllers.routes.LoginController.loginSubmit())/*10.84*/{_display_(Seq[Any](format.raw/*10.85*/("""
           """),format.raw/*11.12*/("""<div class="container">
<div class="well"> 
      <div class="form-group">
      <label>Date of Birth</label>
      <input type="date" class="form-control" id="exampleInputDOB1" placeholder="Date of Birth">
    </div>
</div>

<div class="well"> 
		<div class="form-group">
      <label>Height</label>
      <input type="number" class="form-control" id="exampleInputDOB1" placeholder="eg. 180">
    </div>
</div>
  
 <div class="well"> 
		<div class="form-group">
      <label>Weight</label>
      <input type="number" class="form-control" id="exampleInputDOB1" placeholder="eg 72.5">
    </div>
</div>
<div class="well">
  <label>Activity level</label>
  <div class="form-check">
  <label class="form-check-label">
    <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios1" value="option1" checked>
    Little - no exercise
  </label>
</div>
<div class="form-check">
  <label class="form-check-label">
    <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios2" value="option2">
    Light exercise (1 - 3 days per week)
  </label>
</div>
<div class="form-check">
  <label class="form-check-label">
    <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios3" value="option3">
Moderate exercise (3 - 5 days per week )
  </label>
</div>
  <div class="form-check">
  <label class="form-check-label">
    <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios4" value="option4">
    Heavy Exercise (6 - 7 days per week)
  </label>
</div>
  <div class="form-check">
  <label class="form-check-label">
    <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios2" value="option5">
    Very heavy exercise (twice per day, extra heavy workouts)
  </label>
</div>
  
  </div>
  
  <div class="well"> 
		<div class="form-group">
      <label>Primary goal</label>
          <div class="form-check">
  <label class="form-check-label">
    <input class="form-check-input" type="radio" name="x" id="exampleRadios1" value="option6" checked>
    Lose weight
  </label>
</div>
<div class="form-check">
  <label class="form-check-label">
    <input class="form-check-input" type="radio" name="x" id="exampleRadios2" value="option7">
    Gain muscle
  </label>
</div>
</div>
<div class="form-check">
  <label class="form-check-label">
    <input class="form-check-input" type="radio" name="x" id="exampleRadios3" value="option8">
    Maintain weight
  </label>
</div>
      
    </div>
<div class="form-row">
                <input type ="saveProfil" value="Save details" class ="btn btn-primary">
            </div>
            
</div>
              
  </div>



       
""")))}),format.raw/*102.2*/("""
""")))}),format.raw/*103.2*/("""
"""))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}
}

/**/
object editProfile extends editProfile_Scope0.editProfile_Scope1.editProfile
              /*
                  -- GENERATED --
                  DATE: Mon Apr 03 00:23:44 IST 2017
                  SOURCE: /home/wdd/Desktop/seconyearproject_new/app/views/editProfile.scala.html
                  HASH: 8d9c0d72572351464bfba8eec221aae1449698b1
                  MATRIX: 818->19|938->44|965->46|1002->75|1041->77|1078->88|1156->139|1171->145|1244->209|1283->210|1323->222|4055->2923|4088->2925
                  LINES: 30->3|35->3|36->4|36->4|36->4|39->7|42->10|42->10|42->10|42->10|43->11|134->102|135->103
                  -- GENERATED --
              */
          