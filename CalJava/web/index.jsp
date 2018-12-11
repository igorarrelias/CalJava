
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Calculadora</title>
    <link rel="stylesheet" type="text/css" href="css/main.css">
</head>
<body>
<div id="quadrado">
    <h1>Calculadora</h1>
    <hr>
    <form action="calcular" method="post">
        <div class="input">
            <label>Número 1:</label><input id="n1" type="text" name="n1" >
        </div>
        <div class="input">
            <label>Número 2:</label><input id="n2" type="text" name="n2">
        </div>
        <div id="botao">
            <input type="submit" class="button" id="somar" name="op" value="+"></input>
            <input type="submit" class="button" id="subtrair" name="op" value="-"></input>
            <input type="submit" class="button" id="dividir" name="op" value="/"></input>
            <input type="submit" class="button" id="multiplicar" name="op" value="*"></input>
        </div>
        <div id="resultado">
            Resultado: <% request.getAttribute("result");%>
        </div>
    </form>
</div>
</body>
</html>
