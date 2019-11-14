<%@ page import="com.f16.ftech.dto.*" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%
ClientesFtech dto[] = (ClientesFtech[]) request.getAttribute( "result" );
%>
<table class="bodyTable" border="1">
<tr>
	<td>idCliente</td>
	<td>numeroCc</td>
	<td>nome</td>
	<td>morada</td>
	<td>dataNascimento</td>
	<td>dataInsercao</td>
	<td>genero</td>
</tr>
<%
for (int i=0; i<dto.length; i++)
{
	ClientesFtech value = dto[i];
%>
<tr>
<td><a href="ClientesFtechFindByPrimaryKeyResults.do?idCliente=<%= value.getIdCliente() %>&crudMethod=view"><%= value.getIdCliente() %></a></td>
<td><%= value.getNumeroCc() %></td>
<td><%= value.getNome() %></td>
<td><%= value.getMorada() %></td>
<td><%= value.getDataNascimento() %></td>
<td><%= value.getDataInsercao() %></td>
<td><%= value.getGenero() %></td>
</tr>
<%
}
%>
</table>
