package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Servlet")//mismo nombre que la clase
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset-UTF-8");
        PrintWriter out = response.getWriter();//para mostrar en el navegador
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        String tecnologias[] = request.getParameterValues("tecnologia");
        String genero = request.getParameter("genero");
        String ocupacion = request.getParameter("ocupacion");
        String musica[] = request.getParameterValues("musica");
        String comentario = request.getParameter("comentarios");
        //generar codigo html dentro de java
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Resultado Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Parametros procesados por el Servlet:</h1>");
        out.println("<table border='1'>");

        out.println("<tr>");
        out.println("<td>");
        out.println("Usuario");//desplegar la etiqueta de usuario en la pagina
        out.println("</td>");
        out.println("<td>");//celda
        out.println(usuario);
        out.println("</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>");
        out.println("Password");//desplegar la etiqueta de usuario en la pagina
        out.println("</td>");
        out.println("<td>");//celda
        out.println(password);
        out.println("</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>");
        out.println("Tecnologias");//desplegar la etiqueta de usuario en la pagina
        out.println("</td>");
        out.println("<td>");//celda
        for (String tecnologia : tecnologias) {
            out.println(tecnologia);
            out.println(" / ");
        }
        out.println("</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>");
        out.println("Género");//desplegar la etiqueta de usuario en la pagina
        out.println("</td>");
        out.println("<td>");//celda
        out.println(genero);
        out.println("</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>");
        out.println("Ocupacion");//desplegar la etiqueta de usuario en la pagina
        out.println("</td>");
        out.println("<td>");//celda
        out.println(ocupacion);//se manda un id del lado del servidor
        out.println("</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>");
        out.println("Música favorita");//desplegar la etiqueta de usuario en la pagina
        out.println("</td>");
        out.println("<td>");//celda
        if (musica != null) {
            for (String m : musica) {
                out.println(m);
                out.println(" / ");
            }
        } else {
            out.println("música favorita no seleccionada");
        }
        out.println("</td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td>");
        out.println("Comentario");//desplegar la etiqueta de usuario en la pagina
        out.println("</td>");
        out.println("<td>");//celda
        out.println(comentario);//se manda un id del lado del servidor
        out.println("</td>");
        out.println("</tr>");

        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
        
        
    }
}
