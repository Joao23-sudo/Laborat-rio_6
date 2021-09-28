/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laboratorio6;


public class EXECC {
    public String aprovaEmprestimo(int mtInSalario, String mtInBomPag, String mtInCasoEsp){
        
        String mtOutResp = "";
        
        if (mtInSalario > 1000 || mtInBomPag == "Sim" || mtInCasoEsp == "Sim"){
            mtOutResp = "Emprestimo Valido";
        }
        else if (mtInSalario <= 1000 && mtInBomPag == "Nao" && mtInCasoEsp == "Nao"){
            mtOutResp = "Emprestimo Invalido";
        }
        
        return mtOutResp;
    }   
}

