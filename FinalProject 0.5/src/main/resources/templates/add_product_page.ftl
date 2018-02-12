<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <title>Товар</title>
    <link rel="stylesheet" href="/css/A.main_style.css.pagespeed.cf.ckSp8gDoOX.css" type="text/css" charset="utf-8">
    <link rel="stylesheet" href="/css/A.main_page_style.css.pagespeed.cf.42EpeVMWp4.css" type="text/css" charset="utf-8">
    <link rel="stylesheet" href="/css/A.aside.css.pagespeed.cf.AcnkbKT635.css" type="text/css" charset="utf-8">
    <link rel="stylesheet" href="/css/A.font-awesome.min.css.pagespeed.cf.YaV9IcR0kC.css">
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div id="wrapper">
    <div id="content">
    <#include 'common/header_logout.ftl'/>
    <#include 'common/nav.ftl'/>
        <form id="form_input" name="ProductForm" method="post" action="/add_product">
            <div>
                <input type="text" name="model" placeholder="Модель"
                       onclick="$(this).css ('border-color', '#ccc')">
            </div>
            <div>
                <input type="text" name="color" placeholder="Цвет"
                       onclick="$(this).css ('border-color', '#ccc')">
            </div>
            <div>
                <input type="text" name="productCode" placeholder="Код продукта"
                       onclick="$(this).css ('border-color', '#ccc')">
            </div>
            <div>
                <input type="text" name="price" placeholder="Цена"
                       onclick="$(this).css ('border-color', '#ccc')">
            </div>
            <div>
                <input type="text" name="rating" placeholder="Рейтинг"
                       onclick="$(this).css ('border-color', '#ccc')">
            </div>
            <div>
                <input type="text" name="description" placeholder="Описание"
                       onclick="$(this).css ('border-color', '#ccc')">
            </div>
            <div>
                <input type="text" name="imagePath" placeholder="Путь к картинке"
                       onclick="$(this).css ('border-color', '#ccc')">
            </div>
            <input type="submit" class="btn" style="float: right" placeholder="Добавить"/>

    </div>
</div>
</body>
</html>