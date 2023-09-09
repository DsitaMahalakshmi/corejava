package designpattern.transferobjectmodel;

public class Learner {
private int learnerid;
private String learnerName;
private String learnerCity;

Learner(int learnerid,String learnerName,String learnerCity)
{
 this.learnerid=learnerid;
 this.learnerName=learnerName;
 this.learnerCity=learnerCity;
}

public int getLearnerid() {
	return learnerid;
}

public void setLearnerid(int learnerid) {
	this.learnerid = learnerid;
}

public String getLearnerName() {
	return learnerName;
}

public void setLearnerName(String learnerName) {
	this.learnerName = learnerName;
}

public String getLearnerCity() {
	return learnerCity;
}

public void setLearnerCity(String learnerCity) {
	this.learnerCity = learnerCity;
}

@Override
public String toString() {
	return "Learner [learnerid=" + learnerid + ", learnerName=" + learnerName + ", learnerCity=" + learnerCity + "]";
}
}
 

