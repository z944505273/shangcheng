/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.20.v20190813
 * Generated at: 2020-06-29 14:06:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.spu;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("file:/D:/JAVApeizhi/repository/org/apache/taglibs/taglibs-standard-impl/1.2.5/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1567840054114L));
    _jspx_dependants.put("jar:file:/D:/JAVApeizhi/repository/org/apache/taglibs/taglibs-standard-impl/1.2.5/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425949870000L));
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
      out.write("  \r\n");
      out.write("<link href=\"./resource/bootstrap-treeview/css/bootstrap-treeview.css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"./resource/bootstrap-treeview/js/bootstrap-treeview.js\"></script>\r\n");
      out.write("\r\n");
      out.write("     \r\n");
      out.write("    \r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("\t<form action=\"\" id=\"spuForm\">\t\r\n");
      out.write("\t\t<div class=\"form-group row\">\r\n");
      out.write("\t\t    <label for=\"goodsName\" class=\"col-sm-2 col-form-label\">名称</label>\r\n");
      out.write("\t\t    <div class=\"col-sm-4\">\r\n");
      out.write("\t\t      <input type=\"text\" class=\"form-control\" id=\"goodsName\" name=\"goodsName\">\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t </div>\r\n");
      out.write("\t\t <div class=\"form-group row\">\r\n");
      out.write("\t\t \t<label for=\"isMarketable\" class=\"col-sm-2 col-form-label\">上架</label>\r\n");
      out.write("\t\t   <select name=\"isMarketable\" id=\"isMarketable\">\r\n");
      out.write("\t\t   \t <option value=\"1\">在售</option>\r\n");
      out.write("\t\t   \t <option value=\"0\">下架</option>\r\n");
      out.write("\t\t   </select>\t \r\n");
      out.write("\t\t </div>\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t <div class=\"form-group row\">\r\n");
      out.write("\t\t    <label for=\"goodsName\" class=\"col-sm-2 col-form-label\">分类</label>\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t    <div class=\"col-sm-4\">\r\n");
      out.write("\t\t      <input type=\"hidden\" name=\"categoryId\" id=\"categoryId\">\t\r\n");
      out.write("\t\t      <input type=\"button\" id=\"catName\" class=\"form-control\" onclick=\"seleCategory()\">\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t </div>\r\n");
      out.write("\t\t  <div class=\"form-group row\" >\r\n");
      out.write("\t\t   <div class=\"col-sm-10\" id=\"catTree\" style=\"display:none ;position: absolute; z-index: 1000;width: 90%\" >\r\n");
      out.write("\t\t   </div>\r\n");
      out.write("\t\t </div> \r\n");
      out.write("\t\t \r\n");
      out.write("\t\t\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t <div class=\"form-group row\">\r\n");
      out.write("\t\t    <label for=\"caption\" class=\"col-sm-2 col-form-label\">标题</label>\r\n");
      out.write("\t\t    <div class=\"col-sm-4\">\r\n");
      out.write("\t\t      <input type=\"text\" class=\"form-control\" id=\"caption\" name=\"caption\">\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t </div>\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t <div class=\"form-group row\">\r\n");
      out.write("\t\t    <label for=\"brandId\" class=\"col-sm-2 col-form-label\">品牌</label>\r\n");
      out.write("\t\t    <div class=\"col-sm-4\">\r\n");
      out.write("\t\t      <select name=\"brandId\">\r\n");
      out.write("\t\t      \t<option value=\"0\">--请选择--</option>\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t      </select>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t </div>\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t  <div class=\"form-group row\">\r\n");
      out.write("\t\t    <label for=\"caption\" class=\"col-sm-2 col-form-label\">图片</label>\r\n");
      out.write("\t\t    <div class=\"col-sm-4\">\r\n");
      out.write("\t\t      <input type=\"file\" class=\"form-control\"  name=\"myFile\">\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t </div>\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t   <div class=\"form-group row\">\r\n");
      out.write("\t\t   \t<button type=\"button\" class=\"btn btn-primary btn-lg\" onclick=\"commitData()\">添加</button>\r\n");
      out.write("\t\t   </div>\r\n");
      out.write("\t\t \t\t \r\n");
      out.write("\t</form>\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("\tfunction seleCategory(){\r\n");
      out.write("\t\t$(\"#catTree\").show()\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction commitData(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar formData = new FormData($(\"#spuForm\")[0]);\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl:'./spu/add',\r\n");
      out.write("\t\t\t type:'post',\r\n");
      out.write("\t\t\tdata:formData,\r\n");
      out.write("\t\t\tcontentType:false,\r\n");
      out.write("\t\t\tprocessData:false,\r\n");
      out.write("\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\tif(data=='ok'){\r\n");
      out.write("\t\t\t\t\talert('添加成功')\r\n");
      out.write("\t\t\t\t\t//刷新\r\n");
      out.write("\t\t\t\t\t$(\"#workContent\").load('./spu/list');\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\talert('添加失败')\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction initTree(){\r\n");
      out.write("\t\t$.post('./cat/data',{},function(data){\r\n");
      out.write("\t\t\t$('#catTree').treeview({\r\n");
      out.write("\t\t\t\t  data: data,         // data is not optional\r\n");
      out.write("\t\t\t\t  levels: 2,\r\n");
      out.write("\t\t\t\t  onNodeSelected: function(event, data) {\r\n");
      out.write("\t\t\t\t\t  if(data.nodes.length==0){\r\n");
      out.write("\t\t\t\t\t\t  $(\"#catName\").val(data.text)\r\n");
      out.write("\t\t\t\t\t\t  $(\"#categoryId\").val(data.id)\r\n");
      out.write("\t\t\t\t\t\t  $(\"#catTree\").hide()\r\n");
      out.write("\t\t\t\t\t  }\r\n");
      out.write("\t\t\t\t  }\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\r\n");
      out.write("\t}\t\r\n");
      out.write("\t\r\n");
      out.write("\t//初始化树状图\r\n");
      out.write("\tinitTree();\r\n");
      out.write("\t\r\n");
      out.write("</script>");
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
      // /WEB-INF/view/spu/add.jsp(52,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/view/spu/add.jsp(52,4) '${brandList}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${brandList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/view/spu/add.jsp(52,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("brand");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t\t<option value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${brand.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write('"');
            out.write('>');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${brand.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</option>\r\n");
            out.write("\t\t\t\t");
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
}
