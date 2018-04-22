<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
   <c:import url="includes/header.html" />
   
   ${sessionScope.user}
   
        <div id="shell"><br>
            Account created successfully. <br>
            <br>
            ${user.firstName} ${user.lastName}<br>
            ${user.phone}<br>
            ${user.email}<br>
            ${user.adress}<br>
            ${user.city}, ${user.state}, ${user.zipcode}<br>
            <br>
            Username: ${user.username}<br>
            Password: ${user.password}
            
            <a href="login.html">Return to login page.</a>
            <br>&nbsp;
        </div>
<c:import url="includes/footer.jsp" />