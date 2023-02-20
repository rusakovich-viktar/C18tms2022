<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <div class="u-clearfix u-expanded-width u-gutter-30 u-layout-wrap u-layout-wrap-1">
            <div class="u-gutter-0 u-layout">
                <div class="u-layout-row">
                    <div class="u-size-30 u-size-60-md">
                        <div class="u-layout-row">
                            <div class="u-align-center u-container-style u-image u-layout-cell u-left-cell u-size-30 u-image-1"
                                 data-image-height="600" data-image-width="800">
                                <div class="u-border-2 u-border-palette-1-base u-container-layout u-container-layout-1"></div>
                            </div>
                            <div class="u-align-left u-container-style u-layout-cell u-size-30 u-layout-cell-2">
                                <div class="u-container-layout u-valign-middle u-container-layout-2">
                                    <p class="u-text u-text-1"> Чтобы добавить студента нажмите кнопку</p>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="u-size-30 u-size-60-md">
                        <div class="u-layout-row">
                            <div class="u-align-left u-container-style u-layout-cell u-right-cell u-size-60 u-layout-cell-3">
                                <div class="u-container-layout u-valign-middle u-container-layout-3">
                                    <div class="u-form u-form-1">
                                        <div class="button">
                                            <button><span>Добавить</span></button>
                                        </div>
                                        <div class="pop-up">
                                            <div class="content">
                                                <div class="container">
                                                    <div class="dots">
                                                        <div class="dot"></div>
                                                        <div class="dot"></div>
                                                        <div class="dot"></div>
                                                    </div>

                                                    <span class="close">close</span>

                                                    <div class="title">
                                                        <h1>Добавление студента</h1>
                                                    </div>

                                                    <img src="https://cdn-icons-png.flaticon.com/512/2521/2521826.png"
                                                         alt="Add">

                                                    <div class="subscribe">
                                                        <h1>Введите ID студента которого вы хотите
                                                            <span> ДОБАВИТЬ </span> и нажмите "Добавить"</h1>

                                                        <form method="post" action="add-student">
                                                            <div><input type="text" class="colortext" name="name"
                                                                        placeholder="Имя" required="required"
                                                                        autocomplete="off"></div>
                                                            <div><input type="text" class="colortext" name="surname"
                                                                        placeholder="Фамилия" required="required"
                                                                        autocomplete="off"></div>
                                                            <div class="boxqw"> Курс: <select
                                                                    class=""
                                                                    name="course">
                                                                <option>1</option>
                                                                <option>2</option>
                                                                <option>3</option>
                                                                <option>4</option>
                                                                <option>5</option>
                                                            </select></div>

                                                            <div>
                                                                <input type="text" class="colortext" name="cityId"
                                                                       placeholder="ID города" required="required"
                                                                       autocomplete="off"></div>
                                                            <input type="submit" value="Добавить">
                                                        </form>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
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