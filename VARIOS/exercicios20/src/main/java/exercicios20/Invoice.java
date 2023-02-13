package exercicio4POO;

public final class Invoice {

    private int codigoItem;
    private String descricão;
    private int quantidade;
    private float preçoUnitario;
    // metodo construtor

    public Invoice(int codigoItem, String descricão, int quantidade, float preçoUnitario) {

        this.setCodigoItem(codigoItem);

        this.setDescricão(descricão);
        
        this.setQuantidade(quantidade);
        
        this.setPreçoUnitario(preçoUnitario);

        // obs; foi colocado a restrição do quantidade e preço uinitario no set abaixo.
    }

    //metodo ação//
    public double getInvoiceAmount() {

        return (quantidade * preçoUnitario);

    }

    //metodo modificadores de acesso/acessores
    public int getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(int codigoItem) {
        this.codigoItem = codigoItem;
    }

    public String getDescricão() {
        return descricão;
    }

    public void setDescricão(String descricão) {
        this.descricão = descricão;
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

    public float getPreçoUnitario() {
        return preçoUnitario;
    }

    public void setPreçoUnitario(float preçoUnitario) {
        if (preçoUnitario < 0) {
            this.preçoUnitario = 0;
        } else {
            this.preçoUnitario = preçoUnitario
        }

    }
}
