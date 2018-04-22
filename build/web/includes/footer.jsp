
<%@ page import="java.util.GregorianCalendar, java.util.Calendar" %>
<%
    GregorianCalendar currentDate = new GregorianCalendar();
    int currentYear = currentDate.get(Calendar.YEAR);
    %>
    <center><p>&copy; Copyright <%= currentYear %> TOBA</p></center>

</body>
</html>
