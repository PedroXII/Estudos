package locaçao;

public class Filme {
    
    private double preco;
    private String categoria;
    private String titulo;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public double ValorTotal(){
        if (categoria.equalsIgnoreCase("Lancamento")){
            return this.preco += 3;}
        if (categoria.equalsIgnoreCase("Infantil")){
            return this.preco += 2;}
        if (categoria.equalsIgnoreCase("Promocao")){
            return this.preco -= 2;}
        return this.preco;}
    
    public void Print(){
        System.out.println("Filme: " + this.titulo + "\nCategoria: " + this.categoria + "\nPreco: " + this.preco);}
    }
