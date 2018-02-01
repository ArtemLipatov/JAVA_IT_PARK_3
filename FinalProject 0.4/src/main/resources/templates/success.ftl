<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>

<html>
<head>
    <meta charset="utf-8">
    <title>Регистрация</title>
    <link rel="stylesheet" href="css/A.main_style.css.pagespeed.cf.ckSp8gDoOX.css" type="text/css" charset="utf-8">
    <link rel="stylesheet" href="css/A.aside.css.pagespeed.cf.AcnkbKT635.css" type="text/css" charset="utf-8">
    <link rel="stylesheet" href="/css/style2.css">
    <link rel="stylesheet" href="css/A.font-awesome.min.css.pagespeed.cf.YaV9IcR0kC.css">
    <link rel="stylesheet" href="/css/style.css">
</head>

<body>
<div id="wrapper">
    <div id="content">
    <#include 'common/header.ftl'/>
    <#include 'common/nav.ftl'/>
        <h1>Поздравляем с успешной регистрацией, подтвердите ваши данные, перейдя по ссылке на почте - ${model.email}</h1>

    </div>
</div>
</body>
</html>