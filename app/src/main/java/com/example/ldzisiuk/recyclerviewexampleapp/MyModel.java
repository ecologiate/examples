package com.example.ldzisiuk.recyclerviewexampleapp;

import java.util.Date;

/**
 * Created by ldzisiuk on 28/8/17.
 */

public class MyModel {
    public String asunto;
    public String remitente;
    public Date fecha;
    public String body;

    public MyModel(String asunto, String remitente, Date fecha, String body) {
        this.asunto = asunto;
        this.remitente = remitente;
        this.fecha = fecha;
        this.body = body;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
