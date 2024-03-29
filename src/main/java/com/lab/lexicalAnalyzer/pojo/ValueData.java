package com.lab.lexicalAnalyzer.pojo;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"idxConst", "type", "value"})
@ToString
public class ValueData {

    private static final String UNDEFINED = "undefined";

    //константа (лексема)
    private String Const;
    //індекс константи в таблиці констант
    private int idxConst;
    //тип константи
    private String type;
    //значення константи
    private String value;

    public ValueData(String Const, String token, int idxConst) {
        this.Const = Const;
        this.idxConst = idxConst;
        type = token;
        value = Const;
    }

}
