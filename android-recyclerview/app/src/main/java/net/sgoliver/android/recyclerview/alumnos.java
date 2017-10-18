package net.sgoliver.android.recyclerview;

public class alumnos
{
    private String nombre;
    private String apllidos;
    private int edad;

    public alumnos(String tit, String sub,int ed){
        nombre = tit;
        apllidos = sub;
        edad=ed;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellidos(){
        return apllidos;
    }
    public int getEdad() {return edad;}
}
