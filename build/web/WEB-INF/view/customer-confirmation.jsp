<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Customer Confirmation Page</title>
    </head>
    <body>
        The customer is confirmed: ${customer.firstName} ${customer.lastName}
        <br>
        Free Passes : ${customer.freePasses}
        <br>
        Postal Code : ${customer.postalCode}
        <br>
        Postal Code : ${customer.courseCode}
    </body>
</html>
