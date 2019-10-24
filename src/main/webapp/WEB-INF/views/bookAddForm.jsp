<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Dodawanie książek</title>
    <link rel="stylesheet" href="WEB-INF/css/styles.css">
   <style>
        ul {
            color: brown;
        }

        th, pierwszy {
            background-color: gray;
        }

        td {
            border: 1px solid black;
        }

        .titleAuthor {
            width: 250px;
        }

        .LP {
            width: 25px;
        }

        table {
            border-collapse: collapse;
        }
    </style>
</head>
<body>
<span class="dodawane"><h2>Dodawanie książki</h2></span>
<div class="dodawane">
    <form method="post" action="/MyOwn/getBook">
        <input type="text" name="title" placeholder="Tytuł książki">
        <input type="text" name="firstName" placeholder="Imię autora">
        <input type="text" name="lastName" placeholder="Nazwisko autora">
        <input type="submit" value="Wyślij">
    </form>
</div>

<span class="zapisane">Książki już zapisane</span>
<div class="zapisane">

    <table>
    <th>
        <tr>
            <td class="LP">LP</td>
            <td class="titleAuthor">Tytuł</td>
            <td class="titleAuthor">Autor</td>
        </tr>
    </th>
    <tbody>
        <c:forEach var="book" items="${books}" varStatus="lp">
            <tr>
                <td class="pierwszy, LP">${lp.index+1}</td>
                <td class="titleAuthor">${book.getTitle()}</td>
                <td class="titleAuthor">${book.getAuthor().getFirstName()} ${book.getAuthor().getLastName()}</td>
            </tr>
        </c:forEach>
    </tbody>


    </table>

</div>
<script src="WEB-INF/js/alert.js"/>
</body>
</html>