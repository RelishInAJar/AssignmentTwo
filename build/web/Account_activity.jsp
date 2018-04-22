<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
   <c:import url="includes/header.html" />
        <div id="shell"><br>
            <c:if test="${not empty user}">Welcome ${User.firstName} ${User.lastName}</c:if>
            <c:if test="${empty user}">You're not logged in.</c:if>
            <br>&nbsp;
        </div>
<c:import url="includes/footer.jsp" />