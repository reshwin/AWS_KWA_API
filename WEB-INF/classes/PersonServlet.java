import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.json.JSONObject;
//javac -cp .;C:/OneDrive/Eugene/TomCat/apache-tomcat-9.0.82/lib/servlet-api.jar;../lib/java-json.jar PersonServlet.java
public class PersonServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		String requestUrl = request.getRequestURI();
		
		if(requestUrl.indexOf("/AWS_KWA_API/customer/")==-1){
			response.getOutputStream().println("{\"Invalid request\"}");
		}

		String name = requestUrl.substring("/AWS_KWA_API/customer/".length());
		
		Customer customer = DataStore.getInstance().getCustomer(name.toLowerCase());
		
		if(customer != null){
			String json = "{\n";
			json += "\"status\": OK,\n";
			json += "\"CONS_NO\": " + JSONObject.quote(customer.getCONS_NO()) + ",\n";
			json += "\"AREA_CODE\": " + JSONObject.quote(customer.getAREA_CODE()) + ",\n";
			json += "\"CAT_CODE\": " + JSONObject.quote(customer.getCAT_CODE()) + "\n";
			json += "\"CONS_ID_NO\": " + JSONObject.quote(customer.getCONS_ID_NO()) + "\n";
			json += "\"CONS_NAME\": " + JSONObject.quote(customer.getCONS_NAME()) + "\n";
			json += "\"ADDRESS1\": " + JSONObject.quote(customer.getADDRESS1()) + "\n";
			json += "\"ADDRESS2\": " + JSONObject.quote(customer.getADDRESS2()) + "\n";
			json += "\"ADDRESS3\": " + JSONObject.quote(customer.getADDRESS3()) + "\n";
			json += "\"ADDRESS4\": " + JSONObject.quote(customer.getADDRESS4()) + "\n";
			json += "\"PHONE\": " + JSONObject.quote(customer.getPHONE()) + "\n";
			json += "\"ROUTE_CODE\": " + JSONObject.quote(customer.getROUTE_CODE()) + "\n";
			json += "\"METER_NO\": " + JSONObject.quote(customer.getMETER_NO()) + "\n";
			json += "\"METER_FIXATION_DATE\": " + JSONObject.quote(customer.getMETER_FIXATION_DATE()) + "\n";
			json += "\"METER_OWNER\": " + JSONObject.quote(customer.getMETER_OWNER()) + "\n";
			json += "\"METER_WORKING\": " + JSONObject.quote(customer.getMETER_WORKING()) + "\n";
			json += "\"SMART_METER_FLAG\": " + JSONObject.quote(customer.getSMART_METER_FLAG()) + "\n";
			json += "}";
			response.getOutputStream().println(json);
		}
		else{
			//That person wasn't found, so return an empty JSON object. We could also return an error.
			response.getOutputStream().println("{\"status\": Customer not found}");
		}
	}
	
	

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		String name = request.getParameter("name");
		String about = request.getParameter("about");
		int birthYear = Integer.parseInt(request.getParameter("birthYear"));
		
		DataStore.getInstance().putCustomer(new Customer("","","","","","","","","","","","","","","",""));
	}
}