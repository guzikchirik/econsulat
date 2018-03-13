package businessobjects;

/**
 * Created by Anton_Chyrko on 3/5/2018.
 */
public class Questionary implements Comparable<String>{
  private String surname;
  private String surnameAtBirth;
  private String firstName;
  private String dateOfBirth;
  private String placeOfBirth;
  private String countryOfBirth;
  private String currentNationality;
  private String originalNationality;
  private String sex;
  private String martialStatus;
  private String nationalIdentityNumber;
  private String dateOfIssue;
  private String validUntil;
  private String issuedBy;

  @Override
  public int compareTo(String o) {
    return 0;
  }
}
