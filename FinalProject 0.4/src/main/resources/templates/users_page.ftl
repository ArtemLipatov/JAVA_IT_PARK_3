<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <title>Пользователи</title>
    <link rel="stylesheet" href="css/A.main_style.css.pagespeed.cf.ckSp8gDoOX.css" type="text/css" charset="utf-8">
    <link rel="stylesheet" href="css/A.main_page_style.css.pagespeed.cf.42EpeVMWp4.css" type="text/css" charset="utf-8">
    <link rel="stylesheet" href="css/A.aside.css.pagespeed.cf.AcnkbKT635.css" type="text/css" charset="utf-8">
    <link rel="stylesheet" href="css/A.font-awesome.min.css.pagespeed.cf.YaV9IcR0kC.css">
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
                <th>ID</th>
                <th>Имя</th>
                <th>Email</th>
                <th>Дата регистрации</th>
            </tr>
            <#list model.users as user>
                <tr>
                    <td>${user.id}</td>
                    <td>${user.name}</td>
                    <td>${user.email}</td>
                    <td>${user.registrationTime}</td>
                </tr>
            </#list>
        </table>
    </div>
</div>
</body>
</html>