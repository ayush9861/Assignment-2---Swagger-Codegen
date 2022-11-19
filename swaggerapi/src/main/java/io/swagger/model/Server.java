package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This is the Server model.
 */
@Schema(description = "This is the Server model.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-19T15:09:32.514488200+05:30[Asia/Calcutta]")


public class Server   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("language")
  private String language = null;

  @JsonProperty("framework")
  private String framework = null;

  public Server id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of Server.
   * @return id
   **/
  @Schema(description = "The ID of Server.")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Server name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The Name of server.
   * @return name
   **/
  @Schema(description = "The Name of server.")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Server language(String language) {
    this.language = language;
    return this;
  }

  /**
   * The Language Used on the Server.
   * @return language
   **/
  @Schema(description = "The Language Used on the Server.")
  
    public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public Server framework(String framework) {
    this.framework = framework;
    return this;
  }

  /**
   * The Framework Used.
   * @return framework
   **/
  @Schema(description = "The Framework Used.")
  
    public String getFramework() {
    return framework;
  }

  public void setFramework(String framework) {
    this.framework = framework;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Server server = (Server) o;
    return Objects.equals(this.id, server.id) &&
        Objects.equals(this.name, server.name) &&
        Objects.equals(this.language, server.language) &&
        Objects.equals(this.framework, server.framework);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, language, framework);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Server {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    framework: ").append(toIndentedString(framework)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
