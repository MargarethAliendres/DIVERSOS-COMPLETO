<%@page import = "classe.Pessoa"%>
<%@page import = "daopersistencia.PessoaDao"%>
<%
    int idpessoa = Integer.parseInt(request.getParameter("idpessoa"));
    
    Pessoa pess =  new Pessoa();
    
    PessoaDao pess2 = new PessoaDao();
    
    pess.setIdpessoa(idpessoa);
    
             if(pess2.excluirPessoa(pess)){
                  response.sendRedirect("ConsultarPessoa.jsp?pmensagem=Pessoa excluida com sucesso");
           } else {
                 response.sendRedirect("ConsultarPessoa.jsp?pmensagem=Problemas excluir Pessoa");
    }
  
   
%>