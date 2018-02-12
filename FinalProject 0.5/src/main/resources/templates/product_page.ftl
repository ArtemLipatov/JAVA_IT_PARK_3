<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <title>Товар</title>
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
        <h1>Модель: ${model.product.model}</h1>
        <p>Код продукта: ${model.product.productCode}</p>
        <p>Категория: ${model.product.category}</p>
        <img src="${model.product.imagePath}" width="300px" height="300px" alt="picture">
        <h2>Цена: ${model.product.price}</h2>
        <p>Цвет: ${model.product.color}</p>
        <p>Описание: ${model.product.description}</p>
        <h2>Отзывы</h2>

    <#if model.user??>
        <form title="Добавить отзыв"
              name="addReviewForm"
              method="post"
              action="/add_review">
            <input type="text" name="productId" value="${model.product.id}" hidden>
            <input type="text" name="userId" value="${model.user.id}" hidden>
            <textarea name="text" placeholder="Введите текст отзыва" rows="3" required></textarea><br>
            <input type="submit" value="Сохранить">
        </form>
    <#else>
        <p><a href="/login">Войдите, чтобы написать отзыв</a></p>
    </#if>
         <#if model.product.reviews??>
             <#list model.product.reviews as review>
        <hr>
            <p>Отзыв оставил: ${review.user.name}<br>
                Дата: ${review.reviewDateTime}<br>
                 <#if model.user??>
                     <#if review.userId.id == model.user.id>
                    <a href="/edit_review?id=${review.id}">Редактировать</a>
                    <form action="/delete_review?id=${review.id}" name="delete" method="post">
                        <a href="#" onClick="parentNode.submit();">Удалить</a>
                    </form>
                 </#if>

                 </#if>
                ${review.text}</p>
             </#list>
         <#else>
        <p>Отзывов о данном товаре ещё не было.</p>
         </#if>
        <a href="/">Вернутся на главную страницу</a>
    </div>
</div>
</body>
</html>