
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object Main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(page: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.31*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>Play Responsive Kamanu</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
        
        <!--  Load site-specific customizations after bootstrap. -->
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*12.54*/routes/*12.60*/.Assets.at("stylesheets/main.css"))),format.raw/*12.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*13.59*/routes/*13.65*/.Assets.at("images/favicon.png"))),format.raw/*13.97*/("""">
        
        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
          <script src="http://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.6.2/html5shiv.js"></script>
          <script src="http://cdnjs.cloudflare.com/ajax/libs/respond.js/1.2.0/respond.js"></script>
        <![endif]-->
    </head>
    <body>
    
     <!-- Responsive navbar -->
  <div class="navbar navbar-inverse navbar-fixed-top navbar-carbon" role="navigation">
    <div class="container">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
          <!--  Display three horizontal lines when navbar collapsed. -->
          <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="#"><img src=""""),_display_(Seq[Any](/*31.53*/routes/*31.59*/.Assets.at("images/header-logo.jpg"))),format.raw/*31.95*/(""""></a>
      </div>
      <div class="collapse navbar-collapse">
        <ul class="nav navbar-nav">
          <li class=""""),_display_(Seq[Any](/*35.23*/("active".when(page == "Home")))),format.raw/*35.54*/(""""><a href=""""),_display_(Seq[Any](/*35.66*/routes/*35.72*/.Application.index())),format.raw/*35.92*/("""">Home</a></li>
          <li class=""""),_display_(Seq[Any](/*36.23*/("active".when(page == "Page1")))),format.raw/*36.55*/(""""><a href=""""),_display_(Seq[Any](/*36.67*/routes/*36.73*/.Application.page1())),format.raw/*36.93*/("""">Store</a></li>
          <li class=""""),_display_(Seq[Any](/*37.23*/("active".when(page == "Page1")))),format.raw/*37.55*/(""""><a href=""""),_display_(Seq[Any](/*37.67*/routes/*37.73*/.Application.page1())),format.raw/*37.93*/("""">Pueo</a></li>
          <li class=""""),_display_(Seq[Any](/*38.23*/("active".when(page == "Page1")))),format.raw/*38.55*/(""""><a href=""""),_display_(Seq[Any](/*38.67*/routes/*38.73*/.Application.page1())),format.raw/*38.93*/("""">Aukahi</a></li>
          <li class=""""),_display_(Seq[Any](/*39.23*/("active".when(page == "Page1")))),format.raw/*39.55*/(""""><a href=""""),_display_(Seq[Any](/*39.67*/routes/*39.73*/.Application.page1())),format.raw/*39.93*/("""">Kamanu V6</a></li>
          <li class=""""),_display_(Seq[Any](/*40.23*/("active".when(page == "Page1")))),format.raw/*40.55*/(""""><a href=""""),_display_(Seq[Any](/*40.67*/routes/*40.73*/.Application.page1())),format.raw/*40.93*/("""">About</a></li>
        </ul>
      </div>
    </div>
  </div>
      """),_display_(Seq[Any](/*45.8*/content)),format.raw/*45.15*/("""
      <!-- Load Bootstrap JavaScript components. HTMLUnit (used in testing) requires JQuery 1.8.3 or below). -->
      <script src="http://code.jquery.com/jquery-1.8.3.min.js"></script>
      <script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
    </body>
</html>
"""))}
    }
    
    def render(page:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(page)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (page) => (content) => apply(page)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Sep 30 16:55:24 HST 2013
                    SOURCE: /Users/marc/PlayResponsiveKamanu/app/views/Main.scala.html
                    HASH: 7211f566bb5acbd868fe1ee703f6494d1dcb507d
                    MATRIX: 778->1|901->30|1338->431|1353->437|1409->471|1506->532|1521->538|1575->570|2525->1484|2540->1490|2598->1526|2757->1649|2810->1680|2858->1692|2873->1698|2915->1718|2989->1756|3043->1788|3091->1800|3106->1806|3148->1826|3223->1865|3277->1897|3325->1909|3340->1915|3382->1935|3456->1973|3510->2005|3558->2017|3573->2023|3615->2043|3691->2083|3745->2115|3793->2127|3808->2133|3850->2153|3929->2196|3983->2228|4031->2240|4046->2246|4088->2266|4194->2337|4223->2344
                    LINES: 26->1|29->1|40->12|40->12|40->12|41->13|41->13|41->13|59->31|59->31|59->31|63->35|63->35|63->35|63->35|63->35|64->36|64->36|64->36|64->36|64->36|65->37|65->37|65->37|65->37|65->37|66->38|66->38|66->38|66->38|66->38|67->39|67->39|67->39|67->39|67->39|68->40|68->40|68->40|68->40|68->40|73->45|73->45
                    -- GENERATED --
                */
            