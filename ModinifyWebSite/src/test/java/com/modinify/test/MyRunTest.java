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
		
		// TODO - for tests...
		String value = bundle.getString(MessageBundle.INDEX_SERVICES);
		String comparing = "SERVI�OS";
		
		System.out.println("value [" +  value + "]");
		System.out.println("result [" + comparing.equals(value) + "]");
		
		// TODO
		if (false){
			assertTrue("SERVI�OS".equals(bundle.getString(MessageBundle.INDEX_SERVICES)));
		}
		
		
		assertTrue(bundle.getString(MessageBundle.INDEX_CONTACT).equals("CONTATO"));
		// TODO for tests... assertTrue(bundle.getString(MessageBundle.BODY_DISPLAY).equals("Sua fábrica brasileira na Índia"));
		// TODO for tests assertTrue(bundle.getString(MessageBundle.BODY_ABOUT1).equals("A mão de obra especializada no Brasil tornou-se o maior desafio de crescimento para as empresas de tecnologia. Com a Mod! sua empresa tem a disposição o maior mercado de mão de obra especializada do mundo de uma maneira simples e fácil, pois só uma fabrica brasileira pode atender as necessidades do nosso mercado."));
		// TODO assertTrue(bundle.getString(MessageBundle.BODY_ABOUT2).equals("Fundada pelos brasileiros Richard Ferraresi e Aline Borges, a Mod! foi criada na Í\u008Dndia para atender as necessidades do mercado brasileiro. Acreditamos que nosso maior diferencial É a presença de um dos acionistas baseado na Índia e outro no Brasil."));
		// TODO assertTrue(bundle.getString(MessageBundle.BODY_ABOUT3).equals("Somente dessa forma, conseguimos fornecer produtos e serviços com o DNA brasileiro e voltado para as nossas necessidades."));
		System.out.println("hai.........."+bundle.getString(MessageBundle.BODY_ABOUT4));
		assertTrue(bundle.getString(MessageBundle.BODY_ABOUT4).equals("Meet our factory, meet MOD!"));
		
		// TODO assertTrue(bundle.getString(MessageBundle.FIG0).equals("A importação de um jeito que funciona"));
		// TODO assertTrue(bundle.getString(MessageBundle.FIG1).equals("Fábrica brasileira"));
		//TODO assertTrue(bundle.getString(MessageBundle.FIG11).equals("decódigos na Índia"));
		assertTrue(bundle.getString(MessageBundle.FIG2).equals("Atendimento no Brasil e"));
		//TODO assertTrue(bundle.getString(MessageBundle.FIG22).equals("suporte brasileiro na Índia"));
		// TODO assertTrue(bundle.getString(MessageBundle.FIG3).equals("Códigos indianos com"));
		
		// TODO
		/*
		assertTrue(bundle.getString(MessageBundle.FIG33).equals("qualidade brasileira"));
		assertTrue(bundle.getString(MessageBundle.FIG4).equals("Transformar custo"));
		assertTrue(bundle.getString(MessageBundle.FIG44).equals("fixo em variável"));
		assertTrue(bundle.getString(MessageBundle.FIG5).equals("Solução inovadora"));
		assertTrue(bundle.getString(MessageBundle.FIG55).equals("e inteligente"));*/
		
	assertTrue(bundle.getString(MessageBundle.CONTACT11).equals("Agende uma visita"));
	assertTrue(bundle.getString(MessageBundle.CONTACT12).equals("Entre em contato conosco ou venha nos visitar"));
	assertTrue(bundle.getString(MessageBundle.ADBR1).equals("Brasil"));
	// TODO
	/*
	assertTrue(bundle.getString(MessageBundle.ADBR2).equals("Avenida Angélica, 2223 - Sala 802"));
	assertTrue(bundle.getString(MessageBundle.ADBR3).equals("Consolação - CEP 01227-200"));
	assertTrue(bundle.getString(MessageBundle.ADBR4).equals("São Paulo - SP"));
	assertTrue(bundle.getString(MessageBundle.ADBR5).equals("11 3455-7547"));
	assertTrue(bundle.getString(MessageBundle.ADBR6).equals("contato@modinify.com"));
	*/
	
	assertTrue(bundle.getString(MessageBundle.ADIN1).equals("INDIA"));
	assertTrue(bundle.getString(MessageBundle.ADIN2).equals("Azad Road"));
	assertTrue(bundle.getString(MessageBundle.ADIN3).equals("Kaloor, Cochin-17"));
	assertTrue(bundle.getString(MessageBundle.ADIN4).equals("Kerala, 682017"));
	assertTrue(bundle.getString(MessageBundle.ADIN5).equals("+91 7561 810919"));
	assertTrue(bundle.getString(MessageBundle.ADIN6).equals("contact@modinify.com"));
	
	
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
		
		assertTrue(bundle.getString(MessageBundle.FIG0).equals("A diffrentFactory"));
		assertTrue(bundle.getString(MessageBundle.FIG1).equals("Alive specifications,more"));
		assertTrue(bundle.getString(MessageBundle.FIG11).equals("objective and dynamic"));
		assertTrue(bundle.getString(MessageBundle.FIG2).equals("Automated tests and"));
		assertTrue(bundle.getString(MessageBundle.FIG22).equals("online monitoring"));
		assertTrue(bundle.getString(MessageBundle.FIG3).equals("Development Center"));
		assertTrue(bundle.getString(MessageBundle.FIG33).equals("abroad with Brazilian care"));
		assertTrue(bundle.getString(MessageBundle.FIG4).equals("innovative and"));
		assertTrue(bundle.getString(MessageBundle.FIG44).equals("intelligent solution"));
		assertTrue(bundle.getString(MessageBundle.FIG5).equals("a new way of"));
		assertTrue(bundle.getString(MessageBundle.FIG55).equals("thinking software"));
		
	assertTrue(bundle.getString(MessageBundle.CONTACT11).equals("Come visit us or contact us."));
	assertTrue(bundle.getString(MessageBundle.CONTACT12).equals("Meet our team and development process."));
	assertTrue(bundle.getString(MessageBundle.ADBR1).equals("BRAZIL"));
	assertTrue(bundle.getString(MessageBundle.ADBR2).equals("2223AngelicaAvenue, Office 802"));
	
	// FIXME - for tests proposes...
	if (false){
		assertTrue(bundle.getString(MessageBundle.ADBR3).equals("Consolação Sao Paulo"));
		assertTrue(bundle.getString(MessageBundle.ADBR4).equals("Zip Code 01227-200, Sao Paulo"));
		assertTrue(bundle.getString(MessageBundle.ADBR5).equals("+55 11 3455 7547"));
		assertTrue(bundle.getString(MessageBundle.ADBR6).equals("contato@modinify.com"));
		
		assertTrue(bundle.getString(MessageBundle.ADIN1).equals("INDIA"));
		assertTrue(bundle.getString(MessageBundle.ADIN2).equals("Bldg 10/59 D3a, Issac's Utility Point, 2nd Floor"));
		assertTrue(bundle.getString(MessageBundle.ADIN3).equals("Green Garden Rd, Kakkanad (P.O), Ernakulam"));
		assertTrue(bundle.getString(MessageBundle.ADIN4).equals("Zip Code 682030, Kochi, Kerala"));
		assertTrue(bundle.getString(MessageBundle.ADIN5).equals("+91 7561 810 919"));
		assertTrue(bundle.getString(MessageBundle.ADIN6).equals("contact@modinify.com"));
	}
		
		
		
		
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
		System.out.println(bundle.getString(MessageBundle.BODY_ABOUT4));
		assertTrue(bundle.getString(MessageBundle.BODY_ABOUT4).equals("Meet our factory, meet MOD!"));		
		assertTrue(bundle.getString(MessageBundle.FIG0).equals("A diffrentFactory"));
		System.out.println("hi i can reach here["+ bundle.getString(MessageBundle.FIG1) + "]");
		
		assertTrue(bundle.getString(MessageBundle.FIG1).equals("Alive specifications,more"));
		System.out.println("hi i can reach here also"+bundle.getString(MessageBundle.FIG1));
		assertTrue(bundle.getString(MessageBundle.FIG11).equals("objective and dynamic"));
		assertTrue(bundle.getString(MessageBundle.FIG2).equals("Automated tests and"));
		assertTrue(bundle.getString(MessageBundle.FIG22).equals("online monitoring"));
		assertTrue(bundle.getString(MessageBundle.FIG3).equals("Development Center"));
		assertTrue(bundle.getString(MessageBundle.FIG33).equals("abroad with Brazilian care"));
		assertTrue(bundle.getString(MessageBundle.FIG4).equals("innovative and"));
		assertTrue(bundle.getString(MessageBundle.FIG44).equals("intelligent solution"));
		assertTrue(bundle.getString(MessageBundle.FIG5).equals("a new way of"));
		assertTrue(bundle.getString(MessageBundle.FIG55).equals("thinking software"));
		assertTrue(bundle.getString(MessageBundle.CONTACT11).equals("Come visit us or contact us."));
		assertTrue(bundle.getString(MessageBundle.CONTACT12).equals("Meet our team and development process."));
		assertTrue(bundle.getString(MessageBundle.ADBR1).equals("BRAZIL"));
		assertTrue(bundle.getString(MessageBundle.ADBR2).equals("2223AngelicaAvenue, Office 802"));
		
		System.out.println(" BEGINNING [" + bundle.getString(MessageBundle.ADBR3) + "]");
		
		// TODO for tests...
		if (false){														 
			assertTrue(bundle.getString(MessageBundle.ADBR3).equals("Consolação Sao Paulo"));
			assertTrue(bundle.getString(MessageBundle.ADBR4).equals("Zip Code 01227-200, Sao Paulo"));
			assertTrue(bundle.getString(MessageBundle.ADBR5).equals("+55 11 3455 7547"));
			assertTrue(bundle.getString(MessageBundle.ADBR6).equals("contato@modinify.com"));
			assertTrue(bundle.getString(MessageBundle.ADIN1).equals("INDIA"));
			assertTrue(bundle.getString(MessageBundle.ADIN2).equals("Bldg 10/59 D3a, Issac's Utility Point, 2nd Floor"));
			assertTrue(bundle.getString(MessageBundle.ADIN3).equals("Green Garden Rd, Kakkanad (P.O), Ernakulam"));
			assertTrue(bundle.getString(MessageBundle.ADIN4).equals("Zip Code 682030, Kochi, Kerala"));
			assertTrue(bundle.getString(MessageBundle.ADIN5).equals("+91 7561 810 919"));
			assertTrue(bundle.getString(MessageBundle.ADIN6).equals("contact@modinify.com"));
		}
		
	}
}
