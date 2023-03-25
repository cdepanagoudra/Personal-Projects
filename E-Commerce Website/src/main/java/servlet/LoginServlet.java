package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.UserDao;
import model.User;

import myconnection.conProvider;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/user-login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("login.jsp");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try(PrintWriter out = response.getWriter()) {
			
			out.print("<h1> this is login servlet </h1>");
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			out.println(email);
			out.println(password);
			try {
				UserDao udao= new UserDao(conProvider.getConnection());
				User user = udao.userLogin(email, password);
				
				if(user != null) {
					request.getSession().setAttribute("auth", user);
					response.sendRedirect("index.jsp");
					out.print("user loggedIn");
				}else {
					out.print("user loggin failed");
					out.println(user);
					
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
