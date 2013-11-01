import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ColorServlet
	extends HttpServlet
{

	public void doGet(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException
	{

//		res.setContentTyp("text/html");

		PrintWriter out = res.getWriter();

		// Eingaben von Website hollen
		String farbe = req.getParameter("farbe");

		out.println("<html><head><title>unser kleines Servlet</title></head><body bgcolor=\""+farbe+"\" color=\"#440000\">");
		
		out.println("<p> du hast deine fabe gew&auml;hlt! </p>");

		out.println("</body></html>");

		out.close();
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException
	{
		doGet(req,res);
	}
}
