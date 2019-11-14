<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<h1>ClientesFtech</h1>
<table class="bodyTable">
<tr>
<td>idCliente:</td>
<td><bean:write name="ClientesFtech" property="idCliente" /></td>
</tr>
<tr>
<td>numeroCc:</td>
<td><bean:write name="ClientesFtech" property="numeroCc" /></td>
</tr>
<tr>
<td>nome:</td>
<td><bean:write name="ClientesFtech" property="nome" /></td>
</tr>
<tr>
<td>morada:</td>
<td><bean:write name="ClientesFtech" property="morada" /></td>
</tr>
<tr>
<td>dataNascimento:</td>
<td><bean:write name="ClientesFtech" property="dataNascimento" /></td>
</tr>
<tr>
<td>dataInsercao:</td>
<td><bean:write name="ClientesFtech" property="dataInsercao" /></td>
</tr>
<tr>
<td>genero:</td>
<td><bean:write name="ClientesFtech" property="genero" /></td>
</tr>
</table>
<html:form action="ClientesFtechFindByPrimaryKeyResults.do" >
<input type="hidden" name="crudMethod" value="update" />
<html:hidden property="idCliente" />
<input type="submit" value="Edit"/>
</html:form>
<hr>
<p>Delete</p>
<html:form action="ClientesFtechSave.do" >
<html:hidden property="crudMethod" value="delete" />
<html:submit value="Delete"/>
</html:form>
<hr>
