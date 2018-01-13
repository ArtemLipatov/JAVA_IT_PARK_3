<html>

<head>
    <title>Личный кабинет</title>
    <link rel="stylesheet" href="css/A.main_style.css.pagespeed.cf.ckSp8gDoOX.css" type="text/css" charset="utf-8">
    <link rel="stylesheet" href="css/A.main_page_style.css.pagespeed.cf.42EpeVMWp4.css" type="text/css" charset="utf-8">
    <link rel="stylesheet" href="css/A.aside.css.pagespeed.cf.AcnkbKT635.css" type="text/css" charset="utf-8">
    <style charset="utf-8">
        #form_input {
            float: left;
            width: 100%;
            margin-top: 10px
        }

        #form_input>div {
            float: left
        }

        #form_input>div>input {
            border-radius: 50px;
            border: 1px solid #c4c4c4;
            font-size: .8em;
            padding: 10px 5%;
            margin-bottom: 10px;
            background-color: #fff
        }

        #form_input>div>input:focus,
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

        @media (min-width:600px) {
            #form_input>div {
                width: 50%
            }
            #form_input>div>input {
                width: 76%
            }
        }

        @media (max-width:599px) {
            #form_input>div {
                width: 100%
            }
            #form_input>div>input {
                width: 70%
            }
        }
    </style>
    <link rel="stylesheet" href="css/A.font-awesome.min.css.pagespeed.cf.YaV9IcR0kC.css">
    <style charset='utf-8'>
        #favourites {
            display: flex;
            flex-wrap: wrap
        }

        .one-course {
            margin-bottom: 20px
        }

        .one-course>a>img {
            float: left;
            outline: 1px solid #ddd;
            padding: 10px;
            background: #f0f0f0;
            box-sizing: padding-box;
            box-sizing: border-box
        }

        .one-course>div {
            float: left;
            border-radius: 5px;
            padding: 5px
        }

        .one-course>div>a>span,
        .one-course>div>span {
            margin-top: 10px;
            width: 50%;
            font-size: 1.1em;
            color: #313131
        }

        .one-course>div>span:last-of-type {
            color: #a9a9a9;
            font-weight: bold;
            float: left;
            margin-bottom: 10px
        }

        .one-course a>span:hover {
            color: #cc5d5d
        }

        .one-course>a>img:hover {
            outline: 1px solid #bd8383
        }

        @media (min-width:1250px) {
            .one-course>a>img {
                width: 40%;
                margin-right: 5%
            }
            .one-course>div {
                width: 50%;
                background-color: #fafafa;
                border: 1px solid silver
            }
        }

        @media (max-width:1249px) {
            .one-course>a>img {
                width: 100%;
                margin-bottom: 10px
            }
            .one-course>div {
                width: 100%
            }
        }

        @media (min-width:500px) {
            .one-course {
                flex-basis: 45%;
                margin-right: 5%
            }
        }

        @media (max-width:499px) {
            .one-course {
                flex-basis: 100%
            }
        }
    </style>
    <link rel='stylesheet' href='css/A.style_user.css.pagespeed.cf.-9vj6H_7Iz.css' type='text/css' charset='utf-8'>
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
                <a href="reg" title="Зарегистрироваться на сайте">
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
                <h2 class="heading">
                    Войти на сайт	</h2>
                <div style="clear: both">
                    <br>
                </div>
                <div class="block">
                    <p id="textHint">Чтобы войти на сайт используйте ваш email и пароль, которые были указаны при регистрации на сайте</p>
                    <form id="form_input">
                        <div>
                            <input type="email" id="email" placeholder="Email.." onclick="$(this).css ('border-color', '#ccc')">
                        </div>
                        <div>
                            <input type="password" id="password" placeholder="Ваш пароль" onclick="$(this).css ('border-color', '#ccc')">
                            <i class="fa fa-eye" style="cursor: pointer" onclick="showPass ('#password', '#eye')" id="eye" aria-hidden="true"></i>
                        </div>
                        <div id="mess"></div>
                        <div id="send" class="btn" style="float: right">Войти</div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</body>

</html>