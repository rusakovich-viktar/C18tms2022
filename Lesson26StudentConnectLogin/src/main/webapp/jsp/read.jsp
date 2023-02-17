<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="by.tms.model.Student " %>
<%@ page import="java.util.ArrayList" %>

<html lang="ru" style="font-size: 16px;">
<head>
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta charset="utf-8">
    <meta content="" name="description">
    <title>Read</title>
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
<body class="u-body u-xl-mode" data-lang="ru">
<header class="u-clearfix u-header u-header" id="sec-52ce">
    <div class="u-clearfix u-sheet u-valign-middle u-sheet-1">
        <a class="u-hover-feature u-image u-logo u-opacity u-opacity-75 u-image-1" data-image-height="3588"
           data-image-width="5382" href="/" title="index">
            <img class="u-logo-image u-logo-image-1"
                 src="https://i.ibb.co/cxrCxyQ/pngegg.png">
        </a>
        <nav class="u-menu u-menu-one-level u-offcanvas u-menu-1">
            <div class="menu-collapse"
                 style="font-size: 1rem; letter-spacing: 0px; text-transform: uppercase; font-weight: 500;">
                <a class="u-button-style u-custom-active-border-color u-custom-active-color u-custom-border u-custom-border-color u-custom-borders u-custom-hover-border-color u-custom-hover-color u-custom-left-right-menu-spacing u-custom-padding-bottom u-custom-text-active-color u-custom-text-color u-custom-text-decoration u-custom-text-hover-color u-custom-top-bottom-menu-spacing u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base"
                   data-lang-en="{&quot;content&quot;:&quot;<svg class=\&quot;u-svg-link\&quot; viewBox=\&quot;0 0 24 24\&quot;><use xlink:href=\&quot;#menu-hamburger\&quot;></use></svg><svg class=\&quot;u-svg-content\&quot; version=\&quot;1.1\&quot; id=\&quot;menu-hamburger\&quot; viewBox=\&quot;0 0 16 16\&quot; x=\&quot;0px\&quot; y=\&quot;0px\&quot; xmlns:xlink=\&quot;http://www.w3.org/1999/xlink\&quot; xmlns=\&quot;http://www.w3.org/2000/svg\&quot;>    <g>        <rect y=\&quot;1\&quot; width=\&quot;16\&quot; height=\&quot;2\&quot;></rect>        <rect y=\&quot;7\&quot; width=\&quot;16\&quot; height=\&quot;2\&quot;></rect>        <rect y=\&quot;13\&quot; width=\&quot;16\&quot; height=\&quot;2\&quot;></rect>    </g></svg>&quot;,&quot;href&quot;:&quot;#&quot;}"
                   href="#">
                    <svg class="u-svg-link" viewBox="0 0 24 24">
                        <use xlink:href="#menu-hamburger"></use>
                    </svg>
                    <svg class="u-svg-content" id="menu-hamburger" version="1.1" viewBox="0 0 16 16" x="0px"
                         xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" y="0px">
                        <g>
                            <rect height="2" width="16" y="1"></rect>
                            <rect height="2" width="16" y="7"></rect>
                            <rect height="2" width="16" y="13"></rect>
                        </g>
                    </svg>
                </a>
            </div>
            <div class="u-custom-menu u-nav-container">
                <ul class="u-nav u-spacing-2 u-unstyled u-nav-1">
                    <li class="u-nav-item"><a
                            class="u-active-palette-1-base u-border-active-palette-1-base u-border-hover-palette-1-light-1 u-border-no-left u-border-no-right u-border-no-top u-button-style u-hover-palette-1-light-1 u-nav-link u-text-active-white u-text-grey-90 u-text-hover-white"
                            href="/add-student" style="padding: 10px 20px;">Create</a>
                    </li>
                    <li class="u-nav-item"><a
                            class="u-active-palette-1-base u-border-active-palette-1-base u-border-hover-palette-1-light-1 u-border-no-left u-border-no-right u-border-no-top u-button-style u-hover-palette-1-light-1 u-nav-link u-text-active-white u-text-grey-90 u-text-hover-white"
                            href="<c:url value="/get-students"/>" style="padding: 10px 20px;">Read</a>
                    </li>
                    <li class="u-nav-item"><a
                            class="u-active-palette-1-base u-border-active-palette-1-base u-border-hover-palette-1-light-1 u-border-no-left u-border-no-right u-border-no-top u-button-style u-hover-palette-1-light-1 u-nav-link u-text-active-white u-text-grey-90 u-text-hover-white"
                            href="/update-student" style="padding: 10px 20px;">Update</a>
                    </li>
                    <li class="u-nav-item"><a
                            class="u-active-palette-1-base u-border-active-palette-1-base u-border-hover-palette-1-light-1 u-border-no-left u-border-no-right u-border-no-top u-button-style u-hover-palette-1-light-1 u-nav-link u-text-active-white u-text-grey-90 u-text-hover-white"
                            href="<c:url value="/delete-student"/>" style="padding: 10px 20px;">Delete</a>
                    </li>
                    <li class="u-nav-item"><a
                            class="u-active-palette-1-base u-border-active-palette-1-base u-border-hover-palette-1-light-1 u-border-no-left u-border-no-right u-border-no-top u-button-style u-hover-palette-1-light-1 u-nav-link u-text-active-white u-text-grey-90 u-text-hover-white"
                            href="/logout"
                            style="padding: 10px 20px;">Logout</a>
                    </li>
                </ul>
            </div>
            <div class="u-custom-menu u-nav-container-collapse">
                <div class="u-black u-container-style u-inner-container-layout u-opacity u-opacity-95 u-sidenav">
                    <div class="u-inner-container-layout u-sidenav-overflow">
                        <div class="u-menu-close"></div>
                        <ul class="u-align-center u-nav u-popupmenu-items u-unstyled u-nav-2">
                            <li class="u-nav-item"><a class="u-button-style u-nav-link"
                                                      href="/add-student">Create</a>
                            </li>
                            <li class="u-nav-item"><a class="u-button-style u-nav-link"
                                                      data-lang-en="{&quot;content&quot;:&quot;Главная&quot;,&quot;href&quot;:&quot;/Главная.html&quot;}"
                                                      href="/get-students">Read</a>
                            </li>
                            <li class="u-nav-item"><a class="u-button-style u-nav-link"
                                                      href="/update-student">Update</a>
                            </li>
                            <li class="u-nav-item"><a class="u-button-style u-nav-link"
                                                      href="/delete-student">Delete</a>
                            </li>
                            <li class="u-nav-item"><a class="u-button-style u-nav-link"
                                                      href="/logout">Logout</a>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="u-black u-menu-overlay u-opacity u-opacity-70"></div>
            </div>
        </nav>
    </div>
