
package org.raml.jaxrs.example.resource;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.raml.jaxrs.example.model.Customer;
import org.raml.jaxrs.example.model.Customers;

@Path("customers")
public interface CustomersResource {


    /**
     * return list of customers
     * 
     */
    @GET
    @Produces({
        "application/json"
    })
    CustomersResource.GetCustomersResponse getCustomers()
        throws Exception
    ;

    /**
     * add/replace a customer
     * 
     * @param customerId
     *     
     */
    @PUT
    @Path("{customer_id}")
    @Produces({
        "application/json"
    })
    CustomersResource.PutCustomersByCustomerIdResponse putCustomersByCustomerId(
        @PathParam("customer_id")
        String customerId)
        throws Exception
    ;

    public class GetCustomersResponse
        extends org.raml.jaxrs.example.resource.support.ResponseWrapper
    {


        private GetCustomersResponse(Response delegate) {
            super(delegate);
        }

        /**
         *  e.g. [{
         *     name: "lewis",
         *     surname: "hamilton",
         *     id: "123"
         *   },
         *   {
         *     name: "nico",
         *     surname: "rosberg",
         *     id: "124"
         *   }
         * ]
         * 
         * 
         * @param entity
         *     [{
         *         name: "lewis",
         *         surname: "hamilton",
         *         id: "123"
         *       },
         *       {
         *         name: "nico",
         *         surname: "rosberg",
         *         id: "124"
         *       }
         *     ]
         *     
         */
        public static CustomersResource.GetCustomersResponse withJsonOK(Customers entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CustomersResource.GetCustomersResponse(responseBuilder.build());
        }

    }

    public class PutCustomersByCustomerIdResponse
        extends org.raml.jaxrs.example.resource.support.ResponseWrapper
    {


        private PutCustomersByCustomerIdResponse(Response delegate) {
            super(delegate);
        }

        /**
         *  e.g. {
         *     name: "lewis",
         *     surname: "hamilton",
         *     id: "123"
         * }
         * 
         * @param entity
         *     {
         *         name: "lewis",
         *         surname: "hamilton",
         *         id: "123"
         *     }
         */
        public static CustomersResource.PutCustomersByCustomerIdResponse withJsonOK(Customer entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CustomersResource.PutCustomersByCustomerIdResponse(responseBuilder.build());
        }

    }

}
