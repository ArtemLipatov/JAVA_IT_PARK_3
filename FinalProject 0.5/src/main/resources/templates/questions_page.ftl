<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <title>Список вопросов</title>
    <link rel="stylesheet" href="/css/A.main_style.css.pagespeed.cf.ckSp8gDoOX.css" type="text/css" charset="utf-8">
    <link rel="stylesheet" href="/css/A.main_page_style.css.pagespeed.cf.42EpeVMWp4.css" type="text/css" charset="utf-8">
    <link rel="stylesheet" href="/css/A.aside.css.pagespeed.cf.AcnkbKT635.css" type="text/css" charset="utf-8">
    <link rel="stylesheet" href="/css/A.font-awesome.min.css.pagespeed.cf.YaV9IcR0kC.css">
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
        <table>
            <tr>
                <th>Id</th>
                <th>Имя</th>
                <th>Email</th>
                <th>Номер телефона</th>
                <th>Дата</th>
                <th>Текст вопроса</th>
            </tr>

            <#list model.questions as question>
                <tr>
                    <td>${question.id}</td>
                    <td>${question.userName}</td>
                    <td>${question.email}</td>
                    <td>${question.phonenumber}</td>
                    <td>${question.questionDateTime}</td>
                    <td>${question.text}</td>
                </tr>
            </#list>
        </table>
    </div>
</div>
</body>
</html>