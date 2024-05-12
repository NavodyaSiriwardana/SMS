<jsp:include page="header.jsp" />
<!-- Define jstl  core -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

  <!-- Import contact java class -->
  <%@ page import="java.util.*, com.sms.dto.BasicUserDetailDTO" %>

    <div class="container">
      <div class="row align-items-start">
        <div class="card">
          <div class="card-header">
            List Of Users
          </div>
          <div class="card-body">

            <div class="row p-4 ">
              <a  href="userDetails.jsp" class="btn btn-success col-4">Add new</a>
            </div>
          
            <table class="table table-hover" style="width:100%;">
              <tr>
                <th scope="col">#</th>
                <th scope="col">First Name</th>
                <th scope="col">Last Name</th>
                <th scope="col">Email</th>
                <th scope="col">Phone Number</th>
                <th scope="col">Role Number</th>
                <th scope="col"></th>

              </tr>
              <c:forEach var="rowUser" items="${listOfUsers}">
                <c:set var="id" value="${rowUser.id }"></c:set>
                <c:set var="firstName" value="${rowUser.firstName }"></c:set>
                <c:set var="lastName" value="${rowUser.lastName }"></c:set>
                <c:set var="email" value="${rowUser.email }"></c:set>
                <c:set var="phoneNumber" value="${rowUser.phoneNumber }"></c:set>
                <c:set var="roleName" value="${rowUser.roleName }"></c:set>
                <c:set var="roleId" value="${rowUser.roleId }"></c:set>
                <tr>
                  <c:url var="deleteUserLink" value="DeleteServlet">
                    <c:param name="id" value="${rowUser.id}"></c:param>
                  </c:url>
                  <td>${rowUser.id}</td>
                  <td>${rowUser.firstName}</td>
                  <td>${rowUser.lastName}</td>
                  <td>${rowUser.email}</td>
                  <td>${rowUser.phoneNumber}</td>
                  <td>${rowUser.roleName}</td>
                  <c:url value="updateUser.jsp" var="updateUserLink">
                    <c:param name="id" value="${rowUser.id}" />
                    <c:param name="firstName" value="${rowUser.firstName}" />
                    <c:param name="lastName" value="${rowUser.lastName}" />
                    <c:param name="email" value="${rowUser.email}" />
                    <c:param name="phoneNumber" value="${rowUser.phoneNumber}" />
                     <c:param name="roleId" value="${rowUser.roleId}" />
                  </c:url>
                  <td> <a href="${deleteUserLink}" class="btn btn-danger">Delete</a></td>
                  <td> <a href="${updateUserLink}" class="btn btn-info">Update</a></td>
                </tr>
              </c:forEach>
            </table>
          </div>
        </div>


      </div>

    </div>
    <jsp:include page="footer.jsp" />