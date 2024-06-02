package iphone;
	
	public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	    public void ligar(String numero) {
	    	System.out.println("LIGANDO..");
	    }

	    public void atender(String numero) {
	    	System.out.println("ATENDENDO..");
	    }

	    public void iniciarCorreioVoz(String mensagem, String destinatario) {
	    	System.out.println("INICIANDO CORREIO DE VOZ..");
	    }

	    public void exibirPagina(String url) {
	    	System.out.println("EXIBINDO PAGINA..");
	    }

	    public void adicionarNovaAba(String url) {
	    	System.out.println("ADICIONANDO NOVA ABA..");
	    }

	    public void atualizarPagina() {
	    	System.out.println("ATUALIZANDO PAGINA..");
	    }

	    public void tocar() {
	    	System.out.println("TOCANDO..");
	    }


	    public void pausar() {
	    	System.out.println("PAUSANDO..");
	    }

	    public void selecionarMusica() {
	    	System.out.println("SELECIONANDO MUSICA..");
	    }
	}
