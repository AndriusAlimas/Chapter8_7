package example.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.ArrayList;

public class MyServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, 
			HttpServletResponse response)throws ServletException,IOException{
		// create String array object and give elements of Strings:
		String[] favoriteMusic = new String[]{"Zero 7", "Tahiti 80", "BT", "Frou Frou"};
		// save this to request scope attribute:
        request.setAttribute("musicList", favoriteMusic);
        // create an ArrayList object of strings:
        ArrayList<String> foodList = new ArrayList<String>();
        // add elements to this list:
        foodList.add("chai ice cream");
        foodList.add("fajitas");
        foodList.add("thai pizza");
        foodList.add("anything in  dark chocolate");
        // now set this List to request scope:
        request.setAttribute("foodList", foodList);
        // create request dispatcher object from request object:
        RequestDispatcher rd = request.getRequestDispatcher("Test.jsp");
        // forward this request to another servlet which its jsp, and pass along these objects:
        rd.forward(request, response);
	}
}
