<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">



<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <!-- <h1>hello world</h1> -->

   
    <div>
        <form method="POST" action="/feujiCompany/company1" modelAttribute="feujiSolutions">
            <table>
                <tr>
                    <td>Name</td>
                    <td><input type="text" path="companyName" name="companyName"></input></td>
                </tr>
                <tr>
                    <td>Employee Count</td>
                    <td><input type="text" path="countOfEmployees" name="countOfEmployees"></input> </td>
                </tr>
                <tr>
                    <td>Location</td>
                    <td><input type="text" path="location" name="location"></input> </td>
                </tr>
                <tr>
                    <td><input type="submit" value="Save"> </td>
                </tr>
            </table>
        </form>
    </div>

</body>
</html>