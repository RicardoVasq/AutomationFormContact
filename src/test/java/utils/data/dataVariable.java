package utils.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import utils.data.FormContactUs.varFormContactUs;

public class dataVariable {
    @JsonProperty("dataFormContactUs")
    private varFormContactUs dataFormContactUs;

    public varFormContactUs getDataFormContactUs() {
        return dataFormContactUs;
    }
}
