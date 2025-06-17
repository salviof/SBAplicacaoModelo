/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.InomeClienteI.InomeProjetoI.regras_de_negocio_e_controller;

import com.super_bits.modulos.SBAcessosModel.fabricas.acoesDemonstracao.FabAcaoDemonstracaoSB;
import com.super_bits.modulos.SBAcessosModel.model.acoes.AcaoDoSistema;
import com.super_bits.modulosSB.SBCore.modulos.view.menu.ItfFabricaMenu;
import com.super_bits.modulosSB.SBCore.modulos.view.menu.ItfMenuSB;

import java.util.ArrayList;
import java.util.List;
import org.coletivojava.fw.api.objetoNativo.view.menu.MenuSBFW;
import org.coletivojava.fw.api.objetoNativo.view.menu.SessaoMenuSB;

/**
 *
 * FAbricas de menu, devem ser usadas para construção de menus do sistema.
 *
 * Voce pode adicionar sessoes e ações no menu
 *
 *
 * @author desenvolvedor
 */
public enum FabMenuExemplo implements ItfFabricaMenu {
    MENU_INICIAL, MENU_RESTRITO;

    @Override
    public List<ItfMenuSB> getTodosMenus() {
        List<ItfMenuSB> menus = new ArrayList<>();
        for (ItfFabricaMenu menu : this.getClass().getEnumConstants()) {
            menus.add((ItfMenuSB) menu.getRegistro());
        }
        return menus;
    }

    @Override
    public ItfMenuSB getRegistro() {
        ItfMenuSB menu = new MenuSBFW();
        AcaoDoSistema acao = new AcaoDoSistema();
        acao.setNomeAcao("Exemplos do Framework");
        SessaoMenuSB sessaoVisaoGeral = new SessaoMenuSB(acao);
        sessaoVisaoGeral.addAcao(FabAcaoDemonstracaoSB.DEMONSTRACAO_MB_COMPONENTE.getRegistro());
        sessaoVisaoGeral.addAcao(FabAcaoDemonstracaoSB.DEMONSTRACAO_MB_VALIDACAO.getRegistro());
        menu.addSessao(sessaoVisaoGeral);
        switch (this) {
            case MENU_INICIAL:

                return menu;
            case MENU_RESTRITO:
                AcaoDoSistema acaosessao = new AcaoDoSistema();
                acaosessao.setNome("Permissões ");
                SessaoMenuSB adminUsuario = new SessaoMenuSB(acaosessao);
                //          adminUsuario.addAcao(FabAcaoSeguranca.GRUPO_MB_GERENCIAR.getRegistro());
                //        adminUsuario.addAcao(FabAcaoSeguranca.USUARIO_MB_GERENCIAR.getRegistro());
                menu.addSessao(adminUsuario);
                return menu;
            default:
                throw new AssertionError(this.name());

        }
    }

    @Override
    public ItfMenuSB getMenuPrincipal() {
        return MENU_INICIAL.getRegistro();
    }

    @Override
    public ItfMenuSB getMenuSecundario() {
        return MENU_INICIAL.getRegistro();
    }

}
