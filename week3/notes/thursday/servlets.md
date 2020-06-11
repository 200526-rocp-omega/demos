# Servlets

## Front Controller
Front Controller is a Design Pattern for Servlets where you have only
a *single* Servlet class. This Single servlet will be responsible for
handling ALL HTTP requests. And it delegates processing to what is often
referred to as a "Controller".

Individual Controllers are generally responsible for a single domain/category
such as Users or Accounts, etc.

For example, all requests that go to the Front Controller that start with
/users, will be delegated to the User Controller.

Sometimes a few Servlet classes might be acceptable, but 1 Servlet is definitely
the most common.
