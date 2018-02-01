<#ftl encoding='UTF-8'>
<html>
<head>
    <meta charset="utf-8">
    <title>Вход</title>
    <link rel="stylesheet" href="/css/A.main_style.css.pagespeed.cf.ckSp8gDoOX.css">
    <link rel="stylesheet" href="/css/A.aside.css.pagespeed.cf.AcnkbKT635.css">
    <link rel="stylesheet" href="/css/A.font-awesome.min.css.pagespeed.cf.YaV9IcR0kC.css">
    <link rel="stylesheet" href="/css/style.css">
    <link rel="stylesheet" href="/css/style2.css">
</head>

<body>
<div id="wrapper">
    <div id="content">
    <#include 'common/header.ftl'/>
    <#include 'common/nav.ftl'/>
        <#if model.error == true>
    <h1>Неверно введен имя пользователяи пароль</h1>
        </#if>
        <div id="main">
            <div id="news">
                <h2 class="heading">
                    Войти на сайт	</h2>
                <div style="clear: both">
                    <br>
                </div>
                <div class="block">
                    <p id="textHint">Чтобы войти на сайт используйте ваш email и пароль, которые были указаны при регистрации на сайте</p>
                    <form id="form_input"name="registrationForm"
                          method="post"
                          action="/login">
                        <br>
                            <input type="email" id="email" placeholder="Email.." onclick="$(this).css ('border-color', '#ccc')">
                        </br>
                        <br>
                            <input type="password" id="password" placeholder="Ваш пароль" onclick="$(this).css ('border-color', '#ccc')">
                            <i class="fa fa-eye" style="cursor: pointer" onclick="showPass ('#password', '#eye')" id="eye" aria-hidden="true"></i>
                        </br>
                        <div id="mess"></div>
                        <div id="send" class="btn" style="float: right"><input type="submit" placeholder="Войти"/> </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

</body>
</html>