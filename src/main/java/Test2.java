

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/message-handler")
public class Test2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Test2() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("Get: " + request.getParameter("message"));
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.getWriter().println("Post: " + request.getParameter("message"));
    }

    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.getWriter().println("Put: " + request.getParameter("message"));
    }

    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.getWriter().println("Delete: " + request.getParameter("message"));
    }

}
