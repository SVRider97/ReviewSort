/**
* 4.b Subclass of participant abstract class.
*/
class Guest extends Reviewer {
private String name;
private String gender;
private String Rating;
//Data members below are strings 
public Guest(String reviewerID, String name, String gender, String Rating) {
super(reviewerID);
this.name = name;
this.gender = gender;
this.Rating = Rating;
}
//Subclass accessor/getter
@Override
public String getName() {
return this.name;
}
//Overriding methods 
@Override
public String getGender() {
return this.gender;
}
@Override
public String getRating() {
return this.Rating;
}
@Override
public String toString() {
return "Guest{" +
"reviewerID='" + reviewerID + '\'' +
", name='" + name + '\'' +
", gender='" + gender + '\'' +
", Rating = '" + Rating + '\'' +
'}';
}

//Subclass mutator methods 
public void setName(String name) {
this.name = name;
}
public void setGender(String gender) {
this.gender = gender;
}
//This method is overloaded as here it uses string and below it uses integer as data type
public void setRating(String Rating) {
this.Rating = Rating;
}
//Method setRating which is overloaded since it takes integer, and other one takes string
public void setRating(int Rating) {
this.Rating = String.valueOf(Rating);
}
}
