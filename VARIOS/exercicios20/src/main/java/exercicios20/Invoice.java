package exercicio4POO;

public final class Invoice {

    private int codigoItem;
    private String descric�o;
    private int quantidade;
    private float pre�oUnitario;
    // metodo construtor

    public Invoice(int codigoItem, String descric�o, int quantidade, float pre�oUnitario) {

        this.setCodigoItem(codigoItem);

        this.setDescric�o(descric�o);
        
        this.setQuantidade(quantidade);
        
        this.setPre�oUnitario(pre�oUnitario);

        // obs; foi colocado a restri��o do quantidade e pre�o uinitario no set abaixo.
    }

    //metodo a��o//
    public double getInvoiceAmount() {

        return (quantidade * pre�oUnitario);

    }

    //metodo modificadores de acesso/acessores
    public int getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(int codigoItem) {
        this.codigoItem = codigoItem;
    }

    public String getDescric�o() {
        return descric�o;
    }

    public void setDescric�o(String descric�o) {
        this.descric�o = descric�o;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            this.quantidade = 0;
        } else {
            this.quantidade = quantidade;
        }
    }

    public float getPre�oUnitario() {
        return pre�oUnitario;
    }

    public void setPre�oUnitario(float pre�oUnitario) {
        if (pre�oUnitario < 0) {
            this.pre�oUnitario = 0;
        } else {
            this.pre�oUnitario = pre�oUnitario
        }

    }
}
