# Maven-Docker_Trainee


1.  Установить Docker. 

Создать образ на основе одного из базовых Linux-образов, доступных на DockerHub. Установить Java 8, Apache Maven, добавить проект из Задания по ООП, собрать и запустить приложение.

2.	Создать Maven-проект. 

Проект должен содержать модули:

1) Модуль плагина. 

Плагин должен содержать логику отправки электронной почты. Логин, пароль, электронный адрес, тема и текст письма должны передаваться как параметры. Текст должен кратко сообщать о том, что сборка проекта успешно завершилась. Перед отправкой письма, а также по окончанию отправки вывести в консоль предупредительные сообщения.

2) Модуль приложения.

Базовым должно быть приложение, разработанное для Задания по ООП.

Maven-конфигурация должна содержать два профил: dev и prd;

dev:

Выполнение сборки в обычном режиме. Плагин из пункта 1 должен вызываться на фазе install. Вызов Runner-класса должен осуществляться через соответствующий плагин.

prd:

Процесс сборки должен ингрорировать Unit тестирование.

Добавить плагин сборки Docker-образа и подключить его после фазы package. Плагин должен собрать образ с установленным на него приложением, запустить контейнер. Остановка контейнера должна производиться перед фазой deploy. Запускать Runner-класс в контейнере – по желанию.

Для обоих профилей на фазе compile вывести в консоль активный профиль.

Плагин из пункта 1 должен вызываться фазы deploy.


В проект перед отправкой в репозиторий должен быть также включен Dockerfile, включать сам Docker и его образы не нужно! 