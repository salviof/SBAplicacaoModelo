/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.InomeClienteI.InomeProjetoI.regras_de_negocio_e_controller.modulos;

import com.super_bits.InomeClienteI.InomeProjetoI.regras_de_negocio_e_controller.FabMenuExemplo;
import com.super_bits.modulos.SBAcessosModel.model.ModuloAcaoSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.ItfModuloAcaoSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.modulo.ItfFabricaModulo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoObjetoDaFabrica;
import com.super_bits.modulosSB.SBCore.modulos.view.menu.ItfFabricaMenu;

/**
 *
 *
 * ARQUIVO DE EXEMPLO, PARA INICIO DE APLICAÇÃO.
 *
 * REFATORE ESTA CLASSE COM OS MODULOS DO SEU SISTEMA
 *
 *
 * @author Salvio Furbino
 */
public enum FabModulosIProjetoTesteI implements ItfFabricaModulo {
    @InfoObjetoDaFabrica(nomeObjeto = "Modulo demonstração", classeObjeto = ModuloInomeProjetoI.class)
    DEMONSTRACAO_BASICA,
    @InfoObjetoDaFabrica(nomeObjeto = "Modulo Acesso Restrito", classeObjeto = ModuloInomeProjetoI.class)
    DEMONSTRACAO_ACESSO_RESTRITO;

    @Override
    public ItfFabricaMenu getMenuPadrao() {
        return FabMenuExemplo.MENU_INICIAL;
    }
}
