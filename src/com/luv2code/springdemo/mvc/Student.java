package com.luv2code.springdemo.mvc;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


@Getter
@Setter
public class Student {

    public Student() {
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("Brazil", "Brazil");
        countryOptions.put("France", "France");
        countryOptions.put("Germany", "Germany");
        countryOptions.put("United States of Americas", "United States of America");

        favoriteLanguageOptions = new LinkedHashMap<>();
        favoriteLanguageOptions.put("Java", "Java");
        favoriteLanguageOptions.put("Python", "Python");
        favoriteLanguageOptions.put("C++", "C++");
        favoriteLanguageOptions.put("PHP", "PHP");

        operatingSystemsOptions = new LinkedHashMap<>();
        operatingSystemsOptions.put("MacOS", "MacOS");
        operatingSystemsOptions.put("Windows", "Windowss");
        operatingSystemsOptions.put("Linux", "Linux");
    }

    private String firstName;
    private String lastName;
    private String country;
    private String favoriteLanguage;
    private List<String> operatingSystems;
//    private String countryPropertie; - zaczytywanie z countries.propertiers
    private LinkedHashMap<String, String> countryOptions;
    private LinkedHashMap<String, String> favoriteLanguageOptions;
    private LinkedHashMap<String, String> operatingSystemsOptions;
}
