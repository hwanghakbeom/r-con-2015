/* NOTE this file is autogenerated by Scalate : see http://scalate.fusesource.org/ */
package scalate.quickstart.action

object $_scalate_$Schedule_mustache {
  def $_scalate_$render($_scalate_$_context: _root_.org.fusesource.scalate.RenderContext): Unit = {
    ;{
      val helper: xitrum.Action = $_scalate_$_context.attribute("helper")
      import helper._
      ;{
        val context: _root_.org.fusesource.scalate.RenderContext = $_scalate_$_context.attribute("context")
        import context._
        
        
        import _root_.org.fusesource.scalate.mustache._
        
        val $_scope_1 = Scope($_scalate_$_context)
        $_scalate_$_context << ( "<style>\n.name {font-size:13px; color:#3BAFDA; font-weight: bold;}\n.title {font-size:16px; color:#656D78; font-weight: bold;}\n.small_title {font-size:13px; color:#656D78; font-weight: bold;}\n.time {\nborder-right: 1px solid #dddddd;\n}\n\n  \n\n</style>\n\n<!-- ///  begin schedule  /// -->\n<div class=\"schedule\" id=\"schedule\">\n\n\t<div class=\"container\"> \n                <div class=\"section-heading\">\n                        <h1>Program</h1>\n                </div>\n\t\t<div class=\"row\">   \n\t\t\t<div class=\"col-xs-12\">\n\t\t\t\t<!-- Nav tabs -->\n\t\t\t\t<table class=\"table table-responsive\" cellspacing=\"0\" cellpadding=\"0\" width=\"880\" align=\"center\" border=\"0\">\n\t\t\t\t\t<tbody>\n\t\t\t\t\t\t<tr class=\"info\">\n\t\t\t\t\t\t\t<td  class=\"time\" width=\"130\" align=\"center\">~09:30</td>\n\t\t\t\t\t\t\t<td  height=\"25\" colspan=\"3\" align=\"center\"><strong>Registration</strong></td>\n\t\t\t\t\t\t</tr>\n\t\t\t\t\t\t<tr>\n\t\t\t\t\t\t\t<td  class=\"time\" width=\"130\" align=\"center\">08:30~09:30</td>\n\t\t\t\t\t\t\t<td  height=\"25\" colspan=\"3\" align=\"center\"><span><b>\ucd95\uc0ac & \ud658\uc601\uc0ac & \uac1c\ud68c\uc0ac</b></span></td>\n\t\t\t\t\t\t</tr>\n\t\t\t\t\t\t<tr>\n\t\t\t\t\t\t\t<td  class=\"time\" width=\"130\" align=\"center\" style=\"vertical-align:middle;\">10:00~10:40</td>\n\t\t\t\t\t\t\t<td  height=\"60\" colspan=\"3\" align=\"center\"><span class=\"title\">Keynote 1 : </td>\n\t\t\t\t\t\t</tr>\n\t\t\t\t\t\t<tr>\n\t\t\t\t\t\t\t<td  class=\"time\" width=\"130\" align=\"center\" style=\"vertical-align:middle;\" >10:40~11:20</td>\n\t\t\t\t\t\t\t<td  height=\"60\" colspan=\"3\" align=\"center\"><span class=\"title\">Keynote 2 : \uae30\uc5c5\uc5d0\uc11c\uc758 \ub370\uc774\ud130 \uc0ac\uc774\uc5b8\uc2a4, \uadf8 \uc2e4\uc81c \ud604\uc2e4\uacfc \ube44\uc804</span><br><span class=\"name\">\uc815\ub3c4\ud76c / SK\ud154\ub808\ucf64 Data Insight\ud300\uc7a5</span></td></tr>\n\t\t\t\t\t\t\t<tr>\n\t\t\t\t\t\t\t\t<td  class=\"time\" width=\"130\" align=\"center\">11:20~12:00</td>\n\t\t\t\t\t\t\t\t<td  height=\"40\" colspan=\"3\" align=\"center\"><span class=\"title\">Keynote 3 : </td>\n\t\t\t\t\t\t\t</tr>\n\t\t\t\t\t\t\t<tr class=\"success\">\n\t\t\t\t\t\t\t\t<td  class=\"time\" width=\"130\" align=\"center\">12:00~13:00</td>\n\t\t\t\t\t\t\t\t<td  colspan=\"3\" align=\"center\"><strong>Lunch Break </strong></td>\n\t\t\t\t\t\t\t</tr>\n\n\t\t\t\t\t\t\t<tr>\n\t\t\t\t\t\t\t<td class=\"time\" bgcolor=\"#ffdf7d\" height=\"30\" width=\"250\" valign=\"middle\" align=\"center\"><span  style=\"COLOR: rgb(0,0,0)\">2\ubd80<br>\uac1c\ubcc4\uc138\uc158 </span> </td>\n\t\t\t\t\t\t\t\t<td bgcolor=\"#48CFAD\" height=\"30\" width=\"300\" align=\"center\"><span  style=\"COLOR: rgb(0,0,0)\">Track 1 <br>R\uacfc \ud1b5\uacc4\uc801 \ub370\uc774\ud130 \ubd84\uc11d </span> </td>\n\t\t\t\t\t\t\t\t<td bgcolor=\"#EC87C0\" valign=\"middle\" width=\"300\" align=\"center\"><span  style=\"COLOR: rgb(0,0,0)\">Track 2 <br>R\uacfc \ub370\uc774\ud130 \ubd84\uc11d \ud65c\uc6a9 </span> </td>\n\t\t\t\t\t\t\t\t<td bgcolor=\"#AC92EC\" valign=\"middle\" width=\"300\" align=\"center\"><span  style=\"COLOR: rgb(0,0,0)\">Track 3 <br>R\uacfc \ub370\uc774\ud130 \uc5d4\uc9c0\ub2c8\uc5b4\ub9c1 </span> </td>\n\t\t\t\t\t\t\t</tr>\n\t\t\t\t\t\t\t<tr>\n\t\t\t\t\t\t\t\t<td  class=\"time\" height=\"40\" align=\"center\" style=\"vertical-align:middle;\">13:00~13:50</td>\n\t\t\t\t\t\t\t\t<td  class=\"time\" align=\"center\"><span class=\"small_title\">Stochastic Social Network Analysis \nin R (STATNET)</span><br/><span class=\"name\">\ucc44\ucda9\uc77c/Penn State Univ. </span><br></td>\n\t\t\t\t\t\t\t\t<td  class=\"time\" align=\"center\"><span class=\"small_title\">R\uc744 \uc774\uc6a9\ud55c \uae30\uc0c1 \ub370\uc774\ud130<br/>\uc2dc\uac01\ud654 \ubc0f \ud65c\uc6a9</span><br/><span class=\"name\">\uae40\uc2b9\uc6b1/\uae30\uc0c1\uccad</span><br></td>\n\t\t\t\t\t\t\t\t<td  align=\"center\"><span class=\"small_title\">Apache Tajo\uc640 R\uc744 \uc5f0\ub3d9\ud55c<br/>\ube45\ub370\uc774\ud130 \ubd84\uc11d</span><br><span class=\"name\">\uace0\uc601\uacbd/\uadf8\ub8e8\ud130</span><br></td>\n\t\t\t\t\t\t\t</tr>\n\t\t\t\t\t\t\t<tr class=\"warning\">\n\t\t\t\t\t\t\t\t<td  class=\"time\" width=\"130\" align=\"center\" style=\"vertical-align:middle;\">13:50~14:00</td>\n\t\t\t\t\t\t\t\t<td  colspan=\"3\" align=\"center\"><strong>Break</strong></td>\n\t\t\t\t\t\t\t</tr>\n\t\t\t\t\t\t\t<tr>\n\n\t\t\t\t\t\t\t\t<td  class=\"time\" height=\"40\" align=\"center\" style=\"vertical-align:middle;\">14:00~14:50</td>\n\t\t\t\t\t\t\t\t<td  class=\"time\" align=\"center\" style=\"vertical-align:middle;\"><span class=\"name\">\ubbf8\uc815</span><br></td>\n\t\t\t\t\t\t\t\t<td  class=\"time\" align=\"center\"><span class=\"small_title\">R\uc744 \ud65c\uc6a9\ud55c <br>\ud648 \ub370\uc774\ud130 \ubd84\uc11d \ud50c\ub7ab\ud3fc</span><br><span class=\"name\">\uae40\uc9c0\uc601/ETRI</span><br></td>\n\t\t\t\t\t\t\t\t<td  class=\"time\" align=\"center\" ><span class=\"small_title\">\ubbf8\uc815<br><br></span><span class=\"name\">\uae40\uc778\ubc94/SK C&C</span><br></td>\n\t\t\t\t\t\t\t</tr>\n\t\t\t\t\t\t\t<tr class=\"warning\">\n\t\t\t\t\t\t\t\t<td  class=\"time\" width=\"130\" align=\"center\" style=\"vertical-align:middle;\">14:50~15:30</td>\n\t\t\t\t\t\t\t\t<td  colspan=\"3\" align=\"center\"><strong>Coffee Break</strong></td>\n\t\t\t\t\t\t\t</tr>\n\t\t\t\t\t\t\t<tr>\n\t\t\t\t\t\t\t\t<td  class=\"time\" align=\"center\" style=\"vertical-align:middle;\">15:30~16:20</td>\n\t\t\t\t\t\t\t\t<td  class=\"time\" align=\"center\" style=\"vertical-align:middle;\"><span class=\"name\">\ubbf8\uc815</span><br></td>\n\t\t\t\t\t\t\t\t<td  class=\"time\" align=\"center\"><span class=\"small_title\">\ubbf8\uc815<br><br></span><span class=\"name\">\ud669\uc2b9\uc2dd/\uc778\ud558\ub300 \uc758\ud559\uc804\ubb38\ub300\ud559\uc6d0</span><br></td>\n\t\t\t\t\t\t\t\t<td  class=\"time\" align=\"center\"><span class=\"small_title\">SparkR - Spark\ub97c \uc774\uc6a9\ud55c \ubd84\uc0b0\ud658\uacbd\uc5d0\uc11c\uc758 R \ud504\ub85c\uadf8\ub798\ubc0d</span><br><span class=\"name\">\uc774\uc0c1\ud6c8/SK C&C</span><br></td>\n\t\t\t\t\t\t\t</tr>\n\t\t\t\t\t\t\t<tr class=\"warning\">\n\t\t\t\t\t\t\t\t<td  class=\"time\" width=\"130\" valign=\"center\" align=\"center\" style=\"vertical-align:middle;\">16:20~16:30</td>\n\t\t\t\t\t\t\t\t<td  colspan=\"3\" align=\"center\"><strong>Break</strong></td>\n\t\t\t\t\t\t\t</tr>\n\t\t\t\t\t\t\t<tr>\n\t\t\t\t\t\t\t\t<td  class=\"time\" height=\"40\" width=\"130\" align=\"center\">16:30~17:20</td>\n\t\t\t\t\t\t\t\t<td  align=\"center\" colspan=\"3\"><span class=\"name\">\ubbf8\uc815</span></td>\n\t\t\t\t\t\t\t</tr>\n\t\t\t\t\t\t\t<tr class=\"info\">\n\t\t\t\t\t\t\t\t<td  class=\"time\" width=\"130\" align=\"center\" style=\"vertical-align:middle;\">17:20</td>\n\t\t\t\t\t\t\t\t<td  colspan=\"3\" align=\"center\"><strong>\ud3d0\ud68c</strong></td>\n\t\t\t\t\t\t\t</tr>\n\t\t\t\t\t\t\t</tbody>\n\t\t\t\t\t\t</table>\n\t\t\t\t\t</div>\n\t\t\t\t\t<!-- Tab panes -->    \n     \n\t\t\t\t</div>\n\t\t\t</div>\n\t\t</div>\n\t</div>\n    <!-- ///  end schedule  /// -->\n" )
      }
    }
  }
}


class $_scalate_$Schedule_mustache extends _root_.org.fusesource.scalate.Template {
  def render(context: _root_.org.fusesource.scalate.RenderContext): Unit = $_scalate_$Schedule_mustache.$_scalate_$render(context)
}