<%@page import = "classe.Pessoa" %>
<%@page import = "daopersistencia.PessoaDao" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    //receber os valores da tela HTML//int
    //aqui que captura os dados cadastrados/informados na tela.
 
int vidpessoa = Integer.parseInt(request.getParameter("idpessoa"));
String vnomepessoa = request.getParameter("nomepessoa");
String vemail= request.getParameter("email");    


          Pessoa pessoa = new Pessoa();
          
          PessoaDao pesDAO = new PessoaDao();
          pessoa.setIdpessoa(vidpessoa);
          pessoa.setNomepessoa(vnomepessoa);
          pessoa.setEmail(vemail);
          
          
            if (pesDAO.alterarPessoa(pessoa)){        // quando terminar ele redireciona para consultar pessoa
             response.sendRedirect( "ConsultarPessoa.jsp?pmensagem=Pessoa alterada com sucesso com sucesso");
            } else {
             response.sendRedirect( "ConsultarPessoa.jsp?pmensagem=Problemas ao salvar Pessoa");
        
                  }
  
%>