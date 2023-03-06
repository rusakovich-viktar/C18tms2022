<%@ page import="by.tms.model.City" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<html lang="ru" style="font-size: 16px;">
<head>
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta charset="utf-8">
    <title>Delete</title>
    <link href="css/index.css" media="screen" rel="stylesheet">
    <link href="css/main.css" media="screen" rel="stylesheet">
    <script class="u-script" defer="" src="js/jquery-1.9.1.min.js" type="text/javascript"></script>
    <script class="u-script" defer="" src="js/nicepage.js" type="text/javascript"></script>
    <link href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i"
          id="u-theme-google-font" rel="stylesheet">

    <script type="application/ld+json">{
        "@context": "http://schema.org",
        "@type": "Organization",
        "name": "WebSite4066966",
        "logo": "https://i.ibb.co/cxrCxyQ/pngegg.png"
    }
    </script>
    <meta content="#478ac9" name="theme-color">

    <meta content="" property="og:description">
    <meta content="website" property="og:type">
    <meta data-intl-tel-input-cdn-path="intlTelInput/">
</head>
<body class="u-body u-xl-mode" data-lang="ru">
<jsp:include page="/jsp/header.jsp"/>

<section class="u-clearfix u-section-3" id="sec-c92c">
    <div class="u-clearfix u-sheet u-sheet-1">
        <h2 class="u-text u-text-default u-text-1">Изменение существующего студента</h2>
        <div class="u-form u-form-1">
            <form method="post" action="update-student">
                <input type="hidden" value="<%=request.getParameter("id")%>" name="id"/>
                <div><label>Name</label><br>
                    <input type="text" class="colortext" name="name" placeholder="Имя" required="required"
                           autocomplete="off"></div>
                <div><label>Surname</label><br>
                    <input type="text" class="colortext" name="surname" placeholder="Фамилия" required="required"
                           autocomplete="off"></div>
                <label>Course</label><br>
                <div class="colortext"><select
                        class=""
                        name="course" REQUIRED>
                    <option value="">не выбран</option>
                    <option value="1">Первый</option>
                    <option value="2">Второй</option>
                    <option value="3">Третий</option>
                    <option value="4">Четвертый</option>
                    <option value="5">Пятый</option>
                </select></div>
                <label>Город</label><br>
                <div class="colortext"><select id="city" name="cityId" REQUIRED>
                    <%
                        ArrayList<City> cities = (ArrayList<City>) request.getAttribute("studentCity");
                        for (City city : cities) {
                    %>
                    <option value=<%=city.getCityId()%>><%=city.getCityName()%>
                    </option>
                    <%}%>
                </select></div>
                <p>
                    <input class="colortext" type="submit" value="Изменить"/>
                </p>
            </form>
        </div>
    </div>
</section>

<jsp:include page="/jsp/section-above-footer.jsp"/>
<jsp:include page="/jsp/footer.jsp"/>

</body>
</html>