package pack;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class bbb extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        String name=request.getParameter("name");
        String city=request.getParameter("city");

        System.out.println("Data Arrived");
        System.out.println("Name : " + name);
        System.out.println("City : " + city);

        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        pw.println("<html>");
        pw.println("<head>");
        pw.println("<title>Data Page</title>");
        pw.println("</head>");
        pw.println("<body>");

        pw.println("<h2>Data Saved Successfully</h2>");
        pw.println("Name : " + name + "<br>");
        pw.println("City : " + city + "<br><br>");

        pw.println("<a href='" + request.getContextPath() + "/ccc?name="
                + name + "&city=" + city + "'>Save</a>");
        pw.println("</body>");
        pw.println("</html>");
    }
}
