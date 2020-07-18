/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.config.webPaginas;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormulario;
import com.super_bits.modulosSB.webPaginas.ConfigGeral.ConfiguradorWPPadraoArquivoConfiguracao;
import com.super_bits.modulosSB.webPaginas.controller.servletes.urls.parametrosURL.ParametroURL;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Salvio s
 */
public class ConfigWPInomeProjetoI extends ConfiguradorWPPadraoArquivoConfiguracao {

    public ConfigWPInomeProjetoI() throws IOException {
        super();
    }

    @Override
    public String SITE_HOST() {
        return "http://localhost:8080";
    }

    @Override
    public String pastaImagens() {
        return "/img";
    }

    @Override
    public String nomePacoteProjeto() {
        return "SuperBitsWebPaginasDemo";
    }

    @Override
    public String TituloAppWeb() {
        return "Super Bits WebPaginas Demo ShowCase";
    }

    @Override
    public String URLBASE() {
        return SITE_HOST() + "/" + nomePacoteProjeto();
    }

    @Override
    public boolean parametroDeAplicacaoEmSubDominio() {
        return false;
    }

    @Override
    public ItfAcaoFormulario getAcaoPaginaInicial() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ParametroURL> parametrosDeAplicacao() {
        return new ArrayList<>();
    }

    @Override
    public Class mapaSite() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
