package com.modinify.test;

import static org.junit.Assert.assertTrue;

import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.Test;

import com.modinify.messages.MessageBundle;

public class MyRunTest {

	@Test
	public void checkingBrazilianBundle(){
		Locale locale = new Locale("pt", "BR");
		ResourceBundle bundle = ResourceBundle.getBundle("com.modinify.messages.index", locale);
		
		assertTrue(bundle.getString(MessageBundle.INDEX_TITLE).equals("Mod! Brasil"));
		assertTrue(bundle.getString(MessageBundle.INDEX_HOME).equals("HOME"));
		assertTrue(bundle.getString(MessageBundle.INDEX_ABOUT).equals("SOBRE"));
		assertTrue(bundle.getString(MessageBundle.INDEX_SERVICES).equals("SERVIÇOS"));
		assertTrue(bundle.getString(MessageBundle.INDEX_CONTACT).equals("CONTATO"));
		assertTrue(bundle.getString(MessageBundle.BODY_DISPLAY).equals("Sua fábrica brasileira na Índia"));
		assertTrue(bundle.getString(MessageBundle.BODY_ABOUT1).equals("A mão de obra especializada no Brasil tornou-se o maior desafio de crescimento para as empresas de tecnologia. Com a Mod! sua empresa tem a disposição o maior mercado de mão de obra especializada do mundo de uma maneira simples e fácil, pois só uma fabrica brasileira pode atender as necessidades do nosso mercado."));
		assertTrue(bundle.getString(MessageBundle.BODY_ABOUT2).equals("Fundada pelos brasileiros Richard Ferraresi e Aline Borges, a Mod! foi criada na Í\u008Dndia para atender as necessidades do mercado brasileiro. Acreditamos que nosso maior diferencial É a presença de um dos acionistas baseado na Índia e outro no Brasil."));
		assertTrue(bundle.getString(MessageBundle.BODY_ABOUT3).equals("Somente dessa forma, conseguimos fornecer produtos e serviços com o DNA brasileiro e voltado para as nossas necessidades."));
		assertTrue(bundle.getString(MessageBundle.BODY_ABOUT4).equals("A importação de um jeito que funciona"));
	}
	
	
	@Test
	public void checkingDefaultBundle(){
		Locale locale = new Locale("", "");
		ResourceBundle bundle = ResourceBundle.getBundle("com.modinify.messages.index", locale);
		
		assertTrue(bundle.getString(MessageBundle.INDEX_TITLE).equals("Modinify"));
		assertTrue(bundle.getString(MessageBundle.INDEX_HOME).equals("HOME"));
		assertTrue(bundle.getString(MessageBundle.INDEX_ABOUT).equals("ABOUT"));
		assertTrue(bundle.getString(MessageBundle.INDEX_SERVICES).equals("SERVICES"));
		assertTrue(bundle.getString(MessageBundle.INDEX_CONTACT).equals("CONTACT"));
		assertTrue(bundle.getString(MessageBundle.BODY_DISPLAY).equals("Your new factory solutions"));
		assertTrue(bundle.getString(MessageBundle.BODY_ABOUT1).equals("Systems development, changes and new features need to be delivered meeting the clients needs and not technology premises. In addition, quality should be the basis of everything and not a differential.However, the traditional software development models did not follow the trends and current market needs."));
		assertTrue(bundle.getString(MessageBundle.BODY_ABOUT2).equals("Thinking about it, Richard Ferraresi and Aline Borges have created a structure with factories and units abroad Brazil, applying agility concepts, with short deliveries and more customer interaction, supplemented by automated tests and monitoring tools, bringing more quality."));
		assertTrue(bundle.getString(MessageBundle.BODY_ABOUT3).equals("It is a different and modern factory, which follows new trends and, above all, the time of marketing of our clients, with quality and efficiency"));
		assertTrue(bundle.getString(MessageBundle.BODY_ABOUT4).equals("Meet our factory, meet MOD!"));
		
	}
	@Test
	public void checkingUSBundle(){
		Locale locale = new Locale("en", "US");
		ResourceBundle bundle = ResourceBundle.getBundle("com.modinify.messages.index", locale);
		
		assertTrue(bundle.getString(MessageBundle.INDEX_TITLE).equals("Mod!"));
		//assertTrue(bundle.getString(MessageBundle.INDEX_TITLE).equals("HOME"));
		assertTrue(bundle.getString(MessageBundle.INDEX_HOME).equals("HOME"));
		assertTrue(bundle.getString(MessageBundle.INDEX_ABOUT).equals("ABOUT"));
		assertTrue(bundle.getString(MessageBundle.INDEX_SERVICES).equals("SERVICES"));
		assertTrue(bundle.getString(MessageBundle.INDEX_CONTACT).equals("CONTACT"));
		assertTrue(bundle.getString(MessageBundle.BODY_DISPLAY).equals("Your new factory solutions"));
		assertTrue(bundle.getString(MessageBundle.BODY_ABOUT1).equals("Systems development, changes and new features need to be delivered meeting the clients needs and not technology premises. In addition, quality should be the basis of everything and not a differential.However, the traditional software development models did not follow the trends and current market needs."));
		assertTrue(bundle.getString(MessageBundle.BODY_ABOUT2).equals("Thinking about it, Richard Ferraresi and Aline Borges have created a structure with factories and units abroad Brazil, applying agility concepts, with short deliveries and more customer interaction, supplemented by automated tests and monitoring tools, bringing more quality."));
		assertTrue(bundle.getString(MessageBundle.BODY_ABOUT3).equals("It is a different and modern factory, which follows new trends and, above all, the time of marketing of our clients, with quality and efficiency"));
		assertTrue(bundle.getString(MessageBundle.BODY_ABOUT4).equals("Meet our factory, meet MOD!"));
	}
}
