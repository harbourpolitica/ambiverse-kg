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
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * License
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-03-01T10:53:31.231Z")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class License {
  @JsonProperty("name")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private String name = null;

  @JsonProperty("url")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private String url = null;

  public License name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The license name
   * @return name
   **/
  @JsonProperty("name")
  @ApiModelProperty(example = "GNUFreeDocumentationLicense", value = "The license name")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public License url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The license url
   * @return url
   **/
  @JsonProperty("url")
  @ApiModelProperty(example = "https://www.gnu.org/licenses/gfdl", value = "The license url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    License license = (License) o;
    return Objects.equals(this.name, license.name) &&
        Objects.equals(this.url, license.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class License {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

