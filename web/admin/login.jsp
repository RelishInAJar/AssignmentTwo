<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
   <c:import url="includes/header.html" />
        <div id="shell"><br>
            <form action="j_security_check" method="post">
            Username: <input type="text" name="j_username"><br>
            Password: <input type="text" name="j_password"><br>
            <input type="submit" value="Login">
            </form>
            <br>&nbsp;
            <a href="password_reset.jsp">Forgot password.</a><br><br>
            Don't have an account? <a href="New_customer.jsp">Sign up here.</a> 
            
            <br>&nbsp;
        </div>
    </body>
</html>