
package com.example.demo.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DocTypeDesc",
    "DocType",
    "EntityID",
    "DocURL",
    "DocDate"
})
@Generated("jsonschema2pojo")
public class Projectdoc implements Serializable
{

    @JsonProperty("DocTypeDesc")
    private String docTypeDesc;
    @JsonProperty("DocType")
    private String docType;
    @JsonProperty("EntityID")
    private String entityID;
    @JsonProperty("DocURL")
    private String docURL;
    @JsonProperty("DocDate")
    private String docDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -1979505404774746349L;

    @JsonProperty("DocTypeDesc")
    public String getDocTypeDesc() {
        return docTypeDesc;
    }

    @JsonProperty("DocTypeDesc")
    public void setDocTypeDesc(String docTypeDesc) {
        this.docTypeDesc = docTypeDesc;
    }

    @JsonProperty("DocType")
    public String getDocType() {
        return docType;
    }

    @JsonProperty("DocType")
    public void setDocType(String docType) {
        this.docType = docType;
    }

    @JsonProperty("EntityID")
    public String getEntityID() {
        return entityID;
    }

    @JsonProperty("EntityID")
    public void setEntityID(String entityID) {
        this.entityID = entityID;
    }

    @JsonProperty("DocURL")
    public String getDocURL() {
        return docURL;
    }

    @JsonProperty("DocURL")
    public void setDocURL(String docURL) {
        this.docURL = docURL;
    }

    @JsonProperty("DocDate")
    public String getDocDate() {
        return docDate;
    }

    @JsonProperty("DocDate")
    public void setDocDate(String docDate) {
        this.docDate = docDate;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
