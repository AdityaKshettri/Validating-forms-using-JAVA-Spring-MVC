<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Student Confirmation Page</title>
    </head>
    <body>
        The student is Confirmed : ${student.firstName} ${student.lastName}
        <br>
        <br>
        Student Country : ${student.country}
        <br>
        <br>
        Student Favourite Language : ${student.favouriteLanguage}
        <br>
        <br>
        Operating System:
        <ul>
            <c:forEach var="temp" items="${student.operatingSystems}">
                <li>${temp}</li>
            </c:forEach>
        </ul>
    </body>
</html>
