<html>
    <head>
        <meta charset="UTF-8">
    </head>
    <body>
        hello:${name}
        <#-- 取值 获取数字类型的value-->
        <br>
        ${age}<br>
        ${age?string}
        ${age?string.currency}
        ${age?string.percent}<br>
        <#--取值  获取日期类型的value-->
        ${birthday?date}<br>
        ${birthday?time}<br>
        ${birthday?datetime}<br>
        ${birthday?string("yyyy年MM月dd日")}<br>
    <#--取值 获取布尔类型的取值 -->
        ${boolean?c}
        ${boolean?string('yes', 'no')}
        <br>
        <#list fruit as li>
            ${li}
        </#list>
        <br>
        <#list map?keys as city>
            ${city}-->${map[city]}<br>
        </#list>

    </body>
</html>