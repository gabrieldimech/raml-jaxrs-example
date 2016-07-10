
package org.raml.jaxrs.example.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A collection customers
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "size",
    "customers"
})
public class Customers {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("size")
    private Integer size;
    @JsonProperty("customers")
    private List<Customer> customers = new ArrayList<Customer>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The size
     */
    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }

    /**
     * 
     * (Required)
     * 
     * @param size
     *     The size
     */
    @JsonProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    public Customers withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 
     * @return
     *     The customers
     */
    @JsonProperty("customers")
    public List<Customer> getCustomers() {
        return customers;
    }

    /**
     * 
     * @param customers
     *     The customers
     */
    @JsonProperty("customers")
    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public Customers withCustomers(List<Customer> customers) {
        this.customers = customers;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Customers withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
