package dataGenerator;

import com.github.javafaker.Faker;

public class DataGenerator {
    public static String generateFirstName(){ return new Faker().name().firstName(); }
    public static String generateLastName(){
        return new Faker().name().lastName();
    }
    public static String generateEmailAddress(){return new Faker().internet().emailAddress();}
    public static String generateAdresa(){return new Faker().address().streetAddress();}
    public static String generateBrojStana(){
        Faker faker = new Faker();
        String broj;
        return broj = String.valueOf(faker.number().numberBetween(1, 100));
    }
    public static String generateSprat(){
        Faker faker = new Faker();
        String broj;
        return broj = String.valueOf(faker.number().numberBetween(1, 25));
    }
    public static String generatePostanskiBroj(){
        return new Faker().numerify("#####");
    }
    public static String generateNaselje(){return new Faker().address().cityName();}
    public static String generateOpstina(){return new Faker().address().cityName();}
    public static String generateGrad(){return new Faker().address().cityName();}
    public static String generateBrojTelefona(){return new Faker().numerify("##########");}
    public static String generateDodatneInformacije(){return new Faker().chuckNorris().fact();}

}

