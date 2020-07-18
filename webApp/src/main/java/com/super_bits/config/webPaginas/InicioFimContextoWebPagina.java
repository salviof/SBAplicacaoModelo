/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.config.webPaginas;

import com.super_bits.InomeClienteI.InomeProjetoI.model.config.ConfigPersistenciaInomeProjetoI;
import com.super_bits.modulosSB.Persistencia.ConfigGeral.SBPersistencia;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.webPaginas.ConfigGeral.ConfiguradorCoreDeProjetoWebWarAbstrato;
import com.super_bits.modulosSB.webPaginas.ConfigGeral.ItfInicioFimAppWP;
import com.super_bits.modulosSB.webPaginas.ConfigGeral.SBWebPaginas;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.coletivojava.fw.api.tratamentoErros.FabErro;

/**
 *
 * @author Salvio
 */
public class InicioFimContextoWebPagina implements ItfInicioFimAppWP {

    @Override
    public void inicio() {
        SBCore.configurar(new ConfiguradorCoreWebAppInomeProjetoI(ConfiguradorCoreDeProjetoWebWarAbstrato.contextoDoServlet), SBCore.ESTADO_APP.HOMOLOGACAO);
        SBPersistencia.configuraJPA(new ConfigPersistenciaInomeProjetoI());
        try {
            SBWebPaginas.configurar(new ConfigWPInomeProjetoI());
        } catch (IOException ex) {
            SBCore.RelatarErro(FabErro.PARA_TUDO, "Erro definindo configuração de webpagina", ex);
        }

    }

    @Override
    public void fim() {
        System.out.println("FIm do contexto para" + SBCore.getNomeProjeto());
    }

}
