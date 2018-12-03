/*
 * Knowledge Graph Service
 * The Knowledge Graph Service lets you find entities and categories in the knowledge graph. This service is particularly suited to be run as a second step after the Entity Linking Service has been used for linking ambiguous names in natural-language texts to entities. With this service, you can now explore these entities further. 
 *
 * OpenAPI spec version: v2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package de.mpg.mpi_inf.ambiversenlu.kg.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * List of result entities identified by their knowledge graph IDs.
 */
@ApiModel(description = "List of result entities identified by their knowledge graph IDs.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-02-21T12:33:39.350Z")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EntitiesSearchResponse extends ArrayList<String>  {

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntitiesSearchResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

