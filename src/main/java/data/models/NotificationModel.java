package data.models;

import java.util.ArrayList;

public class NotificationModel {
    private String message;
    private String departamento;
    private String provincia;
    private String distrito;

    public NotificationModel() {}

    public void setMessage (String message) {
        this.message = message;
    }

    public String getMessage () {
        return this.message;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getProvincia() {
        return this.provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDistrito() {
        return this.distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

};
