package com.abnamro.mulb.stream;

import jdk.jfr.DataAmount;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Question {
    private int id;
    private String question;
    private String opt1;
    private String opt2;
    private String opt3;
    private String opt4;
    private String answer;

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", opt1='" + opt1 + '\'' +
                ", opt2='" + opt2 + '\'' +
                ", opt3='" + opt3 + '\'' +
                ", opt4='" + opt4 + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
