
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Users</title>
    </head>
    <body>
        <div>
        <h2>Add User</h2>
        <form action="User" method="Post">
            <input type="text" name="email" placeholder="Email">
            <br>
            <input type="text" name="FirstName" placeholder="First Name">
            <br>
            <input type="text" name="LastName" placeholder="Last Name">
            <br>
            <input type="text" name="Password" placeholder="Password">
            <br>
            <select name="role">
                <c:forEach items="${roles}" var="role">
                <option value="${role.roleNumber}">${role.roleName}</option>
                </c:forEach>
                        </select>
            <input type="hidden" name="action" value="create">
            <br>
            <input type="submit" value="Create">
        </form>
         </div>
        <div>
            <h2>Manage Users</h2>
            <table>
            <tr>
                <th><b>Email</b></th>
                <th><b>First Name</b></th>
                <th><b>Last Name</b></th>
                <th><b>Role</b></th>
                <th><b>Edit</b></th>
                <th><b>Delete</b></th>
            </tr>
            <c:forEach items="${users}" var="user">
                <tr>
                <td>${user.getEmail()}</td>
                <td>${user.firstName}</td>
                <td>${user.lastName}</td>
                <td>${user.role}</td>
                <td><input type="button" value="edit"></td>
                <td><input type="button" value="delete"></td>
                </tr>
            </c:forEach>
                </table>
        </div>
        <div>
            <h2>Edit User</h2>
            <form>
            <input type="text" name="firstname" placeholder="First Name">
            <br>
            <input type="text" name="lastname" placeholder="Last Name">
            <br>
            <input type="text" name="password" placeholder="Password">
            <br>
           <select name="role">
                <c:forEach items="${roles}" var="role">
                <option value="${role.roleNumber}">${role.roleName}</option>
                </c:forEach>
                        </select>
            <input type="hidden" name="action" value="edit">
            <br>
            <input type="submit" name="Create">
            </form>
        </div>
    </body>
</html>
