package crolling;

public class DCInsideArticle {
	private int id; 
	private String title; 
	private String count; 
	private String recommend; 
	private String repleNum; 
	

	public DCInsideArticle(int id, String title, String repleNum, String count, String recommend) {
		
		this.id = id; 
		this.title = title; 
		this.count = count; 
		this.recommend = recommend; 
		this.repleNum = repleNum; 
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}

	


	public String getCount() {
		return count;
	}


	public void setCount(String count) {
		this.count = count;
	}


	public String getRecommend() {
		return recommend;
	}


	public String getRepleNum() {
		return repleNum;
	}


	public void setRepleNum(String repleNum) {
		this.repleNum = repleNum;
	}


	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}

	public String toString() {
		return "[" + id + "/" + title + "/" + repleNum + "/" + count + "/" + recommend + "]";  
	}
}
