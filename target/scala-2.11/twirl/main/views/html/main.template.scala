
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.57*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
         <meta name="viewport" content="width=device-width, initial-scale=1">
        """),format.raw/*13.62*/("""
        """),format.raw/*14.9*/("""<title>"""),_display_(/*14.17*/title),format.raw/*14.22*/("""</title>
	<link rel="stylesheet" media="screen" href=""""),_display_(/*15.47*/routes/*15.53*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*15.103*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*16.54*/routes/*16.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*16.101*/("""">
	 <link rel="stylesheet" media="screen" href=""""),_display_(/*17.48*/routes/*17.54*/.Assets.versioned("stylesheets/form-login.css")),format.raw/*17.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*18.59*/routes/*18.65*/.Assets.versioned("images/favicon.png")),format.raw/*18.104*/("""">
        <script src=""""),_display_(/*19.23*/routes/*19.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*19.70*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*20.23*/routes/*20.29*/.Assets.versioned("javascripts/loginScript.js")),format.raw/*20.76*/("""" type="text/javascript"></script>
    </head>
    <body>

        <div id="box">
            
            <div id="container">
                <div class="loginregister">
                    <ul class="nav navbar-nav navbar-right" style="padding-top: 20px">
					    <li """),_display_(/*29.15*/if(title == "Register")/*29.38*/{_display_(Seq[Any](format.raw/*29.39*/("""class="active"""")))}),format.raw/*29.54*/("""><a href=""""),_display_(/*29.65*/routes/*29.71*/.LoginController.register()),format.raw/*29.98*/("""">Register</a></li>
					    <li """),_display_(/*30.15*/if(title == "Login")/*30.35*/{_display_(Seq[Any](format.raw/*30.36*/("""class="active"""")))}),format.raw/*30.51*/(""">
                        """),_display_(/*31.26*/if(user != null)/*31.42*/{_display_(Seq[Any](format.raw/*31.43*/("""
                            """),format.raw/*32.29*/("""<a href=""""),_display_(/*32.39*/routes/*32.45*/.LoginController.logout()),format.raw/*32.70*/("""">Logout """),_display_(/*32.80*/user/*32.84*/.getName),format.raw/*32.92*/("""</a>
                        """)))}/*33.26*/else/*33.30*/{_display_(Seq[Any](format.raw/*33.31*/("""
                            """),format.raw/*34.29*/("""<a href=""""),_display_(/*34.39*/routes/*34.45*/.LoginController.login()),format.raw/*34.69*/("""">Log in  <span class="glyphicon glyphicon-user"></span></a>
                        """)))}),format.raw/*35.26*/("""
                    """),format.raw/*36.21*/("""</li>
				</ul>
		</div>



                <div id="content">
                    """),_display_(/*43.22*/content),format.raw/*43.29*/("""


                """),format.raw/*46.17*/("""</div>

                <div id="footer">

                </div>
            </div>
        </div>
        """),format.raw/*54.32*/("""

    """),format.raw/*56.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


}

/*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Mon Apr 03 00:23:44 IST 2017
                  SOURCE: /home/wdd/Desktop/seconyearproject_new/app/views/main.scala.html
                  HASH: 0ec07acae0ab26b5751feb1c7f5e26ad76da1df3
                  MATRIX: 1020->260|1170->315|1198->317|1356->500|1392->509|1427->517|1453->522|1535->577|1550->583|1622->633|1705->689|1720->695|1783->736|1860->786|1875->792|1944->839|2032->900|2047->906|2108->945|2160->970|2175->976|2237->1017|2321->1074|2336->1080|2404->1127|2704->1400|2736->1423|2775->1424|2821->1439|2859->1450|2874->1456|2922->1483|2983->1517|3012->1537|3051->1538|3097->1553|3151->1580|3176->1596|3215->1597|3272->1626|3309->1636|3324->1642|3370->1667|3407->1677|3420->1681|3449->1689|3498->1719|3511->1723|3550->1724|3607->1753|3644->1763|3659->1769|3704->1793|3821->1879|3870->1900|3981->1984|4009->1991|4056->2010|4192->2208|4225->2214
                  LINES: 32->7|37->7|39->9|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|49->19|49->19|50->20|50->20|50->20|59->29|59->29|59->29|59->29|59->29|59->29|59->29|60->30|60->30|60->30|60->30|61->31|61->31|61->31|62->32|62->32|62->32|62->32|62->32|62->32|62->32|63->33|63->33|63->33|64->34|64->34|64->34|64->34|65->35|66->36|73->43|73->43|76->46|83->54|85->56
                  -- GENERATED --
              */
          