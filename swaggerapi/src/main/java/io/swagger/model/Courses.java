package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This is the Student model.
 */
@Schema(description = "This is the Student model.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-07T00:59:28.756715600+05:30[Asia/Calcutta]")


public class Courses   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("courseName")
  private String courseName = null;

  @JsonProperty("courseCode")
  private String courseCode = null;

  @JsonProperty("courseDuration")
  private Integer courseDuration = null;

  public Courses id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of Course.
   * @return id
   **/
  @Schema(description = "The ID of Course.")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Courses courseName(String courseName) {
    this.courseName = courseName;
    return this;
  }

  /**
   * The Name of course.
   * @return courseName
   **/
  @Schema(description = "The Name of course.")
  
    public String getCourseName() {
    return courseName;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

  public Courses courseCode(String courseCode) {
    this.courseCode = courseCode;
    return this;
  }

  /**
   * The Coursecode of Course.
   * @return courseCode
   **/
  @Schema(description = "The Coursecode of Course.")
  
    public String getCourseCode() {
    return courseCode;
  }

  public void setCourseCode(String courseCode) {
    this.courseCode = courseCode;
  }

  public Courses courseDuration(Integer courseDuration) {
    this.courseDuration = courseDuration;
    return this;
  }

  /**
   * The Duration of Course.
   * @return courseDuration
   **/
  @Schema(description = "The Duration of Course.")
  
    public Integer getCourseDuration() {
    return courseDuration;
  }

  public void setCourseDuration(Integer courseDuration) {
    this.courseDuration = courseDuration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Courses courses = (Courses) o;
    return Objects.equals(this.id, courses.id) &&
        Objects.equals(this.courseName, courses.courseName) &&
        Objects.equals(this.courseCode, courses.courseCode) &&
        Objects.equals(this.courseDuration, courses.courseDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, courseName, courseCode, courseDuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Courses {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    courseName: ").append(toIndentedString(courseName)).append("\n");
    sb.append("    courseCode: ").append(toIndentedString(courseCode)).append("\n");
    sb.append("    courseDuration: ").append(toIndentedString(courseDuration)).append("\n");
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
