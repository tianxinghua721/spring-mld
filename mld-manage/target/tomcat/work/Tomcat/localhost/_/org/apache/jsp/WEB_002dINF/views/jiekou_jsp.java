/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-08-23 04:50:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class jiekou_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<code class=\"language-html\"><!DOCTYPE html>  \r\n");
      out.write("<html lang=\"en\">  \r\n");
      out.write("<head>  \r\n");
      out.write("    <meta charset=\"UTF-8\">  \r\n");
      out.write("    <title>Document</title>  \r\n");
      out.write("    <script src=\"jquery.js\" type=\"text/javascript\"></script>  \r\n");
      out.write("</head>  \r\n");
      out.write("<body>  \r\n");
      out.write("      \r\n");
      out.write("手机号码：<input type=\"text\" name=\"phone\" id=\"phone\">  \r\n");
      out.write("<input id=\"btnSendCode\" type=\"button\" value=\"发送验证码\" onclick=\"sendMessage()\" />  \r\n");
      out.write("<p id='timeshort'></p>  \r\n");
      out.write("  \r\n");
      out.write("</body>  \r\n");
      out.write("  \r\n");
      out.write("<script type=\"text/javascript\">  \r\n");
      out.write("    /*-------------------------------------------*/  \r\n");
      out.write("    var after ='';  \r\n");
      out.write("    var InterValObj; //timer变量，控制时间  \r\n");
      out.write("    var count = 60; //间隔函数，1秒执行  \r\n");
      out.write("    var curCount = 60;//当前剩余秒数    \r\n");
      out.write("    var exp =new Date();  \r\n");
      out.write("    var time;  \r\n");
      out.write("    time = exp.getTime();  \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("          \r\n");
      out.write("        //获取cookie值  \r\n");
      out.write("        function getCookie(name){  \r\n");
      out.write("            var arr,reg=new RegExp(\"(^| )\"+name+\"=([^;]*)(;|$)\");  \r\n");
      out.write("            if(arr=document.cookie.match(reg))  \r\n");
      out.write("            return unescape(arr[2]);  \r\n");
      out.write("            else  \r\n");
      out.write("            return null;  \r\n");
      out.write("        }  \r\n");
      out.write("  \r\n");
      out.write("        //这是有设定过期时间的使用示例：   \r\n");
      out.write("            //s20是代表20秒   \r\n");
      out.write("            //h是指小时，如12小时则是：h12   \r\n");
      out.write("            //d是天数，30天则：d30       \r\n");
      out.write("        //设置cookie  \r\n");
      out.write("        function setCookie(name,value,time){   \r\n");
      out.write("                var strsec = getsec(time);   \r\n");
      out.write("                var exp = new Date();   \r\n");
      out.write("                exp.setTime(exp.getTime() + strsec*1);   \r\n");
      out.write("                document.cookie = name + \"=\"+ escape (value) + \";expires=\" + exp.toGMTString();   \r\n");
      out.write("            }   \r\n");
      out.write("            function getsec(str){   \r\n");
      out.write("               // alert(str);   \r\n");
      out.write("               var str1=str.substring(1,str.length)*1;   \r\n");
      out.write("               var str2=str.substring(0,1);   \r\n");
      out.write("               if (str2==\"s\")  \r\n");
      out.write("               {   \r\n");
      out.write("                    return str1*1000;   \r\n");
      out.write("               }  \r\n");
      out.write("               else if (str2==\"h\")  \r\n");
      out.write("               {   \r\n");
      out.write("                   return str1*60*60*1000;   \r\n");
      out.write("               }  \r\n");
      out.write("               else if (str2==\"d\")  \r\n");
      out.write("               {   \r\n");
      out.write("                   return str1*24*60*60*1000;   \r\n");
      out.write("               }   \r\n");
      out.write("            }   \r\n");
      out.write("                      \r\n");
      out.write("            function sendMessage() {  \r\n");
      out.write("                if(getCookie('after')>time &&  document.cookie.indexOf('after=') != -1){  \r\n");
      out.write("                    $('#timeshort').html('请不要在60秒内重复获取验证码');      \r\n");
      out.write("                }else{  \r\n");
      out.write("                    $('#timeshort').html('');  \r\n");
      out.write("                }  \r\n");
      out.write("                trySend();//调用一次          \r\n");
      out.write("             }  \r\n");
      out.write("            function trySend() {  \r\n");
      out.write("             if(getCookie('after')<time || document.cookie.indexOf('after=') == -1 || getCookie('after')==null){  \r\n");
      out.write("                //测试时先注释掉ajax请求代码，否则会不成  \r\n");
      out.write("                 $.ajax({  \r\n");
      out.write("                        url: \"你要请求的路径\",  \r\n");
      out.write("                        type: \"get\",  \r\n");
      out.write("                        dataType: \"json\",  \r\n");
      out.write("                        data: {'需要传的参数'},  \r\n");
      out.write("                        success: function (data) {  \r\n");
      out.write("                            if (data.code == 0) {  \r\n");
      out.write("                                alert('发送成功');  \r\n");
      out.write("                            } else {  \r\n");
      out.write("                                alert(data.msg);  \r\n");
      out.write("                            }  \r\n");
      out.write("                        },  \r\n");
      out.write("                        error: function () {  \r\n");
      out.write("  \r\n");
      out.write("                        }  \r\n");
      out.write("                    });  \r\n");
      out.write("  \r\n");
      out.write("                setCookie(\"after\",time+60*1000,\"s60\");  \r\n");
      out.write("                setCookie(\"phone\",$('#phone').val(),\"s60\");  \r\n");
      out.write("                curCount = count;  \r\n");
      out.write("                //设置button效果，开始计时  \r\n");
      out.write("                $(\"#btnSendCode\").attr(\"disabled\", \"true\");  \r\n");
      out.write("                $(\"#btnSendCode\").val(curCount + \"秒后重新获取\");  \r\n");
      out.write("                InterValObj = window.setInterval(SetRemainTime, 1000); //启动计时器，1秒执行一次  \r\n");
      out.write("            }  \r\n");
      out.write("        }     \r\n");
      out.write("    //timer处理函数  \r\n");
      out.write("    function SetRemainTime() {        \r\n");
      out.write("        if (curCount == 0) {                 \r\n");
      out.write("        window.clearInterval(InterValObj);//停止计时器  \r\n");
      out.write("        $(\"#btnSendCode\").removeAttr(\"disabled\");//启用按钮  \r\n");
      out.write("        $(\"#btnSendCode\").val(\"重新发送验证码\");  \r\n");
      out.write("        // code = \"\"; //清除验证码。如果不清除，过时间后，输入收到的验证码依然有效     \r\n");
      out.write("    } else {  \r\n");
      out.write("        curCount--;  \r\n");
      out.write("        $(\"#btnSendCode\").val(curCount + \"秒后重新获取\");  \r\n");
      out.write("        }  \r\n");
      out.write("    }  \r\n");
      out.write("    </script>  \r\n");
      out.write("  \r\n");
      out.write("</body>  \r\n");
      out.write("</html></code> ");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}