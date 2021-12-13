package model.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.PersonData;

import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetAllPeopleResponse extends DefaultPeopleResponse {

    private int numberOfPeople;
    private List<PersonData> peopleData;
}
