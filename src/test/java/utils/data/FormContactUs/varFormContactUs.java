package utils.data.FormContactUs;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;


@JsonRootName("dataFormContactUs")
public class varFormContactUs {
    @JsonProperty("rightDataForm")
    private varRigthData rightDataForm;
    @JsonProperty("wrongDataForm")
    private varWrongData wrongDataForm;

    public varRigthData getRightDataForm() {
        return rightDataForm;
    }

    public varWrongData getWrongDataForm() {
        return wrongDataForm;
    }
}
