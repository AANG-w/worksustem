<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>作品管理系统</title>
    <style>
        .login-btn {
            display: inline-block;
            padding: 12px 30px;
            background: linear-gradient(135deg, #6e8efb, #a777e3);
            color: white;
            text-decoration: none;
            border-radius: 30px;
            font-weight: bold;
            font-size: 16px;
            box-shadow: 0 4px 15px rgba(0, 0, 0, 0.1);
            transition: all 0.3s ease;
            border: none;
            cursor: pointer;
        }

        .login-btn:hover {
            transform: translateY(-3px);
            box-shadow: 0 6px 20px rgba(0, 0, 0, 0.15);
            background: linear-gradient(135deg, #a777e3, #6e8efb);
        }
    </style>
</head>
<body style="display: flex; justify-content: center; align-items: center; height: 100vh; margin: 0; background-color: #f5f7fa;">
<a href="to_login" class="login-btn">登录系统</a>
</body>
</html>