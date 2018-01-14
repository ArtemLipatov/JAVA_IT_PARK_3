<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.company.models.Product" %>

<head>
    <title>Продукция</title>
    <link rel="stylesheet" href="css/A.main_style.css.pagespeed.cf.ckSp8gDoOX.css" type="text/css" charset="utf-8">
    <link rel="stylesheet" href="css/A.main_page_style.css.pagespeed.cf.42EpeVMWp4.css" type="text/css" charset="utf-8">
    <link rel="stylesheet" href="css/A.aside.css.pagespeed.cf.AcnkbKT635.css" type="text/css" charset="utf-8">
    <link rel="stylesheet" href="css/A.font-awesome.min.css.pagespeed.cf.YaV9IcR0kC.css">
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
<div id="wrapper">
    <div id="content">
        <header>
            <div id="logo">
                <a href="index" title="На главную страницу">
                    <img src="img\logo.jpg" title="Название компании" alt="Логотип компании">
                    <span>Название</span>
                </a>
            </div>
            <div id="about">
                <a href="index" title="Обратная связь">Задать вопрос консультанту</a>
            </div>
            <div id="reg_auth">
                <a href="user" title="Авторизоваться на сайте">
                    <div class="btn">
                        Войти
                    </div>
                </a>
                <a href="reg" title="Зарегистрироваться на сайте">
                    <div class="btn">
                        Регистрация
                    </div>
                </a>
            </div>
        </header>
        <nav>
            <div id="menuShow"><i class="fa fa-bars" aria-hidden="true"></i></div>
            <div id="hideMenu">
                <a href="index" title="На главную страницу">
                    <img src="img\logo.jpg" title="Название компании" alt="Логотип компании">
                </a>
                <a href="sks">Все для СКС и Телефонии</a>
                <a href="ats">АТС предприятия</a>
                <a href="rec">Запись разговоров</a>
                <a href="video">Видеонаблюдение</a>
            </div>
        </nav>
        <h1>${productsTitle}</h1>
        <table>
            <tr>
                <th>Id</th>
                <th>Имя</th>
                <th>Модель</th>
                <th>Описание</th>
                <th>Цвет</th>
                <th>Код продукта</th>
                <th>Рейтинг</th>
                <th>Цена</th>
                <th>Редактировать</th>
                <th>Удалить</th>
            </tr>
            <%--<%--%>
                <%--ArrayList<Product> products = (ArrayList<Product>) request.getAttribute("products");--%>

                <%--for (Product product : products) {--%>
            <%--%>--%>
            <c:forEach items="${products}" var="product">
                <tr>
                    <td>${product.id}</td>
                    <td>${product.name}</td>
                    <td>${product.model}</td>
                    <td>${product.description}</td>
                    <td>${product.color}</td>
                    <td>${product.productCode}</td>
                    <td>${product.rating}</td>
                    <td>${product.price}</td>
                    <td><a href="/productUpdate/${product.id}">Редактировать</a></td>
                    <td><a href="/productDelete/${product.id}">Удалить</a></td>
                </tr>
            </c:forEach>
            <%--<tr>--%>
                <%--<td><%=product.getId()%></>--%>
                <%--<td><%=product.getName()%></>--%>
                <%--<td><%=product.getModel()%></>--%>
                <%--<td><%=product.getDescription()%></>--%>
                <%--<td><%=product.getColor()%></>--%>
                <%--<td><%=product.getProductCode()%></>--%>
                <%--<td><%=product.getRating()%></>--%>
            <%--</tr>--%>
            <%--<% } %>--%>
        </table>
        <form action="/products" method="post">
            <input type="text" name="name" placeholder="Имя">
            <input type="text" name="model" placeholder="Модель">
            <input type="text" name="description" placeholder="Описание">
            <input type="text" name="color" placeholder="Цвет">
            <input type="text" name="productCode" placeholder="Код продукта">
            <input type="text" name="rating" placeholder="Рейтинг">
            <input type="text" name="price" placeholder="Цена">
            <input type="submit">
        </form>
    </div>
</div>
</body>
</html>