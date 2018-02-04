<#ftl encoding='UTF-8'>
<html>
<head>
    <meta charset="utf-8">
<<<<<<< HEAD
    <title>Вход</title>
=======
    <title>Войти на сайт</title>
>>>>>>> e1dbd9fdbfbe11a00ef52b0486d4ffd642dd8cb7
    <link rel="stylesheet" href="/css/A.main_style.css.pagespeed.cf.ckSp8gDoOX.css">
    <link rel="stylesheet" href="/css/A.aside.css.pagespeed.cf.AcnkbKT635.css">
    <link rel="stylesheet" href="/css/A.font-awesome.min.css.pagespeed.cf.YaV9IcR0kC.css">
    <link rel="stylesheet" href="/css/style.css">
<<<<<<< HEAD
=======
    <link rel="stylesheet" href="/css/style2.css">
>>>>>>> e1dbd9fdbfbe11a00ef52b0486d4ffd642dd8cb7
</head>

<body>
<div id="wrapper">
    <div id="content">
<<<<<<< HEAD
    <#include 'common/header_login.ftl'/>
    <#include 'common/nav.ftl'/>
        <#if model.error == true>
    <h1>Неверное имя пользователя или пароль</h1>
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
                    <form id="form_input"
                          name="registrationForm"
                          method="post"
                          action="/login">
                        <br>
                            <input type="email" id="email" placeholder="Email.." onclick="$(this).css ('border-color', '#ccc')">
                        </br>
                        <br>
                            <input type="password" id="password" placeholder="Ваш пароль" onclick="$(this).css ('border-color', '#ccc')">
                            <input type="checkbox" name="remember-me">Запомнить
                        </br>
                        <div id="mess"></div>
                        <div>
                            <input id="send" class="btn" style="float: right" type="submit" placeholder="Войти"/>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

=======
<#include 'common/header.ftl'/>
<#include 'common/nav.ftl'/>
    </div>
</div>
>>>>>>> e1dbd9fdbfbe11a00ef52b0486d4ffd642dd8cb7
</body>
</html>