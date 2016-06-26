<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="html" uri="http://www.springframework.org/tags/form" %>

<html:errors >${error} </html:errors>
<html:form action="/user/save" commandName="usuario" >
	<html:hidden path="id"/>	
	<p>Nome:  <html:input path="nome" ></html:input></p>
	<p>Sobrenome:  <html:input path="sobrenome" ></html:input></p>
	<p>Email:  <html:input path="email" ></html:input></p>	
	<p>Login: <html:input path="login" ></html:input></p>
	<p>Senha: <html:password path="senha" ></html:password></p>
	<p>Pergunta Secreta:  <html:input path="perguntaSecreta" ></html:input></p>
	<p>Resposta Secreta:  <html:input path="respostaSecreta" ></html:input></p>
	<p>IsAtivo:  <html:checkbox path="isAtivo" ></html:checkbox></p>	
	
	<input type="submit" value="Enviar"/>
</html:form>