</header>

<section class="u-align-center u-clearfix u-image u-section-3" data-image-height="1134" data-image-width="1980"
         id="carousel_c4be">
    <div class="u-clearfix u-sheet u-sheet-1">
        <div class="u-table u-table-responsive u-table-1">
            <table class="u-table-entity u-table-entity-1">
                <colgroup>
                    <col width="19.3%">
                    <col width="18.3%">
                    <col width="24.2%">
                    <col width="9.9%">
                    <col width="18.3%">
                </colgroup>
                <thead class="u-palette-4-base u-table-header u-table-header-1">
                <tr style="height: 46px;">
                    <th class="u-border-1 u-border-palette-4-base u-table-cell">ID</th>
                    <th class="u-border-1 u-border-palette-4-base u-table-cell">Имя</th>
                    <th class="u-border-1 u-border-palette-4-base u-table-cell">Фамилия</th>
                    <th class="u-border-1 u-border-palette-4-base u-table-cell">Курс</th>
                    <th class="u-border-1 u-border-palette-4-base u-table-cell">Город</th>
                </tr>

                </thead>
                <%
                    ArrayList<Student> students = (ArrayList<Student>) request.getAttribute("studentList");
                    for (Student student : students) {
                %>
                <tbody class="u-table-body">
                <tr style="height: 73px;">

                    <td><%=student.getId()%>
                    </td>
                    <td><%=student.getName()%>
                    </td>
                    <td><%=student.getSurname()%>
                    </td>
                    <td><%=student.getCourse()%>
                    </td>
                    <td><%=student.getCity()%>
                    </td>
                </tr>
                <%}%>
                </tbody>
            </table>
        </div>
    </div>
