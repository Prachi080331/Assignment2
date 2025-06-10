<!DOCTYPE html>
<html>
<head>
    <title>Secure Registration Page</title>
</head>
<body>
    <h2>Secure Registration (PreparedStatement Example)</h2>
    <form action="<%=request.getContextPath()%>/SignupServlet" method="post">
        <table>
            <tr><td>Username:</td><td><input type="text" name="username" required></td></tr>
            <tr><td>Email:</td><td><input type="email" name="userEmail" required></td></tr>
            <tr><td>Password:</td><td><input type="password" name="password" required></td></tr>
            <tr><td>Preferred Name:</td><td><input type="text" name="preferredName"></td></tr>
            <tr><td>Name:</td><td><input type="text" name="name"></td></tr>
            <tr><td colspan="2"><input type="submit" value="Register"></td></tr>
        </table>
    </form>
</body>
</html>
