<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>

<html>
<head>
    <title>Главная</title>
    <link rel="stylesheet" href="/css/A.main_style.css.pagespeed.cf.ckSp8gDoOX.css">
    <link rel="stylesheet" href="/css/A.main_page_style.css.pagespeed.cf.42EpeVMWp4.css">
    <link rel="stylesheet" href="/css/A.aside.css.pagespeed.cf.AcnkbKT635.css">
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
        <div id="main">
            <div id="news">
                <h1 class="heading">Мы предлагаем:</h1>
                <div style="clear: both">
                    <br>
                </div>
                <div class="flex-cont">

                    <#list model.products as product>
                        <div class="article">
                            <a href="/products/${product.id}" title="${product.model}">
                                <img src="${product.imagePath}" alt="picture" height="200px" width="200px">
                                <span>${product.model}</span>
                            </a>
                            <br>
                            <span>${product.description}</span>
                            <br>
                        </div>
                    </#list>

                </div>
            </div>
        </div>
        <aside>
            <aside>
                <div id="courses">
                    <h2 class="heading">Контактные данные</h2>
                    <div style="clear: both"><br></div>
                    <div class="course">
                            <span class="title_course">Наш адрес: </span>
                        <span>Ул. Пушкина д.Колотушкина</span>
                    </div>
                    <div style="clear: both"><br></div>
                    <div class="course">
                            <span class="title_course">Помощь консультанта по телефону:</span>
                        <span>8-800-555-35-35</span>
                    </div>
                    <div style="clear: both"><br></div>
                    <div class="course">
                            <span class="title_course">Наши консультанты:</span>
                        <span>Иванов Иван Иванович(вн. 111)</span>
                        <span>Петров Петр Петрович(вн. 222)</span>
                    </div>
                    <div style="clear: both"><br></div>
        </aside>
    </div>
</div>
</div>
</body>
</html>