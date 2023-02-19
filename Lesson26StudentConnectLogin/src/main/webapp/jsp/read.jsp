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
<jsp:include page="/jsp/header.jsp"/>

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
                    <th class="u-border-1 u-border-palette-4-base u-table-cell">Редактировать</th>
                    <th class="u-border-1 u-border-palette-4-base u-table-cell">Удалить</th>

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
                    <td>
                        <a class="u-active-palette-1-base u-border-active-palette-1-base u-border-hover-palette-1-light-1 u-border-no-left u-border-no-right u-border-no-top u-button-style u-hover-palette-1-light-1 u-nav-link u-text-active-white u-text-grey-90 u-text-hover-white"
                           href="/update-student?id=<%=student.getId()%>" style="padding: 10px 20px;">Edit</a>
                    </td>
                    <td>
                        <a class="u-active-palette-1-base u-border-active-palette-1-base u-border-hover-palette-1-light-1 u-border-no-left u-border-no-right u-border-no-top u-button-style u-hover-palette-1-light-1 u-nav-link u-text-active-white u-text-grey-90 u-text-hover-white"
                           href="/delete-student?id=<%=student.getId()%>" style="padding: 10px 20px;">Delete</a>
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
<jsp:include page="/jsp/footer.jsp"/>
</body>
</html>

