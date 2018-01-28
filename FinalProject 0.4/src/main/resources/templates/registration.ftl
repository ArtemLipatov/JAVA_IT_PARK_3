<#ftl encoding='UTF-8'>
<html>
<head>
    <meta charset="utf-8">
    <title>Регистрация</title>
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
        <div id="main">
            <div id="news">
                <h2 class="heading">Регистрация на сайте</h2>
                <div style="clear: both">
                    <br>
                </div>
                <div class="block">
                    Введите данные для регистрации на сайте
                    <form id="form_input" name="registrationForm" method="post" action="/registration">
                        <div>
                            <input type="text" name="login" placeholder="Логин"
                                   onclick="$(this).css ('border-color', '#ccc')">
                        </div>
                        <div>
                            <input type="email" name="email" placeholder="Email.."
                                   onclick="$(this).css ('border-color', '#ccc')">
                        </div>
                        <div>
                            <input type="password" name="password" placeholder="Ваш пароль"
                                   onclick="$(this).css ('border-color', '#ccc')">
                        </div>
                        <div>
                            <input type="password" name="password2" placeholder="Повторите пароль"
                                   onclick="$(this).css ('border-color', '#ccc')">
                        </div>
                        <div id="send" class="btn" style="float: right">Зарегистрироваться</div>
                    </form>
                </div>
            </div>
        </div>
    </div>

</body>
</html>