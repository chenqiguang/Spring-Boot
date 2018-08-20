package com.chenqiguang.springboot.spec.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.validation.constraints.*;

/**
 * Hello 类
 */
@ApiModel(description = "Hello 类")

@JsonInclude(NON_NULL)
public class Hello {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("age")
  private Long age = null;

  @JsonIgnore
  public Hello name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 姓名
   * @return name
  **/
  @ApiModelProperty(value = "姓名")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @JsonIgnore
  public Hello age(Long age) {
    this.age = age;
    return this;
  }

   /**
   * 年龄
   * @return age
  **/
  @ApiModelProperty(value = "年龄")
  public Long getAge() {
    return age;
  }

  public void setAge(Long age) {
    this.age = age;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Hello hello = (Hello) o;
    return Objects.equals(this.name, hello.name) &&
        Objects.equals(this.age, hello.age);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Hello {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
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
