package JavaReflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {
    public Reflection() {
    }
    public void listaNomeDosMetodos() {
        try {
            Class cl = Class.forName("JavaReflection.Pessoa");
            Method[] metodos = cl.getDeclaredMethods();

            for (int i = 0; i < metodos.length; i++) {
                System.out.println(metodos[i].toString());
            }

        } catch (Throwable e) {
            System.err.print(e);
        }
    }

    public void atributos() {
        try {
            Class cl = Class.forName("JavaReflection.Pessoa");
            Method metodos[] = cl.getDeclaredMethods();
            for (int i = 0; i < metodos.length; i++) {
                Method m = metodos[i];
                System.out.println("Nome do metodo: " + m.getName());
                System.out.println("Parametros:");

                for (int z = 0; z < m.getParameterTypes().length; z++) {
                    System.out.println("        " + z + ": " + m.getParameterTypes()[z]);
                }

                System.out.println("Tipo de returno: " + m.getReturnType());
            }

        } catch (Throwable e) {
            System.err.print(e);
        }
    }

    public void invocaMetodos() {
        Pessoa pessoa = new Pessoa("Thiago Almeida", 22, "cpf-Ficticio", "rg-Ficticio");
        try {

            Class cl = Class.forName("JavaReflection.Pessoa");
            Field[] fi = cl.getDeclaredFields();
            Method[] met = cl.getDeclaredMethods();
            for (int g = 0; g < met.length; g++) {
                System.out.println(fi[g].getName() + ": " + met[g].invoke(pessoa));
            }

        } catch (Throwable e) {
            System.err.print(e);
        }
    }
}