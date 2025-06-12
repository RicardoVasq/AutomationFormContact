package utils.data.FormContactUs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

public class varRigthData implements FormDataInterface{
    @JsonProperty("name")
    private String name;
    @JsonProperty("email")
    private String email;
    @JsonProperty("numberPhone")
    private int numberPhone;
    @JsonProperty("countryCode")
    private String countryCode;
    @JsonProperty("subject")
    private String subject;
    @JsonProperty("message")
    private String message;

    public String getName() {
        return name;
    }
    public String getMessage() {
        return message;
    }
    public String getSubject() {
        return subject;
    }
    public String getCountryCode() {
        return countryCode;
    }
    public int getNumberPhone() {
        return numberPhone;
    }
    public String getEmail() {
        return email;
    }
}
