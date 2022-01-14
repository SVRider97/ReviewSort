/**
* 4.a Super abstract class to represent person who left review.
*/
abstract class Reviewer implements Person {
// represents the identifier of the participation. This will be used to represent the participant.
//Static member 
protected static String reviewerID;
//String data members in superclass
public Reviewer(String reviewerID) {
this.reviewerID = reviewerID;
}
//abstract method #1 & accessor (getter)
//Static method
public static String getReviewerID() {
return reviewerID;
}
//abstract method #2 & mutator method (setter)
public void setReviewerID(String reviewerID) {
this.reviewerID = reviewerID;
}
}