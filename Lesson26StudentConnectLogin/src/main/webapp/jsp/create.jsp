<%@ page import="by.tms.model.City" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<html lang="ru" style="font-size: 16px;">
<head>
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta charset="utf-8">
    <meta content="" name="keywords">
    <meta content="" name="description">
    <title>Create</title>
    <link href="css/index.css" media="screen" rel="stylesheet">
    <link href="css/main.css" media="screen" rel="stylesheet">
    <script class="u-script" defer="" src="js/jquery-1.9.1.min.js" type="text/javascript"></script>
    <script class="u-script" defer="" src="js/nicepage.js" type="text/javascript"></script>
    <meta content="origin" name="referrer">
    <link href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i"
          id="u-theme-google-font" rel="stylesheet">


    <script type="application/ld+json">{
        "@context": "http://schema.org",
        "@type": "Organization",
        "name": "WebSite4066966",
        "logo": "https://i.ibb.co/cxrCxyQ/pngegg.png"
    }</script>
    <meta content="#478ac9" name="theme-color">

    <meta content="" property="og:description">
    <meta content="website" property="og:type">
    <meta data-intl-tel-input-cdn-path="intlTelInput/">
</head>
<body class="u-body u-xl-mode" data-lang="ru">
<jsp:include page="/jsp/header.jsp"/>
</section>
<section class="u-clearfix u-grey-90 u-section-3" id="sec-d687">
    <div class="u-clearfix u-sheet u-valign-middle u-sheet-1">
        <h2 class="u-text u-text-default u-text-1">Добавление нового студента</h2>
        <form method="post" action="add-student">
            <div><input type="text" class="colortext"
                        name="name"
                        placeholder="Имя" required="required"
                        autocomplete="off"></div>
            <div><input type="text" class="colortext" name="surname"
                        placeholder="Фамилия" required="required"
                        autocomplete="off"></div>
            <p>
            <div class="colortext"> Курс: <select
                    name="course" REQUIRED>
                <option value="">не выбран</option>
                <option value="1">Первый</option>
                <option value="2">Второй</option>
                <option value="3">Третий</option>
                <option value="4">Четвертый</option>
                <option value="5">Пятый</option>
            </select></div>
            </p>

            <p>
            <div class="colortext">Город:<select id="city" name="cityId" REQUIRED>
                <%
                    ArrayList<City> cities = (ArrayList<City>) request.getAttribute("studentCity");
                    for (City city : cities) {
                %>
                <option value=<%=city.getCityId()%>><%=city.getCityName()%>
                </option>
                <%}%>
            </select></div>
            </p>
            <p>
                <input class="colortext" type="submit" value="CREATE"/>
            </p>
        </form>
    </div>
</section>
<jsp:include page="/jsp/section-above-footer.jsp"/>
<jsp:include page="/jsp/footer.jsp"/>

</body>
</html>