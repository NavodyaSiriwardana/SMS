<jsp:include page="header.jsp" />
<!-- Define jstl  core -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

  <!-- Import contact java class -->
  <%@ page import="java.util.*, com.sms.dto.BasicUserDetailDTO" %>
  
   <%
 		String id = request.getParameter("id");
 		String firstName = request.getParameter("firstName");
 		String lastName = request.getParameter("lastName");
 		String email = request.getParameter("email");
 		String phoneNumber = request.getParameter("phoneNumber");
 		String roleId = request.getParameter("roleId");	
  %>
  
<div class="container">
  <div class="row align-items-start">
    <div class="card">
      <div class="card-header">
        Update <%= firstName %> <%= lastName %> Details
      </div>
      <div class="card-body">
        <div class="col">
          <form class="row g-3 needs-validation" action="UserUpdateServlet" method="GET" novalidate>
            <div class="col-md-4">
              <input type="hidden" class="form-control" id="id" name="id" value="<%= id %>">
              <label for="firstName" class="form-label">First name</label>
              <input type="text" class="form-control" id="firstName" name="firstName" value="<%= firstName %>" required>
              <div class="valid-feedback">
                Looks good!
              </div>
            </div>
            <div class="col-md-4">
              <label for="lastName" class="form-label">Last name</label>
              <input type="text" class="form-control" id="lastName" name="lastName" value="<%= lastName %>" required>
              <div class="valid-feedback">
                Looks good!
              </div>
            </div>
            <div class="col-md-4">
              <label for="phone number" class="form-label">Phone number</label>
              <div class="input-group has-validation">
                <span class="input-group-text" id="inputGroupPrepend"></span>
                <input type="text" class="form-control" id="phoneNumber" name="phoneNumber" value="<%= phoneNumber %>" 
                  aria-describedby="inputGroupPrepend" required>
                <div class="invalid-feedback">
                  Please choose a username.
                </div>
              </div>
            </div>
            <div class="col-md-6">
              <label for="Email" class="form-label">Email</label>
              <input type="text" class="form-control" id="email" name="email" value="<%= email %>"  required>
              <div class="invalid-feedback">
                Please provide a valid city.
              </div>
            </div>
          
            <div class="col-12">
              <button class="btn btn-primary" type="submit">Update User</button>
            </div>
          </form>
        </div>
      </div>
    </div>


  </div>

</div>
<jsp:include page="footer.jsp" />