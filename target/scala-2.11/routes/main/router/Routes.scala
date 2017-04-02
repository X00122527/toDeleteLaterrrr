
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Desktop/seconyearproject_new/conf/routes
// @DATE:Mon Apr 03 00:23:43 IST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:8
  LoginController_4: controllers.LoginController,
  // @LINE:27
  CountController_0: controllers.CountController,
  // @LINE:29
  AsyncController_2: controllers.AsyncController,
  // @LINE:37
  Assets_3: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:8
    LoginController_4: controllers.LoginController,
    // @LINE:27
    CountController_0: controllers.CountController,
    // @LINE:29
    AsyncController_2: controllers.AsyncController,
    // @LINE:37
    Assets_3: controllers.Assets
  ) = this(errorHandler, HomeController_1, LoginController_4, CountController_0, AsyncController_2, Assets_3, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, LoginController_4, CountController_0, AsyncController_2, Assets_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.LoginController.loginSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """editprofile""", """controllers.HomeController.editProfile"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newsfeed""", """controllers.HomeController.newsfeed"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addPostSubmit""", """controllers.HomeController.addPostSubmit"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addCommentSubmit""", """controllers.HomeController.addCommentSubmit"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addMealSubmit""", """controllers.HomeController.addMealSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.LoginController.register"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """meals""", """controllers.HomeController.meals"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addUserSubmit""", """controllers.LoginController.addUserSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_LoginController_login1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login1_invoker = createInvoker(
    LoginController_4.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_LoginController_loginSubmit2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_LoginController_loginSubmit2_invoker = createInvoker(
    LoginController_4.loginSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "loginSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """loginSubmit"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_LoginController_logout3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout3_invoker = createInvoker(
    LoginController_4.logout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_editProfile4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("editprofile")))
  )
  private[this] lazy val controllers_HomeController_editProfile4_invoker = createInvoker(
    HomeController_1.editProfile,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "editProfile",
      Nil,
      "GET",
      """""",
      this.prefix + """editprofile"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_newsfeed5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newsfeed")))
  )
  private[this] lazy val controllers_HomeController_newsfeed5_invoker = createInvoker(
    HomeController_1.newsfeed,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "newsfeed",
      Nil,
      "GET",
      """""",
      this.prefix + """newsfeed"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_addPostSubmit6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addPostSubmit")))
  )
  private[this] lazy val controllers_HomeController_addPostSubmit6_invoker = createInvoker(
    HomeController_1.addPostSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addPostSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """addPostSubmit"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_addCommentSubmit7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addCommentSubmit")))
  )
  private[this] lazy val controllers_HomeController_addCommentSubmit7_invoker = createInvoker(
    HomeController_1.addCommentSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addCommentSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """addCommentSubmit"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_addMealSubmit8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addMealSubmit")))
  )
  private[this] lazy val controllers_HomeController_addMealSubmit8_invoker = createInvoker(
    HomeController_1.addMealSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addMealSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """addMealSubmit"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_LoginController_register9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_LoginController_register9_invoker = createInvoker(
    LoginController_4.register,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "register",
      Nil,
      "GET",
      """""",
      this.prefix + """register"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_HomeController_meals10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("meals")))
  )
  private[this] lazy val controllers_HomeController_meals10_invoker = createInvoker(
    HomeController_1.meals,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "meals",
      Nil,
      "GET",
      """""",
      this.prefix + """meals"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_CountController_count11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count11_invoker = createInvoker(
    CountController_0.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_AsyncController_message12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message12_invoker = createInvoker(
    AsyncController_2.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_LoginController_addUserSubmit13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addUserSubmit")))
  )
  private[this] lazy val controllers_LoginController_addUserSubmit13_invoker = createInvoker(
    LoginController_4.addUserSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "addUserSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """addUserSubmit"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_Assets_versioned14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned14_invoker = createInvoker(
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:8
    case controllers_LoginController_login1_route(params) =>
      call { 
        controllers_LoginController_login1_invoker.call(LoginController_4.login)
      }
  
    // @LINE:9
    case controllers_LoginController_loginSubmit2_route(params) =>
      call { 
        controllers_LoginController_loginSubmit2_invoker.call(LoginController_4.loginSubmit)
      }
  
    // @LINE:10
    case controllers_LoginController_logout3_route(params) =>
      call { 
        controllers_LoginController_logout3_invoker.call(LoginController_4.logout)
      }
  
    // @LINE:13
    case controllers_HomeController_editProfile4_route(params) =>
      call { 
        controllers_HomeController_editProfile4_invoker.call(HomeController_1.editProfile)
      }
  
    // @LINE:15
    case controllers_HomeController_newsfeed5_route(params) =>
      call { 
        controllers_HomeController_newsfeed5_invoker.call(HomeController_1.newsfeed)
      }
  
    // @LINE:17
    case controllers_HomeController_addPostSubmit6_route(params) =>
      call { 
        controllers_HomeController_addPostSubmit6_invoker.call(HomeController_1.addPostSubmit)
      }
  
    // @LINE:18
    case controllers_HomeController_addCommentSubmit7_route(params) =>
      call { 
        controllers_HomeController_addCommentSubmit7_invoker.call(HomeController_1.addCommentSubmit)
      }
  
    // @LINE:19
    case controllers_HomeController_addMealSubmit8_route(params) =>
      call { 
        controllers_HomeController_addMealSubmit8_invoker.call(HomeController_1.addMealSubmit)
      }
  
    // @LINE:21
    case controllers_LoginController_register9_route(params) =>
      call { 
        controllers_LoginController_register9_invoker.call(LoginController_4.register)
      }
  
    // @LINE:23
    case controllers_HomeController_meals10_route(params) =>
      call { 
        controllers_HomeController_meals10_invoker.call(HomeController_1.meals)
      }
  
    // @LINE:27
    case controllers_CountController_count11_route(params) =>
      call { 
        controllers_CountController_count11_invoker.call(CountController_0.count)
      }
  
    // @LINE:29
    case controllers_AsyncController_message12_route(params) =>
      call { 
        controllers_AsyncController_message12_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:32
    case controllers_LoginController_addUserSubmit13_route(params) =>
      call { 
        controllers_LoginController_addUserSubmit13_invoker.call(LoginController_4.addUserSubmit)
      }
  
    // @LINE:37
    case controllers_Assets_versioned14_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned14_invoker.call(Assets_3.versioned(path, file))
      }
  }
}
