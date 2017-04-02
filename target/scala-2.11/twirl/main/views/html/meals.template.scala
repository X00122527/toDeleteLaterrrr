
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object meals_Scope0 {
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

class meals extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Form[models.Meal],models.users.Member,models.users.User,List[models.Meal],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(mealForm: Form[models.Meal], member: models.users.Member, user: models.users.User, meals: List[models.Meal]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.111*/("""
"""),format.raw/*3.1*/("""

"""),_display_(/*5.2*/main("Meals", user)/*5.21*/ {_display_(Seq[Any](format.raw/*5.23*/("""
"""),format.raw/*6.1*/("""sadasd

    """),_display_(/*8.6*/form(action = routes.HomeController.addMealSubmit(), 'class -> "form-horizontal", 'role -> "form")/*8.104*/ {_display_(Seq[Any](format.raw/*8.106*/("""
                """),format.raw/*9.17*/("""<button type="button" class="btn btn-default btn-lg">
                    <span class="glyphicon glyphicon-open"></span></button>
                <input type="submit" value="generate!" class="btn btn-primary" style="float: right">

                    <!--  <button type="button" class="btn" style="float: right">ADD POST</button>-->
            </div>

        </div>
        """)))}),format.raw/*17.10*/("""
"""),format.raw/*18.1*/("""qwe
    <h1>dziennie zapasdasdotrzebowanie : """),_display_(/*19.43*/member/*19.49*/.getDaily_kcal()),format.raw/*19.65*/("""</h1>
    <h1>kcal per meal: """),_display_(/*20.25*/member/*20.31*/.getMealCalories),format.raw/*20.47*/("""</h1>
   """),_display_(/*21.5*/for(m <- meals) yield /*21.20*/ {_display_(Seq[Any](format.raw/*21.22*/("""
        """),format.raw/*22.9*/("""<div id="meal">

            <h2> Meal """),_display_(/*24.24*/m/*24.25*/.getMealId()),format.raw/*24.37*/("""</h2>
            <p>  Total KCAL """),_display_(/*25.30*/m/*25.31*/.getTotalKcal()),format.raw/*25.46*/("""</p>


        </div>
   """)))}),format.raw/*29.5*/("""

""")))}),format.raw/*31.2*/("""
"""))
      }
    }
  }

  def render(mealForm:Form[models.Meal],member:models.users.Member,user:models.users.User,meals:List[models.Meal]): play.twirl.api.HtmlFormat.Appendable = apply(mealForm,member,user,meals)

  def f:((Form[models.Meal],models.users.Member,models.users.User,List[models.Meal]) => play.twirl.api.HtmlFormat.Appendable) = (mealForm,member,user,meals) => apply(mealForm,member,user,meals)

  def ref: this.type = this

}


}

/**/
object meals extends meals_Scope0.meals
              /*
                  -- GENERATED --
                  DATE: Mon Apr 03 00:23:44 IST 2017
                  SOURCE: /home/wdd/Desktop/seconyearproject_new/app/views/meals.scala.html
                  HASH: 0cdd73db8be5b39c8c166e8cfd5141a2e69598ac
                  MATRIX: 812->1|1032->110|1059->128|1087->131|1114->150|1153->152|1180->153|1218->166|1325->264|1365->266|1409->283|1818->661|1846->662|1919->708|1934->714|1971->730|2028->760|2043->766|2080->782|2116->792|2147->807|2187->809|2223->818|2290->858|2300->859|2333->871|2395->906|2405->907|2441->922|2497->948|2530->951
                  LINES: 27->1|32->1|33->3|35->5|35->5|35->5|36->6|38->8|38->8|38->8|39->9|47->17|48->18|49->19|49->19|49->19|50->20|50->20|50->20|51->21|51->21|51->21|52->22|54->24|54->24|54->24|55->25|55->25|55->25|59->29|61->31
                  -- GENERATED --
              */
          