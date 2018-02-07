<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <title>Товар</title>
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
        <h1>Модель: ${model.product.model}</h1>
        <p>Код продукта: ${model.product.productCode}</p>
        <p>Категория: ${model.product.category}</p>
        <img src="${model.product.imagePath}" width="200px" height="200px" alt="picture">
        <h2>Цена: ${model.product.price}</h2>
        <p>Цвет: ${model.product.color}</p>
        <p>Описание: ${model.product.description}</p>
        <p>Рейтинг: ${model.product.rating}</p>
    </div>
</div>
</body>
</html>