</section>
<section class="skrollable skrollable-between u-align-center u-clearfix u-container-align-center u-image u-section-2"
         data-animation-delay="0" data-animation-direction="" data-animation-duration="0" data-animation-name=""
         data-image-height="1278" data-image-width="2500" id="carousel_801b">
    <div class="u-clearfix u-sheet u-sheet-1">
        <h2 class="u-text u-text-body-alt-color u-text-1" data-animation-delay="500" data-animation-duration="1500"
            data-animation-name="customAnimationIn" data-lang-en="Education and Learning">Education and Learning</h2>
        <p class="u-text u-text-body-alt-color u-text-default u-text-2" data-animation-delay="500"
           data-animation-duration="1500" data-animation-name="customAnimationIn"
           data-lang-en="Learning is something we do almost every day">Learning is something we do almost every day</p>
        <div class="u-expanded-width-md u-expanded-width-sm u-expanded-width-xs u-list u-list-1">
            <div class="u-repeater u-repeater-1">
                <div class="u-align-left u-container-style u-list-item u-palette-5-light-2 u-repeater-item u-list-item-1"
                     data-animation-delay="500" data-animation-duration="1500" data-animation-name="customAnimationIn">
                    <div class="u-container-layout u-similar-container u-valign-top u-container-layout-1">
                        <div class="u-align-center u-container-style u-group u-palette-1-base u-radius-50 u-shape-round u-group-1"
                             data-animation-delay="500" data-animation-duration="1500"
                             data-animation-name="customAnimationIn">
                            <div class="u-container-layout u-valign-middle u-container-layout-2">
                                <h2 class="u-custom-font u-font-oswald u-text u-text-body-alt-color u-text-3"
                                    data-lang-en="01">01</h2>
                            </div>
                        </div>
                        <h5 class="u-text u-text-4" data-lang-en="Teaching">Добавить студента в базу</h5>
                        <p class="u-text u-text-default u-text-5"
                           data-lang-en="Sample text. Click to select the text box. Click again or double click to start editing the text.">
                            Sample text. Тут будет описание функции ниже, но не сегодня, а когда-нибудь. </p>
                        <a class="u-active-none u-border-1 u-border-active-palette-2-base u-border-hover-palette-2-base u-border-no-left u-border-no-right u-border-no-top u-border-palette-1-base u-bottom-left-radius-0 u-bottom-right-radius-0 u-btn u-button-style u-hover-none u-none u-radius-0 u-text-body-color u-top-left-radius-0 u-top-right-radius-0 u-btn-1"
                           href="/add-student">Приступить</a>
                    </div>
                </div>
                <div class="u-align-left u-container-style u-list-item u-palette-5-light-2 u-repeater-item u-list-item-2"
                     data-animation-delay="500" data-animation-duration="1500" data-animation-name="customAnimationIn">
                    <div class="u-container-layout u-similar-container u-valign-top u-container-layout-3">
                        <div class="u-align-center u-container-style u-group u-palette-1-base u-radius-50 u-shape-round u-group-2"
                             data-animation-delay="500" data-animation-duration="1500"
                             data-animation-name="customAnimationIn">
                            <div class="u-container-layout u-valign-middle u-container-layout-4">
                                <h2 class="u-custom-font u-font-oswald u-text u-text-body-alt-color u-text-default u-text-6"
                                    data-lang-en="02">02</h2>
                            </div>
                        </div>
                        <h5 class="u-text u-text-7" data-lang-en="Innovations<br>">Получить список всех студентов<br>
                        </h5>
                        <p class="u-text u-text-default u-text-8"
                           data-lang-en="Sample text. Click to select the text box. Click again or double click to start editing the text.">
                            Sample text. Тут будет описание функции ниже, но не сегодня, а когда-нибудь. </p>
                        <a class="u-active-none u-border-1 u-border-active-palette-2-base u-border-hover-palette-2-base u-border-no-left u-border-no-right u-border-no-top u-border-palette-1-base u-bottom-left-radius-0 u-bottom-right-radius-0 u-btn u-button-style u-hover-none u-none u-radius-0 u-text-body-color u-top-left-radius-0 u-top-right-radius-0 u-btn-2"
                           href="/get-students">Приступить</a>
                    </div>
                </div>
                <div class="u-align-left u-container-style u-list-item u-palette-5-light-2 u-repeater-item u-list-item-3"
                     data-animation-delay="500" data-animation-duration="1500" data-animation-name="customAnimationIn">
                    <div class="u-container-layout u-similar-container u-valign-top u-container-layout-5">
                        <div class="u-align-center u-container-style u-group u-palette-1-base u-radius-50 u-shape-round u-group-3"
                             data-animation-delay="500" data-animation-duration="1500"
                             data-animation-name="customAnimationIn">
                            <div class="u-container-layout u-valign-middle u-container-layout-6">
                                <h2 class="u-custom-font u-font-oswald u-text u-text-body-alt-color u-text-default u-text-9"
                                    data-lang-en="03">03</h2>
                            </div>
                        </div>
                        <h5 class="u-text u-text-10" data-lang-en="Students">Обновить данные о студенте</h5>
                        <p class="u-text u-text-default u-text-11"
                           data-lang-en="Sample text. Click to select the text box. Click again or double click to start editing the text.">
                            Sample text. Тут будет описание функции ниже, но не сегодня, а когда-нибудь. </p>
                        <a class="u-active-none u-border-1 u-border-active-palette-2-base u-border-hover-palette-2-base u-border-no-left u-border-no-right u-border-no-top u-border-palette-1-base u-bottom-left-radius-0 u-bottom-right-radius-0 u-btn u-button-style u-hover-none u-none u-radius-0 u-text-body-color u-top-left-radius-0 u-top-right-radius-0 u-btn-3"
                           href="/update-student">Приступить</a>
                    </div>
                </div>
                <div class="u-align-left u-container-style u-list-item u-palette-5-light-2 u-repeater-item u-list-item-4"
                     data-animation-delay="500" data-animation-duration="1500" data-animation-name="customAnimationIn">
                    <div class="u-container-layout u-similar-container u-valign-top u-container-layout-7">
                        <div class="u-align-center u-container-style u-group u-palette-1-base u-radius-50 u-shape-round u-group-4"
                             data-animation-delay="500" data-animation-duration="1500"
                             data-animation-name="customAnimationIn">
                            <div class="u-container-layout u-valign-middle u-container-layout-8">
                                <h2 class="u-custom-font u-font-oswald u-text u-text-body-alt-color u-text-default u-text-12"
                                    data-lang-en="04">04</h2>
                            </div>
                        </div>
                        <h5 class="u-text u-text-13" data-lang-en="Resources">Удалить студента из базы</h5>
                        <p class="u-text u-text-default u-text-14"
                           data-lang-en="Sample text. Click to select the text box. Click again or double click to start editing the text.">
                            Sample text. Тут будет описание функции ниже, но не сегодня, а когда-нибудь. </p>
                        <a class="u-active-none u-border-1 u-border-active-palette-2-base u-border-hover-palette-2-base u-border-no-left u-border-no-right u-border-no-top u-border-palette-1-base u-bottom-left-radius-0 u-bottom-right-radius-0 u-btn u-button-style u-hover-none u-none u-radius-0 u-text-body-color u-top-left-radius-0 u-top-right-radius-0 u-btn-4"
                           href="/delete-student">Приступить</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

<footer class="u-align-center u-clearfix u-footer u-grey-80 u-footer" id="sec-545f">
    <div class="u-clearfix u-sheet u-sheet-1">
        <p class="u-small-text u-text u-text-variant u-text-1"
           data-lang-en="">
            C18TMS2022, Все права отсутствуют, Февраль 2023
    </div>
</footer>
<section class="u-backlink u-clearfix u-grey-80">

</section>

</body>
</html>

