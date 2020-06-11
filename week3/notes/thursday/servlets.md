# Servlets

## Front Controller
Front Controller is a Design Pattern for Servlets where you have only
a *single* Servlet class. This Single servlet will be responsible for
handling ALL HTTP requests. And it delegates processing to other classes that
are often referred to as "Controllers".

Individual Controllers are generally responsible for a single domain/category
such as Users or Accounts, etc.

For example, all requests that go to the Front Controller that start with
/users, will be delegated to the User Controller.

Sometimes a few Servlet classes might be acceptable, but 1 Servlet is definitely
the most common.

## MVC = Model - View - Controller

This is another rather common Design Pattern. The View is applicable if
you have webpages/websites, which won't won't apply in our specific
use case.

The idea is the Model is the data that is being passed around.

The View would be anything that contributes to what the end user sees.
Ex: HTML, CSS, etc.

Controller is the logic the governs the model information being
moved around and how it populates the view. As well as any behind
the scenes processing that is required.

This overall design is rather abstract, and it is that way so that
it can be widely applied.

This overarching structure, despite its simplicity is still quite
helpful in terms of organization.

## Servlet Config/Context
Configuration for Servlets. They are structured as key-value pairs essentially.

- Servlet Config
  - Individual configuration for a single Servlet
- Servlet Context
  - Shared configuration for ALL Servlets

There are tags you can use in the web.xml file to add key-value pairs
to either the Servlet Config or the Servlet Context.

## Redirection

If we did have views for our application, we can handle routing
between pages in a few ways.
We could allow the webpages themselves to handle it. Either through hyperlinks
or through JavaScript.
Alternatively, we could handle routing on our Server.
This scenario is where the 3XX Series Status codes come in.

Redirection can be handled with a call to the forward() method
or to the sendRedirect() method.

The forward() method is unnoticed by the browser/webpage.
forward() is server-side
The sendRedirect() method *is* noticed by the browser/webpage.
sendRedirect() is client-side

The forward() method basically transfers the HTTPRequest to a different
location to be handled. Generally, this is only possible if it is
being transferred somewhere else on the *same* server.

Otherwise, if the Request needs to go to some external location, we rely on
sendRedirect().

SendRedirect() will send a HTTPResponse of a 3XX status code, and triggers
*another* request to the specified external location.

forward() is a method on the RequestDispatcher class, which is obtained from the request
Ex: req.getRequestDispatcher().forward(params);

sendRedirect() is a method on the HttpServletResponse
Ex: res.sendRedirect(params);

## Handling form data from a webpage

When reading from the *body* of a request, we used the
getReader() method in order to process the body.

Form data from a webpage sent as a GET request
are stored in the query parameters.
(the data in the url after the ? mark)

These are accessible through the getParameter() method.
