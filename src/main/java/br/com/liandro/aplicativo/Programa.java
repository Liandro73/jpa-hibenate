package br.com.liandro.aplicativo;

import br.com.liandro.dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo_jpa");
        EntityManager em = emf.createEntityManager();

        em.remove(new Pessoa());

        System.out.println("Pronto!");
        em.close();
        emf.close();

    }
}
