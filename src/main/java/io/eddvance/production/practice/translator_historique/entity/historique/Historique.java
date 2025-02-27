package io.eddvance.production.practice.translator_historique.entity.historique;

public class Historique {

    private Long histoNumber;
    private String histoLangue;
    private String histoDate;

    public Historique() {
    }
    public Historique(Long histoNumber, String histoLangue, String histoDate) {
        this.histoNumber = histoNumber;
        this.histoLangue = histoLangue;
        this.histoDate = histoDate;
    }

    public Long getHistoNumber() {
        return histoNumber;
    }

    public void setHistoNumber(Long histoNumber) {
        this.histoNumber = histoNumber;
    }

    public String getHistoLangue() {
        return histoLangue;
    }

    public void setHistoLangue(String histoLangue) {
        this.histoLangue = histoLangue;
    }

    public String getHistoDate() {
        return histoDate;
    }

    public void setHistoDate(String histoDate) {
        this.histoDate = histoDate;
    }
}