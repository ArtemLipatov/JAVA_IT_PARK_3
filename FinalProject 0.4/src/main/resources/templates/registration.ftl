<#ftl encoding='UTF-8'>
<html>
<head>
    <meta charset="utf-8">
    <title>Регистрация</title>
    <link rel="stylesheet" href="css/A.main_style.css.pagespeed.cf.ckSp8gDoOX.css" type="text/css" charset="utf-8">
    <link rel="stylesheet" href="css/A.aside.css.pagespeed.cf.AcnkbKT635.css" type="text/css" charset="utf-8">
    <style charset="utf-8">
        #form_input {
            float: left;
            width: 100%;
            margin-top: 10px
        }

        #form_input > div {
            float: left
        }

        #form_input > div > input {
            border-radius: 50px;
            border: 1px solid #c4c4c4;
            font-size: .8em;
            padding: 10px 5%;
            margin-bottom: 10px;
            background-color: #fff
        }

        #form_input > div > input:focus,
        #form_input textarea:focus {
            border: 1px solid #adadad
        }

        #form_input textarea {
            border-radius: 5px;
            border: 1px solid #c4c4c4;
            font-size: .8em;
            padding: 10px;
            width: 76%;
            background-color: #fff;
            resize: vertical;
            max-height: 200px;
            min-height: 70px
        }

        #form_input .btn {
            border-bottom-color: #1999d1;
            background-color: #21a7e1;
            cursor: pointer;
            text-align: center;
            width: auto
        }

        #form_input .btn:hover {
            border-bottom-color: #1999d1
        }

        @media (min-width: 600px) {
            #form_input > div {
                width: 50%
            }

            #form_input > div > input {
                width: 76%
            }
        }

        @media (max-width: 599px) {
            #form_input > div {
                width: 100%
            }

            #form_input > div > input {
                width: 70%
            }
        }
    </style>
    <link rel="stylesheet" href="css/A.font-awesome.min.css.pagespeed.cf.YaV9IcR0kC.css">
</head>

<body>
<div id="wrapper">
    <div id="content">
        <header>
            <div id="logo">
                <a href="index" title="На главную страницу">
                    <img src="img\logo.jpg" title="Название компании" alt="Логотип компании">
                    <span>Название</span>
                </a>
            </div>
            <div id="about">
                <a href="index" title="Обратная связь">Задать вопрос консультанту</a>
            </div>
            <div id="reg_auth">
                <a href="user" title="Войти в кабинет пользователя">
                    <div class="btn">
                        Войти
                    </div>
                </a>
                <a href="registration.ftl" title="Зарегистрироваться на сайте">
                    <div class="btn">
                        Регистрация
                    </div>
                </a>
            </div>
        </header>
        <nav>
            <div id="menuShow"><i class="fa fa-bars" aria-hidden="true"></i></div>
            <div id="hideMenu">
                <a href="index" title="На главную страницу">
                    <img src="img\logo.jpg" title="Название компании" alt="Логотип компании">
                </a>
                <a href="sks">Все для СКС и Телефонии</a>
                <a href="ats">АТС предприятия</a>
                <a href="rec">Запись разговоров</a>
                <a href="video">Видеонаблюдение</a>
            </div>
        </nav>
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