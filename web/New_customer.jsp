<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
   <c:import url="includes/header.html" />
        <div id="shell"><br>
            Please enter the following information, all fields are required.<br>
            <br>
            <p><i>${message}</i></p>
            <br>
            <form action="NewCustomerServlet" method="post">
            First name: <input type="text" name="FirstName" value="${user.firstName}"><br>
            Last name: <input type="text" name="LastName" value="${user.lastName}"><br>
            Phone number: <input type="text" name="Phone" value="${user.phone}"><br>
            Address: <input type="text" name="Address" value="${user.address}"><br>
            City: <input type="text" name="City" value="${user.city}"><br>
            State: <input type="text" name="State" value="${user.state}"><br>
            Zipcode: <input type="text" name="Zipcode" value="${user.zipcode}"><br>
            Email: <input type="text" name="Email" value="${user.email}"><br>
            <input type="submit" value="Submit">
            </form>
            <br>&nbsp;
        </div>
<c:import url="includes/footer.jsp" />
