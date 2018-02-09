<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <title>Личный кабинет</title>
    <link rel="stylesheet" href="/css/A.main_style.css.pagespeed.cf.ckSp8gDoOX.css">
    <link rel="stylesheet" href="/css/A.aside.css.pagespeed.cf.AcnkbKT635.css">
    <link rel="stylesheet" href="/css/A.font-awesome.min.css.pagespeed.cf.YaV9IcR0kC.css">
    <link rel="stylesheet" href="/css/style.css">
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script type="text/javascript" src="/js/main.js"></script>
</head>

<body>
<div id="wrapper">
    <div id="content">
<#include 'common/header_logout.ftl'/>
<#include 'common/nav.ftl'/>
        <h1>Здравствуйте, ${model.user.name}</h1>
        <h2>Введите или измените данные в профиле</h2>
        <input type="text" id="firstName" name="firstName" value="<#if model.user.firstName??>${model.user.firstName}</#if>"/>
        <input type="text" id="lastName" name="lastName" value="<#if model.user.lastName??>${model.user.lastName}</#if>"/>
        <input type="text" id="organization" name="organization" value="<#if model.user.organization??>${model.user.organization}</#if>"/>
        <input type="text" id="phonenumber" name="phonenumber" value="<#if model.user.phonenumber??>${model.user.phonenumber}</#if>"/>
        <button onclick="updateProfile(
            document.getElementById('firstName').value,
            document.getElementById('lastName').value,
            document.getElementById('organization').value,
            document.getElementById('phonenumber').value)">Изменить</button>
    </div>
</div>
</body>
</html>