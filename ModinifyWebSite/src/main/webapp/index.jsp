<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!-->
<html class="no-js"> <!--<![endif]--> 
<%@page import="java.util.Locale"%>
<%@page import="java.util.ResourceBundle"%>
<%@page import="com.modinify.messages.MessageBundle;" %>

<%
	Locale locale = request.getLocale();
	// This is an example how to set manually locale
	// locale = new Locale("pt", "BR");
	ResourceBundle bundle = ResourceBundle.getBundle("com.modinify.messages.index", locale);
%>


<head>
    <meta charset="iso-8859-1">
    <title><%=bundle.getString(MessageBundle.INDEX_TITLE)%></title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta property="og:image" content=""/>

    <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->

    <!-- Styles -->
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" type="text/css" href="css/main.css">

    <!-- Scripts Header -->
    <script src="//cdnjs.cloudflare.com/ajax/libs/modernizr/2.6.2/modernizr.js"></script>
</head>
<body>
        <!--[if lt IE 7]>
            <p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
            <![endif]-->

            <!-- Add your site or application content here -->
            <div id="wrapper">
                <section id="home">
                    <div class="wrap">
                        <nav class="menu">
                            <ul>
                                <li>
                                    <a href="#/home" title="">
                                        <span><%=bundle.getString(MessageBundle.INDEX_HOME)%></span>
                                        <div class="progress-bar">
                                            <div class="prog prog-home"></div>
                                        </div>
                                    </a>
                                </li>
                                <li>
                                    <a href="#/sobre" title="">
                                        <span><%=bundle.getString(MessageBundle.INDEX_ABOUT)%></span>
                                        <div class="progress-bar">
                                            <div class="prog prog-sobre"></div>
                                        </div>
                                    </a>
                                </li>
                                <li>
                                    <a href="#/servico" title="">
                                        <span><%=bundle.getString(MessageBundle.INDEX_SERVICES)%></span>
                                        <div class="progress-bar">
                                            <div class="prog prog-servico"></div>
                                        </div>
                                    </a>
                                </li>
                                <li>
                                    <a href="#/contato" title="">
                                        <span><%=bundle.getString(MessageBundle.INDEX_CONTACT)%></span>
                                        <div class="progress-bar">
                                            <div class="prog prog-contato"></div>
                                        </div>
                                    </a>
                                </li>
                            </ul>
                        </nav>
                        <div class="title">
                            <h1><%=bundle.getString(MessageBundle.INDEX_TITLE)%></h1>
                        </div>
                        <h2><%=bundle.getString(MessageBundle.BODY_DISPLAY)%></h2>
                        <div class="tools">
                            <ul>
                                <li><img src="img/logo1-tool.jpg" alt=""></li>
                                <li><img src="img/logo2-tool.jpg" alt=""></li>
                                <li><img src="img/logo3-tool.jpg" alt=""></li>
                                <li><img src="img/logo4-tool.jpg" alt=""></li>
                                <li><img src="img/logo5-tool.jpg" alt=""></li>
                                <li><img src="img/logo6-tool.jpg" alt=""></li>
                                <li><img src="img/logo7-tool.jpg" alt=""></li>
                            </ul>
                        </div>
                        <div class="bg-mod"></div>
                    </div>
                    <div class="faixa-azul"></div>
                    <div class="faixa-branca"></div>
                </section>
                <div class="wrap">
                    <section id="sobre">
                        <header>
                            <h1><%=bundle.getString(MessageBundle.INDEX_ABOUT)%></h1>
                            <nav class="menu">
                                <ul>
                                    <li>
                                        <a href="#/home" title="">
                                            <span><%=bundle.getString(MessageBundle.INDEX_HOME)%></span>
                                            <div class="progress-bar">
                                                <div class="prog prog-home"></div>
                                            </div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#/sobre" title="">
                                            <span><%=bundle.getString(MessageBundle.INDEX_ABOUT)%></span>
                                            <div class="progress-bar">
                                                <div class="prog prog-sobre"></div>
                                            </div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#/servico" title="">
                                            <span><%=bundle.getString(MessageBundle.INDEX_SERVICES)%></span>
                                            <div class="progress-bar">
                                                <div class="prog prog-servico"></div>
                                            </div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#/contato" title="">
                                            <span><%=bundle.getString(MessageBundle.INDEX_SERVICES)%>
                                            <div class="progress-bar">
                                                <div class="prog prog-contato"></div>
                                            </div>
                                        </a>
                                    </li>
                                </ul>
                            </nav>
                        </header>
                        <p class="p-1">
				<span><%=bundle.getString(MessageBundle.BODY_ABOUT1)%></span>
                        </p>
                        <div class="wrap-social">
                            <div class="id-social">
                                <img src="img/foto-richard.png" alt="Richard Ferraresi">
                                <h1>Richard<br />
                                    Ferraresi
                                </h1>
                                <ul>
                                    <li><a class="social sc-fb" href="https://www.facebook.com/richard.ferraresi" target="_blank" title="Facebook"></a></li>
                                    <li><a class="social sc-tt" href="https://twitter.com/rferraresi" target="_blank" title="Twitter"></a></li>
                                    <li><a class="social sc-in" href="http://www.linkedin.com/profile/view?id=5113608" target="_blank" title="LinkedIn"></a></li>
                                </ul>
                            </div>

                            <div class="id-social">
                                <img src="img/foto-aline.png" alt="Aline Borges">
                                <h1>Aline<br />
                                    Borges</h1>
                                    <ul>
                                        <li><a class="social sc-fb" href="https://www.facebook.com/aline.borges.359126" target="_blank" title="Facebook"></a></li>
                                        <li><a class="social sc-tt" href="https://twitter.com/alinebrb80/" target="_blank" title="Twitter"></a></li>
                                        <li><a class="social sc-in" href="http://www.linkedin.com/profile/view?id=51049056" target="_blank" title="LinkedIn"></a></li>
                                    </ul>
                                </div>
                                <p class="p-2">Fundada pelos brasileiros Richard Ferraresi e Aline Borges, a Mod! foi criada na Índia para atender as necessidades do mercado brasileiro. Acreditamos que nosso maior diferencial É a presença de um dos acionistas baseado na Índia e outro no Brasil.
                          </p>
                                <p class="p-2 not">
                                    Somente dessa forma, conseguimos fornecer produtos e serviços com o DNA brasileiro e voltado para as nossas necessidades.
                                </p>
                            </div>
                            <div class="bg-mod"></div>
                        </section>
                    </div>
                    <section id="servico">
                        <div class="wrap">
                            <header>
                                <h1><span><%=bundle.getString(MessageBundle.INDEX_SERVICES)%></span></h1>
                                <nav class="menu">
                                    <ul>
                                        <li>
                                            <a href="#/home" title="">
                                                <span> <span><%=bundle.getString(MessageBundle.INDEX_HOME)%></span></span>
                                                <div class="progress-bar">
                                                    <div class="prog prog-home"></div>
                                                </div>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="#/sobre" title="">
                                                <span><%=bundle.getString(MessageBundle.INDEX_ABOUT)%></span>
                                                <div class="progress-bar">
                                                    <div class="prog prog-sobre"></div>
                                                </div>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="#/servico" title="">
                                                <span><%=bundle.getString(MessageBundle.INDEX_SERVICES)%></span>
                                                <div class="progress-bar">
                                                    <div class="prog prog-servico"></div>
                                                </div>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="#/contato" title="">
                                                <span> <span><%=bundle.getString(MessageBundle.INDEX_HOME)%></span></span>
                                                <div class="progress-bar">
                                                    <div class="prog prog-contato"></div>
                                                </div>
                                            </a>
                                        </li>
                                    </ul>
                                </nav>
                            </header>
                            <div class="box-recursos">
                                <h2>A importação de um jeito que funciona.</h2>
                                <div class="rec-fabrica">
                                    <h3>
                                        Fábrica brasileira de<br />
                                        códigos na Índia
                                    </h3>
                                    <img src="img/img1-service.png" alt="Fábrica brasileira de códigos na Índia" />
                                </div>
                                <div class="rec-atendimento">
                                    <h3>
                                        Atendimento no Brasil e <br />
                                        suporte brasileiro na Índia
                                    </h3>
                                    <img src="img/img2-service.png" alt="Atendimento no Brasil e suporte brasileiro na Índia" />
                                </div>
                                <div class="rec-codigo">
                                    <h3>
                                        Códigos indianos com<br />
                                        qualidade brasileira
                                    </h3>
                                    <img src="img/img3-service.png" alt="Códigos indianos com qualidade brasileira" />
                                </div>
                            </div>
                            <div class="qualidades">
                                <h1>Ampla oferta de profissionais qualificados, com disponibilidade imediata.</h1>
                                <article class="transformar">
                                    <h1>
                                        Transformar custo<br />
                                        fixo em variável
                                    </h1>
                                </article>
                                <article class="solucao">
                                    <h1>
                                        Solução inovadora<br />
                                        e inteligente
                                    </h1>
                                </article>
                            </div>
                            <div class="seta"></div>
                        </div>
                        <div class="faixa-cinza"></div>
                    </section>
                    <div class="wrap">
                        <section id="contato">
                            <header>
                                <h1> <span><%=bundle.getString(MessageBundle.INDEX_CONTACT)%></span></h1>
                                <nav class="menu">
                                    <ul>
                                        <li>
                                            <a href="#/home" title="">
                                                <span> <span><%=bundle.getString(MessageBundle.INDEX_HOME)%></span></span>
                                                <div class="progress-bar">
                                                    <div class="prog prog-home"></div>
                                                </div>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="#/sobre" title="">
                                                 <span><%=bundle.getString(MessageBundle.INDEX_ABOUT)%></span>
                                                <div class="progress-bar">
                                                    <div class="prog prog-sobre"></div>
                                                </div>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="#/servico" title="">
                                                 <span><%=bundle.getString(MessageBundle.INDEX_SERVICES)%></span>
                                                <div class="progress-bar">
                                                    <div class="prog prog-servico"></div>
                                                </div>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="#/contato" title="">
                                                 <span><%=bundle.getString(MessageBundle.INDEX_CONTACT)%></span>
                                                <div class="progress-bar">
                                                    <div class="prog prog-contato"></div>
                                                </div>
                                            </a>
                                        </li>
                                    </ul>
                                </nav>
                            </header>
                            <div class="titles">
                                <h1>Agende uma visita</h1>
                                <h2>Entre em contato conosco ou venha nos visitar:</h2>
                            </div>
                            <div class="info-contato">
                                <ul>
                                    <li class="pais">Brasil</li>
                                    <li class="endereco">Avenida Angélica, 2223 - Sala 802</li>
                                    <li class="endereco">Consolação - CEP 01227-200</li>
                                    <li class="estado">São Paulo - SP</li>
                                    <li class="telefone">11 3455-7547</li>
                                    <li class="email">contato@modinify.com</li>
                                </ul>
                            </div>
                            <div class="info-contato2">
                                <ul>
                                    <li class="pais">INDIA</li>
                                    <li class="endereco">Azad Road</li>
                                    <li class="endereco">Kaloor, Cochin-17</li>
                                    <li class="estado">Kerala, 682017</li>
                                    <li class="telefone">+91 7561 810919</li>
                                    <li class="email">contact@modinify.com</li>
                                </ul>
                          </div>
                            <div class="bg-mod"></div>
                            <div class="seta"></div>
                        </section>
                    </div>
                </div>
                <!-- Scripts Footer -->
                <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
                <script src="js/vendor/jquery.easing.1.3.js"></script>
                <script src="js/main.js"></script>

                <!-- Google Analytics: change UA-XXXXX-X to be your site's ID. -->
                <script>
                    (function(b,o,i,l,e,r){b.GoogleAnalyticsObject=l;b[l]||(b[l]=
                        function(){(b[l].q=b[l].q||[]).push(arguments)});b[l].l=+new Date;
                    e=o.createElement(i);r=o.getElementsByTagName(i)[0];
                    e.src='//www.google-analytics.com/analytics.js';
                    r.parentNode.insertBefore(e,r)}(window,document,'script','ga'));
                    ga('create','UA-XXXXX-X');ga('send','pageview');
                </script>
            </body>
            </html>
