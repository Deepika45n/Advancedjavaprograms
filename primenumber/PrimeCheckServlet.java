/*Build a servlet program to check the given number is prime number or not using HTML with step
by step procedure.*/
package example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/checkPrime")
public class PrimeCheckServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int num = Integer.parseInt(request.getParameter("number"));
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        out.println("<html><body>");
        out.println("<h2>Result</h2>");
        out.println("<p>Number: " + num + "</p>");
        if (isPrime) {
            out.println("<p><strong>" + num + " is a Prime Number.</strong></p>");
        } else {
            out.println("<p><strong>" + num + " is NOT a Prime Number.</strong></p>");
        }
        out.println("<br><a href='index.html'>Check another number</a>");
        out.println("</body></html>");
    }
}
