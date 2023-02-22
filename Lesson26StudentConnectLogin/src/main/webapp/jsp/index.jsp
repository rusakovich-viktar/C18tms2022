<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<html lang="ru" style="font-size: 16px;">
<head>
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta charset="utf-8">
    <meta content="" name="description">
    <title>Index</title>
    <link href="css/index.css" media="screen" rel="stylesheet">
    <link href="css/main.css" media="screen" rel="stylesheet">
    <script class="u-script" defer="" src="js/jquery-1.9.1.min.js" type="text/javascript"></script>
    <script class="u-script" defer="" src="js/nicepage.js" type="text/javascript"></script>
    <meta content="origin" name="referrer">
    <link href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i"
          id="u-theme-google-font" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Ubuntu:300,300i,400,400i,500,500i,700,700i|Oswald:200,300,400,500,600,700"
          id="u-page-google-font" rel="stylesheet">


    <script type="application/ld+json">{
        "@context": "http://schema.org",
        "@type": "Organization",
        "name": "WebSite4066966",
        "url": "/",
        "logo": "https://i.ibb.co/cxrCxyQ/pngegg.png"
    }</script>
    <meta content="#478ac9" name="theme-color">
    <meta content="Read" property="og:title">
    <meta content="" property="og:description">
    <meta content="website" property="og:type">
    <link href="/" rel="canonical">
    <meta data-intl-tel-input-cdn-path="intlTelInput/">
</head>
<body class="u-body u-xl-mode"
      data-home-page-title="index" data-lang="ru">
<jsp:include page="/jsp/header.jsp"/>
<section class="u-clearfix u-image u-section-1" id="sec-2d2a">
    <div class="u-clearfix u-sheet u-valign-bottom-lg u-valign-bottom-xl u-valign-middle-md u-valign-middle-sm u-valign-middle-xs u-sheet-1">
        <div class="u-clearfix u-expanded-width u-layout-wrap u-layout-wrap-1">
            <div class="u-layout">
                <div class="u-layout-row">
                    <div class="u-container-align-left u-container-style u-layout-cell u-left-cell u-size-30 u-layout-cell-1"
                         src="">
                        <div class="u-container-layout u-valign-middle u-container-layout-1">
                            <h3 class="u-align-left u-text u-text-body-alt-color u-text-default u-text-1"
                                data-animation-delay="500" data-animation-duration="1500"
                                data-animation-name="customAnimationIn" data-lang-en="Coaching center">Добрый
                                день <b><%= session.getAttribute("requestUsername")%>
                                </b></h3>
                            <h1 class="u-align-left u-custom-font u-font-ubuntu u-text u-text-body-alt-color u-text-2"
                                data-animation-delay="0" data-animation-duration="1500"
                                data-animation-name="customAnimationIn"> Вы
                                попали на странный сайт со списком студентов</h1>
                            <p class="u-align-left u-text u-text-body-alt-color u-text-3" data-animation-delay="250"
                               data-animation-duration="1500" data-animation-name="customAnimationIn">
                                Давайте посмотрим на список всех студентов</p>
                            <a class="u-active-palette-1-light-3 u-align-left u-border-none u-btn u-btn-round u-button-style u-hover-palette-1-light-3 u-radius-20 u-text-active-palette-1-base u-text-hover-palette-1-base u-white u-btn-1"
                               data-animation-delay="500" data-animation-duration="1500"
                               data-animation-name="customAnimationIn"
                               href="/get-students">All Students</a>
                        </div>
                    </div>
                    <div class="u-align-left u-container-align-center-sm u-container-align-center-xs u-container-style u-layout-cell u-right-cell u-size-30 u-layout-cell-2"
                         data-animation-duration="1500" data-animation-name="customAnimationIn">
                        <div class="u-container-layout u-valign-top u-container-layout-2">
                            <img alt="" class="u-expanded-width u-image u-image-default u-image-1"
                                 src="https://i.ibb.co/X34yvMJ/dswamin.png">
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<jsp:include page="/jsp/section-above-footer.jsp"/>
<jsp:include page="/jsp/footer.jsp"/>
</body>
</html>