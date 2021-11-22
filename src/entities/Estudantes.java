package entities;

public class Estudantes {

	private String nome;
	private String email;
	private int room;

	public Estudantes() {
		
	}
	
	public Estudantes(String nome, String email) {
		this.nome = nome;
		this.email = email;
	
	}
	
	public Estudantes(String nome, String email, int room) {
		this.nome = nome;
		this.email = email;
		this.room = room;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}
}
