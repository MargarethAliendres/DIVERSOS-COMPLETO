<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.util.List"%>
<%@page import = "classe.Pessoa"%>
<%@page import = "daopersistencia.PessoaDao"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
        <script src="jQuery-1.11.2/"> </script>
        <script src="https://kit.fontawesome.com/f49d415fdb.js" crossorigin="anonymous"></script>
        <script src="bootstrap3.3.7/js/bootstrap.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/js/fontawesome.min.js"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/fontawesome.min.css">
        <link rel="stylesheet" href="bootstrap3.3.7/css/bootstrap.min.css">
      </head>  
  
    <body>
         <!--diferente do cadastrar, aqui tenho que instanciar a classe pessoaDao-->
        <%
           
            PessoaDao pes = new PessoaDao();
            List<Pessoa> listapessoas = pes.consultarPessoas();   //pego a lista de pessoas 
                       
        %>    
       
                <h4 class="text-center"> Consulta pessoas</h4> 
               
                <!--label para lançcar mensagens de feedback de atualiazação -->
                <label id="msg" class="cabecalho">
                  <% 
                    if(request.getParameter("pmensagem") !=null) {     //escreve a mensagem configurado no receber dadoa no cadastro
                        out.write(request.getParameter("pmensagem"));
                    } %>
                </label>
                     <table id="consulta" class="table">
                       <thead class="thead-dark">         <!-- cabeçalho da tabela-->
                            <th>Nome</th>
                            <th>email</th>
                            <th>Editar</th>
                            <th>Excluir</th>
                       </thead>
                       <tbody>           
                               <!--for echc    aqui  fazendo um for each-->  <!-- muito importante essa abertura de chave -->     
                         <% for(Pessoa pessoa : listapessoas) {%>     <!--conteudo que vai esta dentro da tabela abaixo-->
                         <tr>  <!-- linha-->
                             <td><% out.write(pessoa.getNomepessoa()); %></td>    <!-- coluna-->
                             <td><% out.write(pessoa.getEmail()); %></td>
                             
                             
                               <!-- botao editar-->
                             <td> <% out.write("<a href=EditarPessoa.jsp?idpessoa=" + "" + pessoa.getIdpessoa() + ">" + "<i class='fa-solid fa-file-pen' style='color:green'></i>" + "</a>");%></td> 
                             
                             
                             <td>     <!--botao excluir-->
                                 <button type="button" id="botaoexcluir" onclick="mostrarExclusao(<% out.write("" + pessoa.getIdpessoa());%>)"> <i class="fa-solid fa-trash" style="color:red"></i></button> 
                             </td>             
                         </tr>
                        <%}%>        <!-- muito importante esse fechamento de chaves do java-->         
                        </tbody>       
                       </table>
                     <!-- popup de confirmacao e exclusao-->
                    <div class='msg-popup'>
                        <h5 class="text-center" style="color: #ffffff; font-family: arial-bold"> EXCLUSAO </h5>
                        <h5 class="text-center" style="color: #ffffff;"> Confirma a <b>exclusão</b> do registro? </h5>
                        
                        <div class='text-center'>
                        <a href=""> <button class="btn btn-dark" clik="cancela()"> Nâo </button></a>  <!--funcao cancela-->
                        <a id="exclui" href="#"> <button class="btn btn-danger" id="excluir"> Sim </button></a>
                            
                        </div> 
                    </div>
                 
                    <script>
                        function cancela(){
                         document.getElementClassName('msg-popup')[0].style.display='none';
                        }
                      function mostrarExclusao(pessoa) {
                         document.getElementClassName('msg-popup')[0].style.display='block';
                            var link = document.getElementById('exclui');
                            link.href = "ReceberExcluirPessoa.jsp?idpessoa=" + pessoa;
                        }
                     </script>    
                  
         </body>       
    </html>