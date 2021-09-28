/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laboratorio6;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



/**
 *
 * @author Felipe
 */
public class EXECCTest {
    EXECC emprestimo;
            
    public EXECCTest() {
        emprestimo = new EXECC();
    }

    @Test
    public void testEmprestimoValido() {
        System.out.println("Teste do Emprestimo VALIDO");
        
            assertEquals("Emprestimo Valido", emprestimo.aprovaEmprestimo(1001, "Sim", "Sim"));
            assertEquals("Emprestimo Valido", emprestimo.aprovaEmprestimo(1100, "Sim", "Nao"));
            assertEquals("Emprestimo Valido", emprestimo.aprovaEmprestimo(1500, "Nao", "Sim"));
            assertEquals("Emprestimo Valido", emprestimo.aprovaEmprestimo(2000, "Nao", "Nao"));
            assertEquals("Emprestimo Valido", emprestimo.aprovaEmprestimo(900, "Sim", "Sim"));
            assertEquals("Emprestimo Valido", emprestimo.aprovaEmprestimo(800, "Sim", "Nao"));
            assertEquals("Emprestimo Valido", emprestimo.aprovaEmprestimo(750, "Nao", "Sim"));
            assertEquals("Emprestimo Invalido", emprestimo.aprovaEmprestimo(500, "Nao", "Nao"));

    }
    
    @Test
    public void testEmprestimoInvalido() {
        System.out.println("Teste do Emprestimo Invalido");
        
            assertEquals("Emprestimo Valido", emprestimo.aprovaEmprestimo(1001, "Nao", "Nao"));
            assertEquals("Emprestimo Valido", emprestimo.aprovaEmprestimo(1002, "Nao", "Nao"));
            assertEquals("Emprestimo Invalido", emprestimo.aprovaEmprestimo(1000, "Nao", "Nao"));
            assertEquals("Emprestimo Invalido", emprestimo.aprovaEmprestimo(999, "Nao", "Nao"));
    }
 
}