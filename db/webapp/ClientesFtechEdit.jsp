<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<h1>ClientesFtech</h1>
<html:form action="ClientesFtechSave.do" >
<html:hidden property="crudMethod" />
<table class="bodyTable">
<tr>
<td>idCliente:</td>
<td><html:text property="idCliente" readonly="false"size="30" /></td>
</tr>
<tr>
<td>numeroCc:</td>
<td><html:text property="numeroCc" readonly="false"size="30" /></td>
</tr>
<tr>
<td>nome:</td>
<td><html:text property="nome" readonly="false"size="30" /></td>
</tr>
<tr>
<td>morada:</td>
<td><html:text property="morada" readonly="false"size="30" /></td>
</tr>
<tr>
<td>dataNascimento:</td>
<td><html:text property="dataNascimento" readonly="false"size="30" /></td>
</tr>
<tr>
<td>dataInsercao:</td>
<td><html:text property="dataInsercao" readonly="false"size="30" /></td>
</tr>
<tr>
<td>genero:</td>
<td><html:text property="genero" readonly="false"size="30" /></td>
</tr>
</table>
<html:submit/>
</html:form>
