/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.InomeClienteI.InomeProjetoI.regras_de_negocio_e_controller.modulos;

import com.super_bits.modulos.SBAcessosModel.model.ModuloAcaoSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.modulo.ItfFabricaModulo;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabrica;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoCampo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoObjetoSB;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabTipoAtributoObjeto;
import javax.persistence.Entity;

/**
 *
 * @author desenvolvedor
 */
@Entity
@InfoObjetoSB(tags = "Modulo do Projeto INomeDoProjetoI", plural = "modulos")
public class ModuloINomeDoProjetoI extends ModuloAcaoSistema {

    @InfoCampo(tipo = FabTipoAtributoObjeto.ENUM_FABRICA)
    private FabModulosIProjetoTesteI fabModulo;

    @Override
    public ItfFabricaModulo getEnumVinculado() {
        return fabModulo;
    }

    @Override
    public void setEnumVinculado(ItfFabrica pFabrica) {
        fabModulo = (FabModulosIProjetoTesteI) pFabrica;
    }

}
