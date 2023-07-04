public class Libro {

	private String titolo;
	private String autori;
	private String casaEditrice;
	private int nCopie;
	private Lettore[] listaLettori;

	public Libro(String titolo, String autori, String casaEditrice, int nCopie) {
		this.titolo = titolo;
		this.autori = autori;
		this.casaEditrice = casaEditrice;
		this.nCopie = nCopie;
		this.listaLettori = new Lettore[nCopie];
	}

	public String getTitolo() {
		return titolo;
	}

	public String getAutori() {
		return autori;
	}

	public String getCasaEditrice() {
		return casaEditrice;
	}

	public int getNCopie() {
		return nCopie;
	}

	public Lettore[] getListaLettori() {
		return listaLettori;
	}

	public boolean aggiornaLettori(Lettore lettore) {

		if (nCopie > 0) {
			for (int i = 0; i < this.listaLettori.length; i++) {
				if (listaLettori[i] == null) {
					listaLettori[i] = lettore;
					return true;
				}
			}
			return false;
		} 
		else
			return false;
	}
	
	
	public String elencoLettori() {
		String stringaLettori = "";
		
		for(int i=0; i<listaLettori.length; i++) {
			if(listaLettori[i] != null) {
				stringaLettori += "Lettore: " + listaLettori[i].get_nome() + " ";
			}
		}
		
		return stringaLettori;
		
		
	}
	

}
