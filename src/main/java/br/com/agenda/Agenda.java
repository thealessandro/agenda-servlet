package br.com.agenda;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/agenda")
public class Agenda extends HttpServlet {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public Agenda() {
        logger.info("Construindo a servlet: {}", this);
    }

    @Override
    public void init() throws ServletException {
        super.init();
        logger.info("Inicializando a servlet: {}", this);
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        super.service(req, res);
        logger.info("Protocolo: {}", req.getProtocol());
        logger.info("HTTP Method: {}", ((HttpServletRequest) req).getMethod());
        logger.info("Request URI: {}", ((HttpServletRequest) req).getRequestURI());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<html></body>");
        out.println("<h2>Agenda</h2>");
        out.println("<br/>");
        out.println("<a href=\"/index.html\">Voltar</a>");
        out.println("</body></html>");
        out.flush();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    public void destroy() {
        super.destroy();
        logger.info("Destruindo a servlet: {} ", this);
    }

    @Override
    public String toString() {
        return "Agenda";
    }
}
