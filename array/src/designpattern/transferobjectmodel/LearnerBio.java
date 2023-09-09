package designpattern.transferobjectmodel;

import java.util.*;
class LearnerBio
{
	List<Learner> learners;
	public LearnerBio() {
		learners=new ArrayList<Learner>();
		Learner learners1=new Learner(1, "ram", "hyderabad");
		Learner learners2=new Learner(2,"raj","cheenai");
		Learner learners3=new Learner(3,"riya","bengulure");
		Learner learners4=new Learner(4,"rishi","mumbai");
		learners.add(learners1);
		learners.add(learners2);
		learners.add(learners3);
		learners.add(learners4);


	}
	public void deleteLearner(Learner learner) {
		learners.remove(learner.getLearnerid());
		System.out.println(" Learner id "+learner.getLearnerid()+",deleted from database");
	}
	
	public List<Learner>getAllLearner(){
		return learners;
	}
	public Learner getLearner(int id) {
		return learners.get(id);
	}
	public void updateLearner(Learner learner) {
		learners.get(learner.getLearnerid()).setLearnerName(learner.getLearnerName());
		System.out.println(" Learner id "+learner.getLearnerid()+",updated in the database");
	
}
}
