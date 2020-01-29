package servret;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import work.WorkJAVA01;

@WebServlet("/cbwork")
public class JSPServret extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
	
		    request.setCharacterEncoding("Shift_JIS");
		
		    String First = request.getParameter("first");
//		    String Second = request.getParameter("second");
		    
		    WorkJAVA01 cl = new WorkJAVA01();
		    	
//    		CobolCalculator cobolCalculator = new CobolCalculator();
     		String data = cl.ConnectDB(First);
//    		String data = Integer.toString(cobolCalculator.add(Integer.parseInt(First), Integer.parseInt(Second)));
//    		System.out.println("JAVA: " + data);
//    		System.out.println("JAVA2: " + cobolCalculator.add(1, 2));
//   		String data = Integer.toString(cobolCalculator.add(Integer.parseInt(First))); 	    		 
//    		String data = First + "to" + Second;
//			response.getWriter().write(First + "+" +Second + "=");
    		response.getWriter().write(data);
		}
}
