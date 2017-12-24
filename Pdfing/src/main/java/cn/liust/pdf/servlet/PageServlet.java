package cn.liust.pdf.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.liust.pdf.dao.PageDaoFactory;
import cn.liust.pdf.util.Util;

@WebServlet("/pageservlet")
public class PageServlet extends HttpServlet {
    ObjectMapper mapper = new ObjectMapper();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/json; charset=UTF-8");
        Util util = new Util();
        String data = util.getBodyData(request);
        Map map = mapper.readValue(data, Map.class);
        int pagesize =Integer.parseInt((String) map.get("pagesize")) ;
        int pagenum =Integer.parseInt((String)  map.get("pagenum"));
        response.getWriter().println(PageDaoFactory.INSTANCE.getPageData(pagenum, pagesize));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
