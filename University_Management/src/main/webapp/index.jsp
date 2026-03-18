<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>University Management System</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            min-height: 100vh;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
        }

        .container {
            background: white;
            padding: 40px;
            border-radius: 20px;
            box-shadow: 0 20px 40px rgba(0, 0, 0, 0.1);
            text-align: center;
            max-width: 500px;
            width: 90%;
        }

        h1 {
            color: #333;
            margin-bottom: 10px;
            font-size: 2.5em;
            font-weight: 300;
        }

        .subtitle {
            color: #666;
            margin-bottom: 40px;
            font-size: 1.1em;
        }

        .nav-menu {
            display: flex;
            flex-direction: column;
            gap: 15px;
        }

        .nav-button {
            display: inline-block;
            padding: 15px 30px;
            background: linear-gradient(45deg, #667eea, #764ba2);
            color: white;
            text-decoration: none;
            border-radius: 10px;
            font-size: 1.1em;
            font-weight: 500;
            transition: all 0.3s ease;
            box-shadow: 0 4px 15px rgba(102, 126, 234, 0.3);
        }

        .nav-button:hover {
            transform: translateY(-2px);
            box-shadow: 0 8px 25px rgba(102, 126, 234, 0.4);
            background: linear-gradient(45deg, #764ba2, #667eea);
        }

        .nav-button.add {
            background: linear-gradient(45deg, #28a745, #20c997);
            box-shadow: 0 4px 15px rgba(40, 167, 69, 0.3);
        }

        .nav-button.add:hover {
            background: linear-gradient(45deg, #20c997, #28a745);
            box-shadow: 0 8px 25px rgba(40, 167, 69, 0.4);
        }

        .nav-button.view {
            background: linear-gradient(45deg, #007bff, #0056b3);
            box-shadow: 0 4px 15px rgba(0, 123, 255, 0.3);
        }

        .nav-button.view:hover {
            background: linear-gradient(45deg, #0056b3, #007bff);
            box-shadow: 0 8px 25px rgba(0, 123, 255, 0.4);
        }

        .icon {
            margin-right: 8px;
        }

        @media (max-width: 600px) {
            .container {
                padding: 30px 20px;
            }

            h1 {
                font-size: 2em;
            }
        }
    </style>
</head>

<body>
    <div class="container">
        <h1>🎓 University Management System</h1>
        <p class="subtitle">Manage students efficiently and effectively</p>

        <div class="nav-menu">
            <a href="addStudent.jsp" class="nav-button add">
                <span class="icon">➕</span> Add New Student
            </a>
            <a href="viewStudents" class="nav-button view">
                <span class="icon">👥</span> View All Students
            </a>
        </div>
    </div>
</body>
</html>