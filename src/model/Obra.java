package model;

public class Obra {
	private int id;
	private String nomeArtista;
	private String tituloObra;
	private String categoria;
	private String tipoObra;
	private String dataFeito;

	public Obra(int id, String nomeArtista, String tituloObra, String categoria, String tipoObra, String dataFeito) {
		super();
		this.id = id;
		this.nomeArtista = nomeArtista;
		this.tituloObra = tituloObra;
		this.categoria = categoria;
		this.tipoObra = tipoObra;
		this.dataFeito = dataFeito;
	}
	
	public Obra(){
		
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getNomeArtista() {
		return nomeArtista;
	}
	public void setNomeArtista(String nomeArtista) {
		this.nomeArtista = nomeArtista;
	}

	public String getTituloObra() {
		return tituloObra;
	}
	public void setTituloObra(String tituloObra) {
		this.tituloObra = tituloObra;
	}

	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getTipoObra() {
		return tipoObra;
	}
	public void setTipoObra(String tipoObra) {
		this.tipoObra = tipoObra;
	}

	public String getDataFeito() {
		return dataFeito;
	}
	public void setDataFeito(String dataFeito) {
		this.dataFeito = dataFeito;
	}
}
