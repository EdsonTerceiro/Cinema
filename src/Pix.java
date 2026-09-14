public class Pix extends Pagamento {

    private String chavePix;
    private String qrCode;
    private Date dataHora;

    public Pix(String id, double valor, String chavePix) {
        super(id, valor);
        this.chavePix = chavePix;
    }

    public String gerarQrcode() {
        this.qrCode = "QR-" + chavePix + "-" + System.currentTimeMillis();
        this.dataHora = new Date();
        return qrCode;
    }

    public boolean verificarStatusPix() {
        return this.status == StatusPagamento.CONFIRMADO;
    }

    // Implementacao especifica do Pix para o metodo abstrato de Pagamento
    @Override
    public boolean autorizar() {
        boolean autorizado = qrCode != null;
        if (autorizado) {
            this.status = StatusPagamento.CONFIRMADO;
        }
        return autorizado;
    }

    // Getters e Setters
    public String getChavePix() { return chavePix; }
    public void setChavePix(String chavePix) { this.chavePix = chavePix; }

    public String getQrCode() { return qrCode; }
    public void setQrCode(String qrCode) { this.qrCode = qrCode; }

    public Date getDataHora() { return dataHora; }
    public void setDataHora(Date dataHora) { this.dataHora = dataHora; }
}
