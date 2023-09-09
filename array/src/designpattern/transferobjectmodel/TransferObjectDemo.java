package designpattern.transferobjectmodel;

public class TransferObjectDemo {
	public static void main(String[] args) {
	
	LearnerBio learnerObject=new LearnerBio();
	for(Learner learner:learnerObject.getAllLearner()) {
  	  System.out.println(" Learner :[Id:"+learner.getLearnerid()+",Name :"+learner.getLearnerName()+"]");
	}
  	 Learner l=learnerObject.getAllLearner().get(1);
     l.setLearnerName(" sita ");
     
     learnerObject.updateLearner(l);
     
     l=learnerObject.getLearner(1);
     System.out.println("Learner:[id:"+l.getLearnerid()+",Name : "+l.getLearnerName()+"]");
	
     
     for(Learner learn:learnerObject.getAllLearner()) {
     	  System.out.println(" Learner :[Id:"+learn.getLearnerid()+",Name :"+learn.getLearnerName()+"]");
     }
     
   //update student
     Learner learner= learnerObject.getAllLearner().get(2);
     learner.setLearnerName("Michael");
     learnerObject.updateLearner(learner);
	
}
}