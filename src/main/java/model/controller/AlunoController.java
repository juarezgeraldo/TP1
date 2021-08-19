package model.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.domain.Aluno;

public class AlunoController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private final List<Aluno> alunos;

	public AlunoController() {
		super();
		alunos = new ArrayList<>();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("home.html").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		Aluno aluno = new Aluno(req.getParameter("nome"), req.getParameter("email"), req.getParameter("senha"));

        alunos.add(aluno);

        PrintWriter out = resp.getWriter();
        
        out.println(
                "<!DOCTYPE html>\r\n" +
                "<html>\r\n" +
                    "<head>\r\n" +
                        "<meta charset=\"ISO-8859-1\">\r\n" +
                        "<title>TP1 - Confirma!!!</title>\r\n" +
                        "<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n" +
                    "</head>\r\n" +
                    "<body>	\r\n" +
                        "<div class=\"container\">\r\n" +
                            "<h2 >Aluno cadastrado com sucesso!!!</h2>\r\n" +
                            "<h3 >Nome: "+ aluno.getNome() + "</h3>\r\n" +
                            "<h3 >Email: "+ aluno.getEmail() + "</h3>\r\n" + "</br> </br>" +
                            "<h4>Quantidade de alunos cadastrados: "+ alunos.size() +"</h4>\r\n" +
                            "<h4><a href='aluno'>Voltar</a></h4>\r\n" +
                        "</div>\r\n" +
                    "</body>\r\n" +
                "</html>"
        );


	
	}
}
