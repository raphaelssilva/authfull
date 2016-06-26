<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<%@ taglib prefix="h" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="nested" uri="http://struts.apache.org/tags-nested"%>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>

<p><a href="/user/new">Novo Usuario</a></p>
	<table>
		<tr>
			<td>ID
			<td />
			<td>Login
			<td />
			<td>Email
			<td />
			<td>Editar
			<td />
			<td>Excluir
			<td />
		<tr />
		<c:forEach var="usuario" items="${listUsuario}">
		<tr>
			<td>${usuario.id}
			<td />
			<td>${usuario.login}
			<td />
			<td>${usuario.email}
			<td />
			<td><a href="/user/edit?id=${usuario.id}">Editar</a>
			<td />
			<td><a href="/user/delete?id=${usuario.id}">Excluir</a>
			<td />
		<tr />
		</c:forEach>

	</table>
