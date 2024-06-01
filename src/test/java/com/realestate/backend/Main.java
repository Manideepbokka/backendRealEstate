package com.realestate.backend;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class Main
{
    int[] solution(String jsonData) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();
        List<Apartment> apartmentData = objectMapper.readValue(jsonData, new TypeReference<List<Apartment>>(){});

        int[] answer = new int[apartmentData.size()];
        String singBedroom = "1-bedroom";
        String studio = "studio";
        for(int i=0;i<apartmentData.size();i++){
            String desc = apartmentData.get(i).getDescription();
            String[] words = desc.split("\\s+");
            boolean word1Present = false;
            boolean word2Present = false;
            for (String word : words) {
                if (word.equalsIgnoreCase(singBedroom)) {
                    word1Present = true;
                    for (String secondWord : words) {
                        if (secondWord.equalsIgnoreCase(studio)) {
                            word2Present = true;
                            break;
                        }
                    }
                    if (word1Present && word2Present) {
                        break;
                    }
                }
            }
            if(!word1Present && !word2Present){
                answer[i] = apartmentData.get(i).getNum_bedrooms();
            }
            if(!(word1Present && word2Present)){
                if(word1Present){
                    answer[i] = 1;
                }
                else {
                    answer[i] = 0;
                }
            }
            else if(word1Present && word2Present){
                boolean preceded = false;
                String[] wordsToCheck = {"dance", "yoga", "art"};
                for (int k = 1; k < words.length; k++) {
                    for (String word : words) {
                        if (words[k].equalsIgnoreCase(singBedroom) && words[i - 1].equalsIgnoreCase(singBedroom)) {
                            preceded = true;
                            break;
                        }
                    }
                    if (preceded) {
                        break;
                    }
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

class Apartment{
    private String id;
    private String agent;
    private String unit;
    private String description;
    private Integer num_bedrooms;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNum_bedrooms() {
        return num_bedrooms;
    }

    public void setNum_bedrooms(Integer num_bedrooms) {
        this.num_bedrooms = num_bedrooms;
    }
}