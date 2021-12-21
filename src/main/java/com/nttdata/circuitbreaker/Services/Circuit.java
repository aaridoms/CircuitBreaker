package com.nttdata.circuitbreaker.Services;

public class Circuit {

    private Integer nIntentosFallidos;
    private Integer nIntendosOk;
    private Integer limiteError;
    private Integer nIntentosMax;
    private Integer nIntentosActual;

    public Circuit(Integer nIntentosFallidos, Integer nIntendosOk, Integer limiteError, Integer nIntentosMax, Integer nIntentosActual) {
        this.nIntentosFallidos = nIntentosFallidos;
        this.nIntendosOk = nIntendosOk;
        this.limiteError = limiteError;
        this.nIntentosMax = nIntentosMax;
        this.nIntentosActual = nIntentosActual;
    }

    public Integer getnIntentosFallidos() {
        return nIntentosFallidos;
    }

    public void setnIntentosFallidos(Integer nIntentosFallidos) {
        this.nIntentosFallidos = nIntentosFallidos;
    }

    public Integer getnIntendosOk() {
        return nIntendosOk;
    }

    public void setnIntendosOk(Integer nIntendosOk) {
        this.nIntendosOk = nIntendosOk;
    }

    public Integer getLimiteError() {
        return limiteError;
    }

    public void setLimiteError(Integer limiteError) {
        this.limiteError = limiteError;
    }

    public Integer getnIntentosMax() {
        return nIntentosMax;
    }

    public void setnIntentosMax(Integer nIntentosMax) {
        this.nIntentosMax = nIntentosMax;
    }

    public Integer getnIntentosActual() {
        return nIntentosActual;
    }

    public void setnIntentosActual(Integer nIntentosActual) {
        this.nIntentosActual = nIntentosActual;
    }

    public String getState() {
        if (nIntentosFallidos == 0) {
            return "closed";
        } else if(nIntentosFallidos >= limiteError) {
            return "open";
        } else {
            return "half-open";
        }
    }
}
