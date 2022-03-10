package poodesafio1;
public class Vendedor {
    private String nome;
    private double meta, totalVendido;
    
    public Vendedor(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMeta() {
        return meta;
    }

    public void setMeta(double meta) {
        this.meta = meta;
    }

    public double getTotalVendido() {
        return totalVendido;
    }

    public void setTotalVendido(double totalVendido) {
        this.totalVendido = totalVendido;
    }
    public void calcularComissao(){
        double porcVend, porcComissao;
        
        //contas
        
        porcVend = this.totalVendido*100/this.meta;
        //IFs
        if(porcVend<50 && porcVend>0){
            porcComissao = 1*totalVendido/100;
            System.out.println("Sua comissão foi de apenas 1%, o que"
                             + "corresponde a "+porcComissao+"R$ de "
                             + "comissão");
        }else if(porcVend >=50 && porcVend<=75){
            porcComissao = 2.5*totalVendido/100;
            System.out.println("Sua comissão foi de 2,5%, o que corresponde"
                             + "a "+porcComissao+"R$ de Comissão");
        }else if(porcVend>75 && porcVend<=100){
            porcComissao = 3.5*totalVendido/100;
            System.out.println("Sua comissão foi de 3,5%, o que "
                             + "corresponde a "+porcComissao+"R$ de "
                             + "comissão");
        }else{
            porcComissao = 5*totalVendido/100;
            System.out.println("Sua comissão foi de 5%, o que corresponde"
                    + "a "+porcComissao+"R$ de comissão, bom Trabalho!");
        }
        //fim IFs
        System.out.println("Você atingiu "+porcVend+"% da meta estipulada");
    }
  
    //public String toString()
}
