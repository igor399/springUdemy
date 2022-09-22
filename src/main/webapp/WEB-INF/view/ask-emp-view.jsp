<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>

<h2> Employee, pls enter your details</h2>
<br>
<br>
<form:form action="showDetails" modelAttribute="employee">
    Name <form:input path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <br><br>
    Salary <form:input path="salary"/>
    <br><br>
    Department <form:select path="department">
    <form:options items="${employee.departments}"/>
</form:select>
    <br><br>
    Witch car do you prefer:
    <form:radiobutton path="carBrand" value="BMW"/> BMW
    <form:radiobutton path="carBrand" value="MB"/> MB
    <form:radiobutton path="carBrand" value="Audi"/> Audi
    <br><br>
    <br> <input type="submit" value="OK">
</form:form>
</body>
</html>
