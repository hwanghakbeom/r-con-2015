/* NOTE this file is autogenerated by Scalate : see http://scalate.fusesource.org/ */
package scalate.quickstart.action

object $_scalate_$Info_mustache {
  def $_scalate_$render($_scalate_$_context: _root_.org.fusesource.scalate.RenderContext): Unit = {
    ;{
      val helper: xitrum.Action = $_scalate_$_context.attribute("helper")
      import helper._
      ;{
        val context: _root_.org.fusesource.scalate.RenderContext = $_scalate_$_context.attribute("context")
        import context._
        
        
        import _root_.org.fusesource.scalate.mustache._
        
        val $_scope_1 = Scope($_scalate_$_context)
        $_scalate_$_context << ( "<div class=\"row\">\n\t<div class=\"col-xs-1\"></div>\n\t\t<div class=\"col-xs-10\">\n<br>\n<h1><font style=\"color:rgb(0,150,167)\">\uc790\uc6d0\ubd09\uc0ac\uc790\ub97c \ubaa8\uc9d1\ud558\uace0 \uc788\uc2b5\ub2c8\ub2e4.</font></h1><br>\n<form class=\"form-inline\">\n  <div class=\"form-group\">\n<label><font size=4.000rem>\uc774\ub984</font></label><input type=\"text\" class=\"form-control\"></input>\n</div>\n  <div class=\"form-group\">\n<label><font size=4.000rem>\uc804\ud654\ubc88\ud638</font></label><input type=\"text\" class=\"form-control\" placeholder=\"xxx-xxxx-xxxx\"></input>\n</div>\n  <div class=\"form-group\">\n<label><font size=4.000rem>\uc774\uba54\uc77c</font></label><input type=\"email\" class=\"form-control\" placeholder=\"volunteer@goit.com\"></input>\n</div>\n<button type=\"submit\" class=\"btn btn-default\">Submit</button>\n</form>\n<br>\n<h1><font style=\"color:rgb(0,150,167)\">\uc8fc\uc694\uc77c\uc815</font></h1>\n<h3>2014.4.19 \ucee8\ud37c\ub7f0\uc2a4 \ud648\ud398\uc774\uc9c0 \uc624\ud508</h3>\n<h3>2014.5.30 \ubc1c\ud45c\uc790 \ub9c8\uac10</h3>\n<h3>2014.6.15 \ud544\uc694\ud55c \uc77c</h3>\n<br>\n<h1><font style=\"color:rgb(0,150,167)\">\ubc1c\ud45c\uc790 \ubaa8\uc9d1</font></h1>\n<h3>\ubc1c\ud45c\uc790 \ubaa8\uc9d1\uc740 <font color=\"red\">5.30</font>\uc77c \uae4c\uc9c0 \ubaa8\uc9d1\ud569\ub2c8\ub2e4. \uc120\ud638\ud558\ub294 \ubc1c\ud45c\uc8fc\uc81c\ub294 \ub2e4\uc74c\uacfc \uac19\uc2b5\ub2c8\ub2e4.</h3>\n<div style=\"font-size: 24px\">\n<i class=\"glyphicon glyphicon-ok\" style=\"color:green\"></i>\ubc1c\ud45c?<br>\n<i class=\"glyphicon glyphicon-ok\" style=\"color:green\"></i>\ubc1c\ud45c?<br>\n<i class=\"glyphicon glyphicon-ok\" style=\"color:green\"></i>\ubc1c\ud45c?<br>\n</div>\n<h1>\ubb38\uc758\uc0ac\ud56d:golden_temple@hotmail.co.kr</h1>\n</div>\n\t<div class=\"col-xs-1\"></div>\n</div>" )
      }
    }
  }
}


class $_scalate_$Info_mustache extends _root_.org.fusesource.scalate.Template {
  def render(context: _root_.org.fusesource.scalate.RenderContext): Unit = $_scalate_$Info_mustache.$_scalate_$render(context)
}