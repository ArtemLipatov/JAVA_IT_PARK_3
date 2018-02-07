<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <title>Список товаров</title>
    <link rel="stylesheet" href="css/A.main_style.css.pagespeed.cf.ckSp8gDoOX.css" type="text/css" charset="utf-8">
    <link rel="stylesheet" href="css/A.main_page_style.css.pagespeed.cf.42EpeVMWp4.css" type="text/css" charset="utf-8">
    <link rel="stylesheet" href="css/A.aside.css.pagespeed.cf.AcnkbKT635.css" type="text/css" charset="utf-8">
    <link rel="stylesheet" href="css/A.font-awesome.min.css.pagespeed.cf.YaV9IcR0kC.css">
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div id="wrapper">
    <div id="content">
        <#if model.user??>
            <#include 'common/header_logout.ftl'/>
        <#else>
            <#include 'common/header_login.ftl'/>
        </#if>
    <#include 'common/nav.ftl'/>
        <table>
            <tr>
                <th>ID</th>
                <th>Категория</th>
                <th>Модель</th>
                <th>Описание</th>
                <th>Цвет</th>
                <th>Код продукста</th>
                <th>Рейтинг</th>
                <th>Цена</th>
            </tr>
            <#list model.products as product>
                <tr>
                    <td>${product.id}</td>
                    <td>${product.category}</td>
                    <td>${product.model}</td>
                    <td>${product.description}</td>
                    <td>${product.color}</td>
                    <td>${product.productCode}</td>
                    <td>${product.rating}</td>
                    <td>${product.price}</td>
                </tr>
            </#list>
        </table>
    </div>
</div>
</body>
</html>