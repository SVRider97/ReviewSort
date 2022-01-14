/**
* 4.b Subclass of participant abstract class.
*/
class User extends Reviewer {
private String name;
private String gender;
private String Rating;
private int iRating; 
public User(String reviewerID, String name, String gender, String Rating) {
super(reviewerID);
this.name = name;
this.gender = gender;
this.Rating = Rating;
this.iRating = Integer.parseInt(Rating);
}
@Override
public String getName() {
return this.name;
}
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
return "User{" +
"reviewerID='" + reviewerID + '\'' +
", name='" + name + '\'' +
", gender='" + gender + '\'' +
", Rating='" + Rating + '\'' +
'}';
}
//We need to create one method that is overloading (so it will have same name as method, but different data type in parameters), 
//other method we need to convert string to integer
//Method overloading
public User(String reviewerID, String name, String gender, int iRating) {
super(reviewerID);
this.name = name;
this.gender = gender;
this.iRating = iRating;
}
}
