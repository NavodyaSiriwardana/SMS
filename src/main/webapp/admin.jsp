<jsp:include page="header.jsp" />
<!-- Define jstl  core -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

  <!-- Import contact java class -->
  <%@ page import="java.util.*, com.sms.dto.BasicUserDetailDTO" %>

    <div class="container">
      <div class="row align-items-start">
        <div class="card">
          <div class="card-header">
            Admin Home
          </div>
          <div class="card-body">

            <div class="row p-4">
              <div class="col-sm-6">
                <div class="card">
                  <div class="card-body">
                    <h5 class="card-title">User Managment - Add Users</h5>

                    <a href="userDetails.jsp" class="btn btn-primary">Add New User</a>
                  </div>
                </div>
              </div>
              <div class="col-sm-6">
                <div class="card">
                  <div class="card-body">
                    <h5 class="card-title">User Managment - User List</h5>

                    <a href="GetAllUsersServlet" class="btn btn-primary">User List</a>
                  </div>
                </div>
              </div>
            </div>

          </div>
        </div>


      </div>

    </div>
    <jsp:include page="footer.jsp" />