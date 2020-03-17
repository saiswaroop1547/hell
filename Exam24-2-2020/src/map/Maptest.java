package map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Maptest {

		int id;
		String Question;
		Map<String,String> answers;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getQuestion() {
			return Question;
		}
		public void setQuestion(String question) {
			Question = question;
		}
		public Map<String, String> getAnswers() {
			return answers;
		}
		public void setAnswers(Map<String, String> answers) {
			this.answers = answers;
		}
		public Maptest(int id, String question, Map<String, String> answers) {
			super();
			this.id = id;
			Question = question;
			this.answers = answers;
		}
		public void displayAnswers()
		{
			System.out.println("id is:" + id + "Question is:"  +Question);
			Set keys=answers.entrySet();
			Iterator itr=keys.iterator();
			while(itr.hasNext())
			{
				Map.Entry e=(Map.Entry)itr.next();
				System.out.println(e.getKey()+" "+e.getValue());
			}
		}
	}
