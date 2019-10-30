package com.nibblesonbits.yougotsurveyed;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("SurveyQuestion")
public class SurveyQuestion {
    @Id
    private String id;
    private String type;    // "1-10", "Multiple Choice", "YN", "open"
    private String question;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }


}
