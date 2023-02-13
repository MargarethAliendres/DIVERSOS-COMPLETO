
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.util.List"%>
<%@page import = "classe.Pessoa"%>
<%@page import = "daopersistencia.PessoaDao"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
        <script src="jQuery-1.11.2/"> </script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"> </script>
        <script src="bootstrap3.3.7/js/bootstrap.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/js/fontawesome.min.js"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/fontawesome.min.css">
        <link rel="stylesheet" href="bootstrap3.3.7/css/bootstrap.min.css">
        
    </head>
    <body>
        <div class="container">
            <form id="pessoa" action="ReceberDadosPessoa.jsp" method="POST">     <!-- recebe a entrada de dados no formulario-->
                <h3 class="text-center"> Cadastro de Pessoas</h3> 
                <p></p>
                <label id="msg" class="cabecalho">
                  <% 
                      String msgSucesso = request.getParameter("msgSucesso"); //escreve a mensagem configurado no receber dadoa no cadastro
                      String msgFalha = request.getParameter("msgFalha"); //escreve a mensagem configurado no receber dadoa no cadastro
                   %>
                    <span style="color: blue"><%=(msgSucesso != null? msgSucesso: "")%> <br /></span>
                    <span style="color: red"><%=(msgFalha != null? msgFalha: "")%> <br /></span>
                </label>
                    <!-- NOME-->
                    <fieldset>
                       <label> Nome </label>
                         <div class="nomepessoa">
                       <input type="text" id=nomepessoa name="nomepessoa" placehoder="informe o nome" required maxlength="40">
                       </div>
                    </fieldset>
                    
                    <fieldset >
                          <label> Email </label>
                        <div class="email">
                            <input type="email" id=email name="email" placehoder="informe o email" required maxlength="50">
                        </div>
                    </fieldset> <br>
                    
                    <div>            <!-- tamanho da mesclagem do botao-->
                        <div class="form-group col-md-3 h-10">                    
                            <input type="submit" value="Cadastrar" class="btn btn-primary" onclick="EnviarForm()" />  <!--botao de eviar cadastro-->
                        </div> 
                                      <!--tamanho da mesclagem do botao-->
                        <div class="form-group col-md-3 h-10">              
                            <input type="reset" value="Cancelar" class="btn btn-danger" />    <!-- botao de cadastrar-->
                        </div> 
                    </div>
            </form>    
        </div>  
        
    </body>
</html>
