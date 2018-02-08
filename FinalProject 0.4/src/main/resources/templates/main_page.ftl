<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>

<html>
<head>
    <title>Главная</title>
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
        <div id="main">
            <div id="news">
                <h1 class="heading">Спецпредложения</h1>
                <div style="clear: both">
                    <br>
                </div>
                <div class="flex-cont">
                    <div class="article">
                        <a href="products/1" title="Мини-АТС LG Aria Soho">
                            <img src="img/aria-soho.jpg" alt="Мини-АТС LG Aria Soho" title="Мини-АТС LG Aria Soho">
                            <span>Мини-АТС LG Aria Soho</span>
                        </a>
                        <br>
                        <span>Мини-АТС LG Aria Soho (3 городские аналоговые линии  и 8 внутренних линий, расширяется до 12 х 48).</span>
                        <br>
                    </div>
                    </a>
                </div>
                </aside>
            </div>
        </div>
    </div>
</div>
</body>
</html>