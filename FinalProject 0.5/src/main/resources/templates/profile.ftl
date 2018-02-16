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
    <link rel="stylesheet" href="/css/style2.css">
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script type="text/javascript" src="/js/main.js"></script>
</head>

<body>
<div id="wrapper">
    <div id="content">
    <#include 'common/header_logout.ftl'/>
<#include 'common/nav.ftl'/>

    <#--<h1>Здравствуйте <#if model.user.name??>${model.user.name}</#if></h1>-->
    <#--<h2>Введите или измените данные в профиле</h2>-->
    <#--<p>Email: ${model.user.email}</p>-->
    <#--<p>Имя:  <#if model.user.firstName??>${model.user.firstName}</#if></p>-->
    <#--<p>Фамилия: <#if model.user.lastName??>${model.user.lastName}</#if></p>-->
    <#--<p>Организация: <#if model.user.organization??>${model.user.organization}</#if></p>-->
    <#--<p>Номер телефона: <#if model.user.phonenumber??>${model.user.phonenumber}</#if></p>-->
    <#--<form id="form_input">-->
    <#--<div>-->
    <#--<input type="text" id="firstName" name="firstName" placeholder="Имя"-->
    <#--value="<#if model.user.firstName??>${model.user.firstName}</#if>"/>-->
    <#--</div>-->
    <#--<div>-->
    <#--<input type="text" id="lastName" name="lastName" placeholder="Фамилия"-->
    <#--value="<#if model.user.lastName??>${model.user.lastName}</#if>"/>-->
    <#--</div>-->
    <#--<div>-->
    <#--<input type="text" id="organization" name="organization" placeholder="Название организации"-->
    <#--value="<#if model.user.organization??>${model.user.organization}</#if>"/>-->
    <#--</div>-->
    <#--<div>-->
    <#--<input type="text" id="phonenumber" name="phonenumber" placeholder="Номер телефона"-->
    <#--value="<#if model.user.phonenumber??>${model.user.phonenumber}</#if>"/>-->
    <#--</div>-->
    <#--<button onclick="updateProfile(-->
    <#--${model.user.id},-->
    <#--document.getElementById('firstName').value,-->
    <#--document.getElementById('lastName').value,-->
    <#--document.getElementById('organization').value,-->
    <#--document.getElementById('phonenumber').value)">Изменить-->
    <#--</button>-->
    <#--</form>-->
        <div id="main">
            <div id="news">
                <if model.user.role== ADMIN||MODERATOR>
                    <form action="/add_product">
                        <button class="btn" style="float: left" placeholder="Добавить продукт">Добавить продукт</button>
                    </form>
                </if>
                <h2 class="heading">Здравствуйте <#if model.user.name??>${model.user.name}</#if></h2>
                <div style="clear: both">
                    <br>
                </div>
                <p>Email: ${model.user.email}
                <p>Имя:  <#if model.user.firstName??>${model.user.firstName}</#if></p>
                <p>Фамилия: <#if model.user.lastName??>${model.user.lastName}</#if></p>
                <p>Организация: <#if model.user.organization??>${model.user.organization}</#if></p>
                <p>Номер телефона: <#if model.user.phonenumber??>${model.user.phonenumber}</#if></p>
                <div style="clear: both">
                    <br>
                </div>
                <div class="block">
                    Введите или измените данные в профиле
                <#--name="profileForm" method="post" action="/update_profile"-->
                    <form id="form_input" name="profileForm" method="post" action="/profile">
                        <div>
                            <input type="text" name="firstName" placeholder="Имя"
                                   onclick="$(this).css ('border-color', '#ccc')">
                        </div>
                        <div>
                            <input type="text" name="lastName" placeholder="Фамилия"
                                   onclick="$(this).css ('border-color', '#ccc')">
                        </div>
                        <div>
                            <input type="text" name="organization" placeholder="Название организации"
                                   onclick="$(this).css ('border-color', '#ccc')">
                        </div>
                        <div>
                            <input type="text" name="phonenumber" placeholder="Номер телефона"
                                   onclick="$(this).css ('border-color', '#ccc')">
                        </div>
                        <input type="text" name="userId" value="${model.user.id}" hidden>
                        <input type="submit" class="btn" style="float: right"  value="Изменить"/>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>