<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>userInfo</title>
    <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container-fluid">
    <div class="row-fluid">
        <div class="span12">
            <table class="table table-bordered">
                <thead>
                <tr>
                    <th>
                        用户id
                    </th>
                    <th>
                        用户名
                    </th>
                    <th>
                        用户密码
                    </th>
                    <th>
                        手机号
                    </th>
                    <th>
                        操作
                    </th>
                </tr>
                </thead>
                <tbody>
                <#list userModels as models>
                <tr <#if models_index%2==0>class="success"</#if>>
                    <td>${models.id}</td>
                    <td>
                    ${models.userName}
                    </td>
                    <td>
                    ${models.userPassword}
                    </td>
                    <td>
                    ${models.mobilephone}
                    </td>
                    <td><button class="btn" type="button" contenteditable="true" onclick="update('${models.id}')">更新</button></td>
                </tr>
                </#list>
                </tbody>
            </table>
        </div>
    </div>
</div>
<script type="text/javascript">
    function update(userId) {
        $.ajax({
            url:"/user/update",
            type:"GET",
            data:{userId:userId},
            success:function (data) {

            }
        });
    }
</script>
</body>
</html>