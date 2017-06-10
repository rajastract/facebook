import javax.servlet.http.*;
import java.io.*;
public class LoginServlet extends Httpservlet{
	public void service(HttpServletRequest request,HttpservletResponse response){
	try{
		PrintWriter out=response.getWriter("Hello world");
	}catch(Exception e){
	e.printStacktrace();
	}
	}
}
