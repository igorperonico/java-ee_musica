<%@ page import="java.util.ArrayList"%>


<c:forEach items="${cantores}" var="cantor">

    <p><c:out value="${cantor.nome}"/></p>
    <p><c:out value="${cantor.estiloMusical}"/></p>
    <p><c:out value="${cantor.qtdAlbuns}"/></p>
</c:forEach>

<c:forEach items="${musicas}" var="musica">

    <p><c:out value="${musica.nome}"/></p>
    <p><c:out value="${musica.estiloMusical}"/></p>
    <p><c:out value="${musica.compositor}"/></p>
    <p><c:out value="${musica.anoDeLancamento}"/></p>
</c:forEach>


<html>
<body>
<%@ include file="header.jsp"  %>
<h2>Hello World! <%= cantores.get(1)%></h2>
<ul>

    <%
        for(String cantor : cantores){
            out.println("<li>"+cantor+"</li>");
        }
    %>



</ul>

<ul>
    <%
        for(String musica : musicas){
            out.println("<li>"+musica+"</li>");
        }
    %>
</ul>

</body>
</html>
