/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.38
 * Generated at: 2020-07-28 01:49:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class confirm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/D:/Learn/estor-project/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/webapps/estore/WEB-INF/lib/standard-1.1.2.jar!/META-INF/c.tld", Long.valueOf(1098682290000L));
    _jspx_dependants.put("/WEB-INF/lib/standard-1.1.2.jar", Long.valueOf(1595208129089L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write(" >\r\n");

  String basePath = request.getScheme() + "://" + request.getServerName() + ":" +
            request.getServerPort() + request.getContextPath() + "/";


      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(basePath );
      out.write("\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>结算页面</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/common.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/icons.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/table.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/orderSure.css\" />\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\tfunction showAdres(sp){\r\n");
      out.write("\t\tvar pa = document.getElementById(\"newAdres\");\r\n");
      out.write("\t\tconsole.log(pa.style['display']);\r\n");
      out.write("\t\tif(pa.style['display']==\"none\"){\r\n");
      out.write("\t\t\tpa.style['display'] = 'block';\r\n");
      out.write("\t\t\tsp.innerHTML = \"取消新增地址\";\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tpa.style['display'] = 'none';\r\n");
      out.write("\t\t\tsp.innerHTML = \"新增收货地址\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!--顶部-->\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "top.jsp", out, false);
      out.write("\r\n");
      out.write("    <!--头部-->\r\n");
      out.write("    <div class=\"header3\">\r\n");
      out.write("    \t<a href=\"#\"><img src=\"images/logo.png\"  class=\"oneImg\"></a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"h3_right\">\r\n");
      out.write("        \t<img src=\"images/play_03.png\" alt=\"\">\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\t<p class=\"orderButtom\">填写并核对订单信息</p>\r\n");
      out.write("    <!--中间复杂部分-->\r\n");
      out.write("    <div class=\"content\">\r\n");
      out.write("    \t<div class=\"contentCenter\">\r\n");
      out.write("\r\n");
      out.write("\t\t<form action=\"orderlist.html\" name=\"orderForm\">\r\n");
      out.write("\r\n");
      out.write("    \t\t<div class=\"centerTop\">\r\n");
      out.write("    \t\t\t<b style=\"font-size:20px;\">收货人信息</b>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<b style=\"float: right;cursor: pointer;\" onclick=\"showAdres(this);\"\r\n");
      out.write("    \t\t\t   ondblclick=\"hideAdres(this);\">新增收货地址</b>\r\n");
      out.write("    \t\t\t<ul class=\"adres\">\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t    \t</ul>\r\n");
      out.write("\r\n");
      out.write("    \t\t\t<p id=\"newAdres\" style=\"font-size:15px;display: none;\">\r\n");
      out.write("\t\t\t\t\t收件人姓名：<input type=\"text\" name=\"receiveName\"><br/><br/>\r\n");
      out.write("\t\t\t\t\t收件人地址：<input type=\"text\" name=\"address\"><br/><br/>\r\n");
      out.write("\t\t\t\t\t收件人电话：<input type=\"text\" name=\"phone\" >\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("    \t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \t\t<p class=\"singleP\"><b>送货清单</b><span><a href=\"user/toShopCarServlet\">返回修改购物车</a></span></p>\r\n");
      out.write("    \t\t<div class=\"bigDiv\">\r\n");
      out.write("    \t\t\t<div class=\"twoDiv\">\r\n");
      out.write("    \t\t\t\t<b>商家：briup自营</b>\r\n");
      out.write("    \t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    \t\t\t</div>\r\n");
      out.write("    \t\t</div>\r\n");
      out.write("\r\n");
      out.write("    \t\t<div class=\"money\">\r\n");
      out.write("    \t\t\t<span><font>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${car.sumNum }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</font>件商品，总商品金额：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;¥");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${car.cost }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("    \t\t\t<span><img src=\"images/sureLogo_18.png\" alt=\"\">运费：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;¥0.00</span>\r\n");
      out.write("\r\n");
      out.write("    \t\t\t<span>应付总额：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;¥");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${car.cost }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("    \t\t</div>\r\n");
      out.write("    \t\t<div class=\"submit\">\r\n");
      out.write("    \t\t\t<span>应付金额：<font>¥");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${car.cost }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</font><input type=\"image\" src=\"images/21_03.png\"></span>\r\n");
      out.write("    \t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("    \t</div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\t  <!--脚部-->\r\n");
      out.write("    <div class=\"footer3\">\r\n");
      out.write("    \t<div class=\"f3_top\">\r\n");
      out.write("        \t<div class=\"f3_center\">\r\n");
      out.write("                <div class=\"ts1\">品目繁多 愉悦购物</div>\r\n");
      out.write("                <div class=\"ts2\">正品保障 天天低价</div>\r\n");
      out.write("                <div class=\"ts3\">极速物流 特色定制</div>\r\n");
      out.write("                <div class=\"ts4\">优质服务 以客为尊</div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"f3_middle\">\r\n");
      out.write("        \t<ul class=\"f3_center\">\r\n");
      out.write("            \t<li class=\"f3_mi_li01\">\r\n");
      out.write("                \t<h1>购物指南</h1>\r\n");
      out.write("                    <p>常见问题</p>\r\n");
      out.write("                    <p>找回密码</p>\r\n");
      out.write("                    <p>会员介绍</p>\r\n");
      out.write("                    <p>购物演示</p>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"f3_mi_li01\">\r\n");
      out.write("                \t<h1>配送方式</h1>\r\n");
      out.write("                    <p>常见问题</p>\r\n");
      out.write("                    <p>找回密码</p>\r\n");
      out.write("                    <p>会员介绍</p>\r\n");
      out.write("                    <p>购物演示</p>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"f3_mi_li01\">\r\n");
      out.write("                \t<h1>支付方式</h1>\r\n");
      out.write("                    <p>常见问题</p>\r\n");
      out.write("                    <p>找回密码</p>\r\n");
      out.write("                    <p>会员介绍</p>\r\n");
      out.write("                    <p>购物演示</p>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"f3_mi_li01\">\r\n");
      out.write("                \t<h1>售后服务</h1>\r\n");
      out.write("                    <p>常见问题</p>\r\n");
      out.write("                    <p>找回密码</p>\r\n");
      out.write("                    <p>会员介绍</p>\r\n");
      out.write("                    <p>购物演示</p>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"f3_mi_li01\">\r\n");
      out.write("                \t<h1>服务保障</h1>\r\n");
      out.write("                    <p>常见问题</p>\r\n");
      out.write("                    <p>找回密码</p>\r\n");
      out.write("                    <p>会员介绍</p>\r\n");
      out.write("                    <p>购物演示</p>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"f3_mi_li06\">\r\n");
      out.write("                \t<h1>客服中心</h1>\r\n");
      out.write("                    <img src=\"images/qrcode_jprj.jpg\" width=\"80px\" height=\"80px\">\r\n");
      out.write("                    <p>抢红包、疑问咨询、优惠活动</p>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("         <div class=\"f3_bottom\">\r\n");
      out.write("        \t<p class=\"f3_links\">\r\n");
      out.write("                <a href=\"#\">关于我们</a>|\r\n");
      out.write("                <a href=\"#\">联系我们</a>|\r\n");
      out.write("                <a href=\"#\">友情链接</a>|\r\n");
      out.write("                <a href=\"#\">供货商入驻</a>\r\n");
      out.write("           \t</p>\r\n");
      out.write("            <p>沪ICP备14033591号-8 杰普软件briup.com版权所有 杰普软件科技有限公司 </p>\r\n");
      out.write("          \t<img src=\"images/police.png\">\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/user/confirm.jsp(60,5) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${addressList }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /WEB-INF/user/confirm.jsp(60,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("address");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t    \t\t<li>\r\n");
            out.write("\t\t\t    \t\t\t<input type=\"radio\" name=\"shipAddId\" value=\"\" style=\"width:50px\">\r\n");
            out.write("\t\t\t    \t\t\t收货人姓名:");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${address.receiveName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("&nbsp;&nbsp;&nbsp;收货电话:");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${address.phone }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("&nbsp;&nbsp;&nbsp;收货地址:");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${address.address }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\r\n");
            out.write("\t\t\t    \t\t</li>\r\n");
            out.write("\t\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f1_reused = false;
    try {
      _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f1.setParent(null);
      // /WEB-INF/user/confirm.jsp(81,8) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${car.orderLines }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /WEB-INF/user/confirm.jsp(81,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setVar("entry");
      int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
        if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t\t<ul class=\"oneUL\">\r\n");
            out.write("    \t\t\t\t\t<li>\r\n");
            out.write("    \t\t\t\t\t\t<img src=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${entry.value.book.image }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" class=\"pic\">\r\n");
            out.write("    \t\t\t\t\t\t<p>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${entry.value.book.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</p>\r\n");
            out.write("    \t\t\t\t\t\t<p><font>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${entry.value.book.price }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;×");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${entry.value.num }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;有货</p>\r\n");
            out.write("    \t\t\t\t\t\t<p><img src=\"images/sureLogo_14.png\" alt=\"\"><span>七天无理由退换货</span></p>\r\n");
            out.write("\r\n");
            out.write("    \t\t\t\t\t</li>\r\n");
            out.write("    \t\t\t\t\t<li><pre>【赠品】  高级定制干花书签  随机  ×1</pre></li>\r\n");
            out.write("\t\t\t\t\t</ul>\r\n");
            out.write("\t\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
      _jspx_th_c_005fforEach_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f1_reused);
    }
    return false;
  }
}
