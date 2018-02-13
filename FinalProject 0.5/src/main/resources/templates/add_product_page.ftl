<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <title>Добавить продукцию</title>
    <link rel="stylesheet" href="/css/A.main_style.css.pagespeed.cf.ckSp8gDoOX.css">
    <link rel="stylesheet" href="/css/A.aside.css.pagespeed.cf.AcnkbKT635.css">
    <link rel="stylesheet" href="/css/A.font-awesome.min.css.pagespeed.cf.YaV9IcR0kC.css">
    <link rel="stylesheet" href="/css/style.css">
    <link rel="stylesheet" href="/css/style2.css">
</head>
<body>
<div id="wrapper">
    <div id="content">
    <#include 'common/header_logout.ftl'/>
    <#include 'common/nav.ftl'/>
        <div id="main">
            <div id="news">
                <h2 class="heading">Добавление продукции</h2>
                <div style="clear: both">
                    <br>
                </div>
                <div class="block">
                    Заполните все поля, для добавления нового товара
                    <form id="form_input"
                          name="productForm"
                          method="post"
                          action="/add_product">

                        <div>
                            <input type="text" name="model" placeholder="Модель"
                                   onclick="$(this).css ('border-color', '#ccc')">
                        </div>
                        <div>
                            <input type="text" name="color" placeholder="Цвет"
                                   onclick="$(this).css ('border-color', '#ccc')">
                        </div>
                        <div>
                            <input type="text" name="productCode" placeholder="Код продукта"
                                   onclick="$(this).css ('border-color', '#ccc')">
                        </div>
                        <div>
                            <input type="text" name="price" placeholder="Цена"
                                   onclick="$(this).css ('border-color', '#ccc')">
                        </div>
                        <div>
                            <input type="text" name="description" placeholder="Описание"
                                   onclick="$(this).css ('border-color', '#ccc')">
                        </div>
                        <div>
                            <input type="text" name="imagePath" placeholder="Путь к картинке"
                                   onclick="$(this).css ('border-color', '#ccc')">
                        </div>
                        <div>
                        <#--<input type="text" name="category" placeholder="Категория"-->
                        <#--onclick="$(this).css ('border-color', '#ccc')">-->
                            <select multiple name="category">
                                <option value="СКС">СКС</option>
                                <option value="АТС">АТС</option>
                                <option value="Запись разговоров">Запись разговоров</option>
                                <option value="Видеонаблюдение">Видеонаблюдение</option>
                            </select>
                        </div>
                        <input type="submit" class="btn" style="float: right" placeholder="Добавить"/>
                    </form>
                </div>
            </div>
        </div>
    </div>
</body>
</html>