## PWD = /home/luser/Ct43/abdul2/ServletPrograms

Server is a machine or application capable of handling request and response 
We are using apache tomcat to handle the request and response 

## Definations:

1) Servlet is an interface which has all the life cycle methods of a servlet
2) The child class of HttpServlet is also known as a servlet
3) Servlet is a helping technology recived by the server . All servlet are child class of HttpServlet


## Step to make a servlet
1] Make a class
2] Extend HttpServlet
3] Make doGet and doPost methods
4] Depending upon where the request is mapped write the code to make dynamic page in doGet or doPost
 	
 	NOTE: by default once a request is mapped always the doGet method is called by server
 	
------------------------------------------------------------------------------------------------------------------

## PrintWritter is a predefined class used to print any data on file or also webpages
to print on web pages we create the object response.getWritter method

To fetch information from input tag if form we call request.getParameter() method
	NOTE: we pass the name of input Tag in the getParameter
	
	.getParameter will always return String object.
	

------------------------------------------------------------------------------------------------------------------

## Difference between doGet and doPost

1] All information given by user in form is attached in url when form is submitted when doGet is called.
   But When doPost is called information is not attached to url.

2] doGet is usally called to get information from Servlet
   doPost is usually used to send information form page to servlet

3] doGet provides less security
   doPost provides better security
   
------------------------------------------------------------------------------------------------------------------

## Servlet Life Cycle

At the beginning all the servlet Classes are loaded the an instance is created for each servlet
In the next strp init method is called this is the first life cycle method of servlet
This method was forst created in servlet interface this method creates the object of all the servlets which hav been loaded

Simultaneously ServletRequest and ServletResponse opbject are created these objects are converted to
HttpServletRequest and HttpServletResponse in the public service method

After makin HttpServletRequest and HttpServletResponse object protected service method is called 

The protected service method will then internally call the doGet() or doPOst() method depending upon which method 
had been requested from the page

Once the entire doGet / doPost is executed the HttpServletRequest and Response object are deleted

At last whent the project is terminated the destroy method is called which deltes all the servlet objects

NOTE: 

init() is called only once in the entire life cycle at the very beginning

service() is called everytime a new request is made from page

destroy() is called only once at the end of the life cycle.




------------------------------------------------------------------------------------------------------------------


1] response.sendRedirect () -> with this method we can go from one servlet to anpoter . we pass the webservlet annotation of
	the second servlet int the send Redirect Method
	This method will always send a new request to the second servlet hence any information which was stored from the 
	page in the request of first servlet will not be recived in the of second servlet.
	
	
2] forward() and include() of RequestDispatcher

- forward and include () s also used to move from one servlet to another With this we are sending the same req and response object to the second servlet hence any data which the reques object recived from page will also be seen int	the second servlet

	
	
### Difference sendRedirect and for/inc
	
	a] sendredirect uses a new request to go to the next servlet
		forward/include uses the same request to go to next servlet
		
	b] sendRedirect will always reach the doGet methos of second servlet
		f/i can go to doGet as well as to doPost
		
	c] In our application if we want to make a fresh request and give the look of reaching a fresh
		page to use the we use sendRedirect.
		
		If in case we want to give a look of staying in the same page/location even if 
		internally we have changed servlet the we can use forward/ include
		
	d] sendRedirect is a method of response object
		f/i are methods of RequestDispatcher
		
	Difference forward and include
	
	a] forward() will be able to show output of only the second servlet.
	include() will include the output of first servlet and second servlet on the same page
	

------------------------------------------------------------------------------------------------------------------

# SESSION MANAGEMENT


### 1] Url Rewritting
- We can continously maintain data by adding it on the url in name vale pair 
    
Eg: response.sendRedirect("Servlet2?student=Abdul");
    In this example the data is added in name value pair where name is student and its value is Ashish.

### 2] HttpSession

- It can be used to store data This data will be available for the entire application until this session object is forcefully deleted.
- All thru the application in any servlet if we make the session object by using request.getSession() then the Server will give the same session object
- Hence if we once store any data in session object , then this same object is returned in all servlets and so the data is available for all servlet.
 

### 3] Cookies

- Cookies class object can also be used to store data when moving from one servlet to another servlet or page.
- Cookies are stored in browser memory hence we are giving the priorty to client and the client will be able to delete the cookies ar the browser end.
- For this reason we do not use Cookies to store important data.
- Session object is safer for storing important data because it is maintained at server end 

### 4] Hidden Form

- Hidden forn tags are used to maintain the data about the page.
- Many a times we will reach the same doGet/doPost method from the page that we need to recognize the page from which the request has come and make the output accordingly
- This is done very easily with the help of hidden tag just change the value page in which you are. 


------------------------------------------------------------------------------------------------------------------

## Data in XML File

- We can store data in the XML file also
- To store data which can be accessed by only one servlet we use <init-param> tag.
- This tag is made inside the servlet tag.
- This info will be seen by only the servlet whos servlet tag we have used.

- In order to fetch data from init-param tage we use ServletConfig object.
- ServletConfig object can be made by : getServletConfig() directly or by using init() which has ServletConfig object in its parameter


- To store data which can be accessed by all servlet we use <context-param> tag
- This tag is made directly in the web.xml file

- In order to fetch data from the <context-param> tag we use ServeltContext Object.
- ServletContext object can be made by :
-- ServletContext context = getServletContext();
-- ServletContext context = request.getServletContext();
-- ServletContext context = session.getServletContext();

- Both ServletConfig and ServletContext are interface and we are using their implemented objects in above example. 














