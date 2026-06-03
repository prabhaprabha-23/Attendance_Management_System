import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class attendanceServlet extends HttpServlet {

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws IOException {

        String rollno = request.getParameter("rollno");
        String name = request.getParameter("name");

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<h2>Attendance Marked Successfully!</h2>");
        out.println("<p>Roll No: " + rollno + "</p>");
        out.println("<p>Name: " + name + "</p>");
    }
}