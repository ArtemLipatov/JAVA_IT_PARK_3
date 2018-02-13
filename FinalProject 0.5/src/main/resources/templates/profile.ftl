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
    <if model.user.role == ADMIN||MODERATOR>
        <form action="/add_product">
            <button class="btn" style="float: left" placeholder="Добавить продукт">Добавить продукт</button>
        </form>
    </if>
        <h1>Здравствуйте <#if model.user.name??>${model.user.name}</#if></h1>
        <h2>Введите или измените данные в профиле</h2>
    <p> ${model.user.email}</p>
    <p>Имя:  <#if model.user.firstName??>${model.user.firstName}</#if></p>
    <p>Фамилия: <#if model.user.lastName??>${model.user.lastName}</#if></p>
    <p>Организация: <#if model.user.organization??>${model.user.organization}</#if></p>
    <p>Номер телефона: <#if model.user.phonenumber??>${model.user.phonenumber}</#if></p>
    <form title="Изменение профиля"
          name="pegistrationForm"
          method="post"
          action="/update_profile">
        <input type="text" id="firstName" name="firstName" placeholder="Имя" value="<#if model.user.firstName??>${model.user.firstName}</#if>"/>
        <input type="text" id="lastName" name="lastName" placeholder="Фамилия" value="<#if model.user.lastName??>${model.user.lastName}</#if>"/>
        <input type="text" id="organization" name="organization" placeholder="Название организации" value="<#if model.user.organization??>${model.user.organization}</#if>"/>
        <input type="text" id="phonenumber" name="phonenumber" placeholder="Номер телефона" value="<#if model.user.phonenumber??>${model.user.phonenumber}</#if>"/>
        <button onclick="updateProfile(
            document.getElementById('firstName').value,
            document.getElementById('lastName').value,
            document.getElementById('organization').value,
            document.getElementById('phonenumber').value)">Изменить</button>
    </form>
    </div>
</div>
</body>
</html>