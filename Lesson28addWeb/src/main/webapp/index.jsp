<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" %>
<!doctype html>
<html lang="ru">
<head>
    <title>Index Page</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <%--    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">--%>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <%--    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>--%>
    <%--    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>--%>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>


</head>
<body>
<div class="container text-center block">
    <div class="row row-cols-4">
        <div class="col-6">
            <div class="p-3">
                <a href="/now-time-servlet"><h1>Текущее время</h1></a>
            </div>
        </div>
        <div class="col-6">
            <h3>Вывод дня недели по введенной дате. Методом GET</h3></a>
            <form action="/displaying-day-of-week-from-date" method="get">
                <div class="form-group">
                    <%--@declare id="inputdate"--%><label for="inputDate">Введите дату:</label>
                    <input type="date" id="date" name="date" class="form-control" required>
                </div>
                <div>

                    <button type="submit">Отправить</button>
                </div>
            </form>
        </div>
        <div class="col-6">
            <h3>Вывод номера дня в году по введенной дате. POST</h3></a>
            <form action="/displaying-day-of-year-from-date" method="post">
                <div class="form-group">
                    <%--@declare id="inputdate"--%><label for="inputDate">Введите дату:</label>
                    <input type="date" id="date" name="date" class="form-control" required>
                </div>
                <div>
                    <button type="submit">Отправить</button>
                </div>
            </form>
        </div>
        <div class="col-6">
            <a href="/page-hit-counter"><br><br>
                <h1>Тест количества посещений страницы</h1></a>
        </div>
    </div>
</div>
</body>
</body>
</html>
