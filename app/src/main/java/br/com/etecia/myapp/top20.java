package br.com.etecia.myapp;

public class top20 {
//1. Michael Jordan
//2. LeBron James
//3. Kareem Abdul-Jabbar
//4. Magic Johnson
//5. Wilt Chamberlain
//6. Bill Russell
//7. Larry Bird
//8. Tim Duncan
//9. Oscar Robertson
//10. Kobe Bryant
//11. Shaquille O’Neal
//12. Kevin Durant
//13. Hakeem Olajuwon
//14. Julius Erving
//15. Moses Malone
//16. Stephen Curry
//17. Dirk Nowitzki
//18. Giannis Antetokounmpo
//19. Jerry West
//20. Elgin Baylor

    private String titulo;
    private String numeracao;
    private int imagem;

    public top20(String numeracao, String titulo, int imagem ){
        this.titulo = titulo;
        this.imagem = imagem;
        this.numeracao = numeracao;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getNumeracao(){
        return numeracao;
    }

    public void setNumeracao(String numeracao){
        this.numeracao = numeracao;
    }

}
