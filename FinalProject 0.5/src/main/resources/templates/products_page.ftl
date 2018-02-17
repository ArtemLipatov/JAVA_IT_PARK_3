<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <title>Список товаров</title>
    <link rel="stylesheet" href="/css/A.main_style.css.pagespeed.cf.ckSp8gDoOX.css" type="text/css" charset="utf-8">
    <link rel="stylesheet" href="/css/A.main_page_style.css.pagespeed.cf.42EpeVMWp4.css" type="text/css" charset="utf-8">
    <link rel="stylesheet" href="/css/A.aside.css.pagespeed.cf.AcnkbKT635.css" type="text/css" charset="utf-8">
    <link rel="stylesheet" href="/css/A.font-awesome.min.css.pagespeed.cf.YaV9IcR0kC.css">
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
                <th>Код продукта</th>
                <th>Категория</th>
                <th>Модель</th>
                <th>Описание</th>
                <th>Цвет</th>
                <th>Цена</th>
                <th>Открыть</th>
            </tr>

            <#list model.products as product>
            <a href="/products/${product.id}">
                <tr>
                    <td>${product.productCode}</td>
                    <td>${product.category}</td>
                    <td>${product.model}</td>
                    <td>${product.description}</td>
                    <td>${product.color}</td>
                    <td>${product.price}</td>
                    <td><a href="/products/${product.id}">Подробнее</a></td>
                </tr>
            </a>
            </#list>
        </table>
    </div>
</div>
</body>
</html>