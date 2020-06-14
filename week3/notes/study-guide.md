# Study Guide (Overall Concepts)

For each topic, I suggest you be able to answer these overall questions:
  Tell me about your experience with X.
  What is X?
  How does X work?

Additionally, be able to follow up with more detail as needed.
As well as examples for them.

I also suggest reviewing the "How to do well in QC" document that was shared and pinned in the slack workspace (general channel).

## Topics (REST & Servlets)
- Web Services
- Service Oriented Architecture (SOA)
- HTTP: HyperText Transfer Protocol
  - Contents of HTTP Request/Response
  - Idempotent & Safe Operations
  - Status Codes
    - 1XX Series: Informational
    - 2XX Series: Success
    - 3XX: Redirections
    - 4XX: Client-Side Errors
    - 5XX: Server-Side Errors
- REST: REpresentational State Transfer
  - Can use XML or JSON (JSON more popular)
  - Represent our data as a collection of resources
  - Each resource has a unique endpoint
  - Adheres to the meaning behind the HTTP verbs/methods and status codes
  - 6 Traits/Characteristics/Properties of REST
    - Cachable
    - Stateless
    - Client-Server Relationship
    - Layered Architecture
    - Uniform Interface
    - Provide Code on Demand (optional)
  - Richardson Maturity Model (Which defines steps for becoming more RESTful)
    - Similar to the idea of Normalization
  - HATEOAS: HyperMedia As The Engine Of Application State
    - Ties into the idea of Client-Server Relationship & Uniform Interface
- Servlets
  - Servlet Heirarchy
    1. Servlet Interface
    2. GenericServlet Abstract Class
    3. HttpServlet Abstract Class
    4. CustomServlet (The one we create)
  - FrontController Design Pattern
    - Only make 1 or a few Servlets, and switch on the URI (or portions of the URI)
  - MVC Design Pattern (Model - View - Controller)
    - In our specific examples, we didn't have a View, but it would be html and css
    - Model is the data the we pass back and forth
      - Used to populate the View if applicable
    - Controller is what has all of the logic
  - Container & LifeCycle
    - Tomcat is Web Container
    1. HTTP Request sent to Server
    2. Tomcat creates a flat file (no file extension) for HTTP response & creates Java objects for Request & Response
    3. Tomcat (Web Container) consults Deployment Descriptor (web.xml)
    4. Delegates Request & Response objects to a particular Servlet
      1. If Servlet is not instantiated, the init() method is called
      2. The service() is called to process the response
      3. If a long time passes without the Servlet being used, the destroy() method is called
    5. Servlet hands response back to Tomcat
    6. Tomcat populates HTTP response flat file with information from object
    7. Tomcat sends the response back
  - Servlet Config vs Context
  - Redirection with forward() vs sendRedirect()
    - forward() is on RequestDispatcher, which originates from request
    - sendRedirect() is on response
      - Creates a new HTTP Request
    - Forward/sendRedirect to either other servlets, or static web pages
  - Session Management
    - HttpSession
      - choose whether or not to create a new session
      - End session with invalidate() method
  - Handling Data
    - Use getParameter() method to retrieve query parameters or information from a form
    - Use getReader() to read from the body of the request
    - Use getWriter() to write to the body of the response
    - Path parameters are part of the URI, and must be manually parsed
  - Jackson-Databind ObjectMapper
    - How it works
    - readValue()
    - writeValueAsString()
