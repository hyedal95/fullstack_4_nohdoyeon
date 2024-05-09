package todo;

public class TodoDto {
	 private int idx;
     private String todo;
     private int done;
     
	public int getIdx() {
		return idx;
	}
	public String getTodo() {
		return todo;
	}
	public int getDone() {
		return done;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public void setTodo(String todo) {
		this.todo = todo;
	}
	public void setDone(int done) {
		this.done = done;
	}
     
     
}
