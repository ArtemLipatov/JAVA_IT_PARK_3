<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <meta charset="utf-8">
    <title>Задать вопрос</title>
    <link rel="stylesheet" href="/css/A.main_style.css.pagespeed.cf.ckSp8gDoOX.css">
    <link rel="stylesheet" href="/css/A.aside.css.pagespeed.cf.AcnkbKT635.css">
    <link rel="stylesheet" href="/css/A.font-awesome.min.css.pagespeed.cf.YaV9IcR0kC.css">
    <link rel="stylesheet" href="/css/style.css">
    <link rel="stylesheet" href="/css/style2.css">
</head>

<body>
<div id="wrapper">
    <div id="content">
        <#if model.user??>
            <#include 'common/header_logout.ftl'/>
        <#else>
            <#include 'common/header_login.ftl'/>
        </#if>
        <div id="main">
            <div id="news">
                <h2 class="heading">Задать вопрос специалисту</h2>
                <div style="clear: both">
                    <br>
                </div>
                <div class="block">
                    Заполните все поля, чтобы задать вопрос
                    <form id="form_input"
                          name="questionForm"
                          method="post"
                          action="/question">
                        <div>
                            <input type="text" name="name" placeholder="Имя"
                                   onclick="$(this).css ('border-color', '#ccc')">
                        </div>
                        <div>
                            <input type="email" name="email" placeholder="Email.."
                                   onclick="$(this).css ('border-color', '#ccc')">
                        </div>
                        <div>
                            <input type="text" name="text" placeholder="Ваш вопрос"
                                   onclick="$(this).css ('border-color', '#ccc')">
                        </div>
                        <div>
                            <input type="text" name="phonenumber" placeholder="Номер телефона"
                                   onclick="$(this).css ('border-color', '#ccc')">
                        </div>
                        <input type="submit" class="btn" style="float: right" placeholder="Задать вопрос"/>
                    </form>
                </div>
            </div>
        </div>
    </div>

</body>
</html>