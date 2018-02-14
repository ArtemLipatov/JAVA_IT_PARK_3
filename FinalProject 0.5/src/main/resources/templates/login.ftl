<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <meta charset="utf-8">
    <title>Войти на сайт</title>
    <link rel="stylesheet" href="/css/A.main_style.css.pagespeed.cf.ckSp8gDoOX.css">
    <link rel="stylesheet" href="/css/A.aside.css.pagespeed.cf.AcnkbKT635.css">
    <link rel="stylesheet" href="/css/A.font-awesome.min.css.pagespeed.cf.YaV9IcR0kC.css">
    <link rel="stylesheet" href="/css/style.css">
    <link rel="stylesheet" href="/css/style2.css">
</head>

<body>
<div id="wrapper">
    <div id="content">
    <#include 'common/header_login.ftl'/>
    <#include 'common/nav.ftl'/>
        <#if model.error == true>
        <center>
            <h1><font color="red">Неверное имя пользователя или пароль</font></h1>
        </center>
        </#if>
        <div id="main">
            <div id="news">
                <h2 class="heading">Войти на сайт</h2>
                <div style="clear: both">
                    <br>
                </div>
                <div class="block">
                    <p id="textHint">Чтобы войти на сайт используйте ваш email и пароль, которые были указаны при
                        регистрации на сайте</p>
                    <form id="form_input"
                          name="registrationForm"
                          method="post"
                          action="/login">
                        <div>
                        <input type="email" id="email" name="email" placeholder="Email.."
                               onclick="$(this).css ('border-color', '#ccc')">
                        </div>
                        <div>
                        <input type="password" id="password" name="password" placeholder="Ваш пароль"
                               onclick="$(this).css ('border-color', '#ccc')">
                        </div>
                            Запомнить <input type="checkbox" name="remember-me">
                        <div>
                            <input id="send" class="btn" style="float: right" type="submit" placeholder="Войти"/>
                        </div>
                    </form>

                </div>
            </div>
        </div>
    </div>
</div>
</div>
</body>
</html>