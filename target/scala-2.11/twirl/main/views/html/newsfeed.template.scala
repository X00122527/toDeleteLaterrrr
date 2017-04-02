
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object newsfeed_Scope0 {
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

     object newsfeed_Scope1 {
import helper._

class newsfeed extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[Form[models.Post],Form[models.Comment],List[models.Post],List[models.Comment],models.users.User,models.Post,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(newPostForm: Form[models.Post], addCommentForm: Form[models.Comment], posts: List[models.Post], comments: List[models.Comment], user: models.users.User, post: models.Post):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.174*/("""
"""),_display_(/*3.2*/main("Newsfeed", user)/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""


    """),format.raw/*6.5*/("""<div class="well">
        <div class="row">
            <div class="col-sm-6 col-centered">
            """),_display_(/*9.14*/form(action = routes.HomeController.addPostSubmit(), 'class -> "form-horizontal", 'role -> "form")/*9.112*/ {_display_(Seq[Any](format.raw/*9.114*/("""
                """),_display_(/*10.18*/inputText(newPostForm("content"), '_label -> "What's on your mind? #facebook xD", 'class -> "form-control")),format.raw/*10.125*/("""


                """),format.raw/*13.17*/("""<button type="button" class="btn btn-default btn-lg">
                    <span class="glyphicon glyphicon-open"></span></button>
                <input type="submit" value="Add post" class="btn btn-primary" style="float: right">

                    <!--  <button type="button" class="btn" style="float: right">ADD POST</button>-->
            </div>

        </div>
        """)))}),format.raw/*21.10*/("""
        """),format.raw/*22.9*/("""<br>
        <div class="row">

        """),_display_(/*25.10*/for(p <- posts) yield /*25.25*/ {_display_(Seq[Any](format.raw/*25.27*/("""
            """),format.raw/*26.13*/("""<div class="col-sm-6 col-centered" style="border: 1px solid grey;">
                <div class="row">
                    <div>
                        <p><strong>"""),_display_(/*29.37*/p/*29.38*/.getUser.getName),format.raw/*29.54*/("""</strong> posted<span style="float: right;">27/07/1995</span></p>
                        <p>"""),_display_(/*30.29*/p/*30.30*/.getContent),format.raw/*30.41*/("""

                        """),format.raw/*32.25*/("""</p>
                    </div>

                </div>

                    <!-- koniec rowa-->
                <div class="row">
                    <div>
                        <button action""""),_display_(/*40.41*/post/*40.45*/.giveLike()),format.raw/*40.56*/("""" type="button" class="btn btn-default btn-lg">
                            <span class="glyphicon glyphicon-thumbs-up" ></span></button>
                            <p id="likes"> """),_display_(/*42.45*/post/*42.49*/.getLikes()),format.raw/*42.60*/("""</p>
                            """),_display_(/*43.30*/form(action = routes.HomeController.addCommentSubmit(), 'class -> "form-horizontal", 'role -> "form")/*43.131*/ {_display_(Seq[Any](format.raw/*43.133*/("""
                            """),_display_(/*44.30*/inputText(addCommentForm("content"), '_label -> "comment some shit", 'class -> "form-control")),format.raw/*44.124*/("""

                        """),format.raw/*46.25*/("""<input type="submit" value="Add comment" class="btn btn-primary" style="float: right">
                        """)))}),format.raw/*47.26*/("""

                    """),format.raw/*49.21*/("""</div>
                </div>

            </div>
            <br>
            """)))}),format.raw/*54.14*/("""


        """),format.raw/*57.9*/("""</div>
    </div>


""")))}),format.raw/*61.2*/("""
"""))
      }
    }
  }

  def render(newPostForm:Form[models.Post],addCommentForm:Form[models.Comment],posts:List[models.Post],comments:List[models.Comment],user:models.users.User,post:models.Post): play.twirl.api.HtmlFormat.Appendable = apply(newPostForm,addCommentForm,posts,comments,user,post)

  def f:((Form[models.Post],Form[models.Comment],List[models.Post],List[models.Comment],models.users.User,models.Post) => play.twirl.api.HtmlFormat.Appendable) = (newPostForm,addCommentForm,posts,comments,user,post) => apply(newPostForm,addCommentForm,posts,comments,user,post)

  def ref: this.type = this

}


}
}

/**/
object newsfeed extends newsfeed_Scope0.newsfeed_Scope1.newsfeed
              /*
                  -- GENERATED --
                  DATE: Mon Apr 03 00:23:44 IST 2017
                  SOURCE: /home/wdd/Desktop/seconyearproject_new/app/views/newsfeed.scala.html
                  HASH: 52cbcf16d44fd01d92ec84f6bba49b163dce2b88
                  MATRIX: 899->18|1167->190|1194->192|1224->214|1263->216|1296->223|1428->329|1535->427|1575->429|1620->447|1749->554|1796->573|2204->950|2240->959|2308->1000|2339->1015|2379->1017|2420->1030|2611->1194|2621->1195|2658->1211|2779->1305|2789->1306|2821->1317|2875->1343|3099->1540|3112->1544|3144->1555|3353->1737|3366->1741|3398->1752|3459->1786|3570->1887|3611->1889|3668->1919|3784->2013|3838->2039|3981->2151|4031->2173|4142->2253|4180->2264|4231->2285
                  LINES: 30->2|35->2|36->3|36->3|36->3|39->6|42->9|42->9|42->9|43->10|43->10|46->13|54->21|55->22|58->25|58->25|58->25|59->26|62->29|62->29|62->29|63->30|63->30|63->30|65->32|73->40|73->40|73->40|75->42|75->42|75->42|76->43|76->43|76->43|77->44|77->44|79->46|80->47|82->49|87->54|90->57|94->61
                  -- GENERATED --
              */
          