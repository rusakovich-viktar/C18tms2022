<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="by.tms.model.Student " %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="by.tms.model.City" %>

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
                    <th class="u-border-1 u-border-palette-4-base u-table-cell">ID city</th>
                    <th class="u-border-1 u-border-palette-4-base u-table-cell">Город</th>
                </tr>
                </thead>

                <tbody class="u-table-body">
                <tr style="height: 73px;">

                    <form method="get">
                        <label for="phone">Выберите модель:</label>
                        <select id="phone" name="phone">
                            <%
                                ArrayList<City> cities = (ArrayList<City>) request.getAttribute("studentCity");
                                for (City city : cities) {
                            %>
                            <option value=<%=city.getCityId()%>><%=city.getCityName()%>
                            </option>
                            <%}%>
                        </select>
                        </p>
                        <p>
                            <input type="submit" value="Отправить"/>
                        </p>
                    </form>


                </tbody>
            </table>
        </div>
    </div>
</section>


<jsp:include page="/jsp/section-above-footer.jsp"/>
<jsp:include page="/jsp/footer.jsp"/>
</body>
</html>

