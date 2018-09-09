<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="shortcut icon" href="image/favicon.png" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Расписание</title>
        <link rel="stylesheet" type="text/css" href="../css/style.css">
        <script src="../js/main.js" type="text/javascript"></script>
    </head>
    <body>
        <header>
            <span class="open" onclick="openNavbar()">&#9776; Menu</span>
            <div id="navbar" class="overlay">
		<a href="javascript:void(0);" onclick="closeNavbar()" class="close">&#9932;</a>
		<div class="overlay-content">
			<a href="../">Главная</a>
			<a href="/">Расписание</a>
			<a href="../zhournal">Журнал</a>
			<a onclick="aboutVersion()">О программе</a>
		</div>
            </div>
        </header>
        <div class="main_wrapper">
            <div class="rasp_header">
                <h2 align="center"><br>РАСПИСАНИЕ</h2>
            </div>
            <div class="category">
                <h3 style="text-align:center">Выберите категорию:</h3>
                <h3 style="text-align:left">
                    <input id="student" type="radio" name="kateg" />  СТУДЕНТ<br>
                    <br>
                    <input type="radio" name="kateg" id="prepod" />  ПРЕПОДАВАТЕЛЬ
                </h3>
            </div>
            <div id="facultet_div">
                <% %>
            </div>
            <div id="kafedra_spec_div">
                <% %>
            </div>
            <div id="prepod_gruppa_div">
                <% %>
            </div>
            <div id="raspisanie_div">
                <% %>
            </div>
        </div>
    </body>
</html>
