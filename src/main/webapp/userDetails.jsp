<jsp:include page="header.jsp" />
<div class="container">
  <div class="row align-items-start">
    <div class="card">
      <div class="card-header">
        User Detail Form
      </div>
      <div class="card-body">
        <div class="col">
          <form class="row g-3 needs-validation" action="CreateNewUser" method="GET" novalidate>
            <div class="col-md-4">
              <label for="firstName" class="form-label">First name</label>
              <input type="text" class="form-control" id="firstName" name="firstName" required>
              <div class="valid-feedback">
                Looks good!
              </div>
            </div>
            <div class="col-md-4">
              <label for="lastName" class="form-label">Last name</label>
              <input type="text" class="form-control" id="lastName" name="lastName" required>
              <div class="valid-feedback">
                Looks good!
              </div>
            </div>
            <div class="col-md-4">
              <label for="phone number" class="form-label">Phone number</label>
              <div class="input-group has-validation">
                <span class="input-group-text" id="inputGroupPrepend"></span>
                <input type="text" class="form-control" id="phoneNumber" name="phoneNumber"
                  aria-describedby="inputGroupPrepend" required>
                <div class="invalid-feedback">
                  Please choose a username.
                </div>
              </div>
            </div>
            <div class="col-md-6">
              <label for="Email" class="form-label">Email</label>
              <input type="text" class="form-control" id="email" name="email" required>
              <div class="invalid-feedback">
                Please provide a valid city.
              </div>
            </div>
            <div class="col-md-3">
              <label for="Role" class="form-label">Role</label>
              <select class="form-select" id="role" name="role" required>
                <option selected disabled value="">choose</option>
                <option value="1">Admin</option>
                <option value="2">Princile</option>
                <option value="3">Teacher</option>
                <option value="4">Officer</option>

              </select>
              <div class="invalid-feedback">
                Please select a valid state.
              </div>
            </div>
            <div class="col-md-3">
              <label for="password" class="form-label">Password</label>
              <input type="password" class="form-control" id="password" name="password" required>
              <div class="invalid-feedback">
                Please provide a valid zip.
              </div>
            </div>
            
            <div class="col-12">
              <button class="btn btn-primary" type="submit">Create Accounnt</button>
            </div>
          </form>
        </div>
      </div>
    </div>


  </div>

</div>
<jsp:include page="footer.jsp" />