package com.gege254.mongospringboot.domain;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@getter
@setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "data")
public class Data {
  @Id
  private String id;

  private String binaryNumber;
  private String octalNumber;
 
  public Data() {

  }

  public String getOctalNumber() {
    return octalNumber;
  }

  public void setOctalNumber(String octalNumber) {
    this.octalNumber = octalNumber;
  }

  public String getBinaryNumber() {
    return binaryNumber;
  }

  public void setBinaryNumber(String binaryNumber) {
    this.binaryNumber = binaryNumber;
  }

  public void setCreatedAt(java.util.Date date) {
  }

  
}
