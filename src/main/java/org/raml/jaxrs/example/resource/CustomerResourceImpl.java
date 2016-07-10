package org.raml.jaxrs.example.resource;

import org.raml.jaxrs.example.model.Customer;
import org.raml.jaxrs.example.model.Customers;

import javax.ws.rs.PathParam;
import java.util.ArrayList;

/**
 * Created by gabrieldimech on 10/07/2016.
 */
public class CustomerResourceImpl implements CustomersResource {
    public GetCustomersResponse getCustomers() throws Exception {
        Customer customer = new Customer();
        customer.setId("1");
        customer.setName("gabe");
        customer.setSurname("dimech");
        Customers customers = new Customers();
        ArrayList<Customer> arr = new ArrayList<Customer>();
        arr.add(customer);
        customers.setCustomers(arr);
        GetCustomersResponse res = GetCustomersResponse.withJsonOK(customers);
        return res;
    }

    public PutCustomersByCustomerIdResponse putCustomersByCustomerId(@PathParam("customer_id") String customerId) throws Exception {
        return null;
    }
}
