<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Student - University Management</title>
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
            padding: 20px;
        }

        .container {
            max-width: 800px;
            margin: 0 auto;
            background: white;
            border-radius: 20px;
            box-shadow: 0 20px 40px rgba(0, 0, 0, 0.1);
            overflow: hidden;
        }

        .header {
            background: linear-gradient(45deg, #28a745, #20c997);
            color: white;
            padding: 30px;
            text-align: center;
        }

        .header h1 {
            font-size: 2.2em;
            font-weight: 300;
            margin-bottom: 10px;
        }

        .header p {
            opacity: 0.9;
            font-size: 1.1em;
        }

        .nav {
            background: #f8f9fa;
            padding: 15px 30px;
            border-bottom: 1px solid #e9ecef;
        }

        .nav a {
            color: #007bff;
            text-decoration: none;
            margin-right: 20px;
            font-weight: 500;
            transition: color 0.3s ease;
        }

        .nav a:hover {
            color: #0056b3;
        }

        .form-container {
            padding: 40px;
        }

        .form-section {
            margin-bottom: 30px;
        }

        .form-section h3 {
            color: #333;
            margin-bottom: 20px;
            font-size: 1.3em;
            display: flex;
            align-items: center;
        }

        .form-section h3::before {
            content: '';
            width: 4px;
            height: 20px;
            background: linear-gradient(45deg, #28a745, #20c997);
            margin-right: 10px;
            border-radius: 2px;
        }

        .form-row {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
            gap: 20px;
            margin-bottom: 20px;
        }

        .form-group {
            display: flex;
            flex-direction: column;
        }

        .form-group label {
            color: #555;
            font-weight: 500;
            margin-bottom: 8px;
            font-size: 0.95em;
        }

        .form-group input {
            padding: 12px 15px;
            border: 2px solid #e1e5e9;
            border-radius: 8px;
            font-size: 1em;
            transition: all 0.3s ease;
            background: #fafbfc;
        }

        .form-group input:focus {
            outline: none;
            border-color: #28a745;
            background: white;
            box-shadow: 0 0 0 3px rgba(40, 167, 69, 0.1);
        }

        .form-group input:required {
            border-left: 3px solid #28a745;
        }

        .button-container {
            display: flex;
            gap: 15px;
            justify-content: center;
            margin-top: 30px;
        }

        .btn {
            padding: 12px 30px;
            border: none;
            border-radius: 8px;
            font-size: 1em;
            font-weight: 500;
            cursor: pointer;
            transition: all 0.3s ease;
            text-decoration: none;
            display: inline-flex;
            align-items: center;
            justify-content: center;
        }

        .btn-primary {
            background: linear-gradient(45deg, #28a745, #20c997);
            color: white;
            box-shadow: 0 4px 15px rgba(40, 167, 69, 0.3);
        }

        .btn-primary:hover {
            transform: translateY(-2px);
            box-shadow: 0 8px 25px rgba(40, 167, 69, 0.4);
        }

        .btn-secondary {
            background: #6c757d;
            color: white;
            box-shadow: 0 4px 15px rgba(108, 117, 125, 0.3);
        }

        .btn-secondary:hover {
            background: #5a6268;
            transform: translateY(-2px);
        }

        .icon {
            margin-right: 8px;
        }

        @media (max-width: 768px) {
            .form-container {
                padding: 20px;
            }

            .header {
                padding: 20px;
            }

            .form-row {
                grid-template-columns: 1fr;
            }
        }
    </style>
</head>

<body>
    <div class="container">
        <div class="header">
            <h1>📝 Add New Student</h1>
            <p>Enter student information to register in the system</p>
        </div>

        <div class="nav">
            <a href="index.jsp">🏠 Home</a>
            <a href="viewStudents">👥 View Students</a>
        </div>

        <div class="form-container">
            <form action="addStudent" method="post">
                <div class="form-section">
                    <h3>Student Information</h3>
                    <div class="form-row">
                        <div class="form-group">
                            <label for="name">Full Name *</label>
                            <input type="text" id="name" name="name" required placeholder="Enter student's full name"/>
                        </div>
                        <div class="form-group">
                            <label for="age">Age *</label>
                            <input type="number" id="age" name="age" required min="16" max="100" placeholder="Enter age"/>
                        </div>
                    </div>
                </div>

                <div class="form-section">
                    <h3>Address Information</h3>
                    <div class="form-row">
                        <div class="form-group">
                            <label for="city">City *</label>
                            <input type="text" id="city" name="city" required placeholder="Enter city name"/>
                        </div>
                        <div class="form-group">
                            <label for="state">State *</label>
                            <input type="text" id="state" name="state" required placeholder="Enter state name"/>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="form-group">
                            <label for="pincode">Pincode *</label>
                            <input type="text" id="pincode" name="pincode" required placeholder="Enter pincode" pattern="[0-9]{6}" maxlength="6"/>
                        </div>
                    </div>
                </div>

                <div class="button-container">
                    <button type="submit" class="btn btn-primary">
                        <span class="icon">✅</span> Add Student
                    </button>
                    <a href="index.jsp" class="btn btn-secondary">
                        <span class="icon">❌</span> Cancel
                    </a>
                </div>
            </form>
        </div>
    </div>
</body>
</html>