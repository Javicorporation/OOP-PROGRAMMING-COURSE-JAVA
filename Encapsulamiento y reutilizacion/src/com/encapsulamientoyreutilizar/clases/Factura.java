package com.encapsulamientoyreutilizar.clases;

public abstract class Factura {
    private int id;
    private String concepto;
    private double importe;

    public Factura(int id, String concepto, double importe) {
        this.id = id;
        this.concepto = concepto;
        this.importe = importe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public abstract double calcularTotal();

}
