import java.util.Scanner;
class Characteristic {
    public String description; //initialization of instance variables
    public int rating;
    public Characteristic(String description){ //this is the constructor with a String parameter. It sets the rating at zero as instructed.
        this.description= description;
        rating=0;
    }
    private boolean isValid( int aRating){ //this is the method that sets the rating to true when it stays within the limit
        if(aRating >= 0 || aRating <= 10){
            return true;
        }
        else{
            return false;
        }
    }
    public void setRating(int aRating){ //This sets arating and rating as one and the same when arating comes back as true
        if(isValid(rating)==true)
            rating=aRating;
    }
    public void setRating(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the rating for " +getDescription());
        rating= keyboard.nextInt();  //this sets the rating based on user input
    }
    public int getRating(){
        return rating;
    }
    public String getDescription(){
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter the description.");
        String Description= kb.nextLine();
        return Description; //this lets the user input a description which is only supposed to be a simple string word
    }

    public String getDescription1(){
        return description;
    }

    private boolean isMatch(Characteristic otherRating){ //This boolean determines if the two are a match or not
        if(getDescription().equals(otherRating.getDescription())){
            return true;
        }
        else{
            return false;
        }}

    private double getCompatabilityMeasure(Characteristic otherRating){ //This determines the numbered "compatability" of the two people
        if(this.rating ==0 && otherRating.rating==0){
            return 0;
        }
        else{
            double m = 1-((otherRating.rating - this.rating)*(otherRating.rating-          this.rating))/(81);
            return m;
        }}


    public double getCompatability(Characteristic otherRating){
        if(isMatch(otherRating) == false){
            return 0;
        }
        else{
            return getCompatabilityMeasure(otherRating);
        }
    }
}