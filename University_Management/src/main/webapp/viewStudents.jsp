<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*,model.Student" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View Students - University Management</title>
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
            max-width: 1200px;
            margin: 0 auto;
            background: white;
            border-radius: 20px;
            box-shadow: 0 20px 40px rgba(0, 0, 0, 0.1);
            overflow: hidden;
        }

        .header {
            background: linear-gradient(45deg, #007bff, #0056b3);
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
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        .nav-links {
            display: flex;
            gap: 20px;
        }

        .nav a {
            color: #007bff;
            text-decoration: none;
            font-weight: 500;
            transition: color 0.3s ease;
        }

        .nav a:hover {
            color: #0056b3;
        }

        .stats {
            display: flex;
            gap: 20px;
            align-items: center;
        }

        .stat-badge {
            background: #28a745;
            color: white;
            padding: 5px 15px;
            border-radius: 20px;
            font-size: 0.9em;
            font-weight: 500;
        }

        .table-container {
            padding: 30px;
            overflow-x: auto;
        }

        .students-table {
            width: 100%;
            border-collapse: collapse;
            background: white;
            border-radius: 10px;
            overflow: hidden;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.05);
        }

        .students-table thead {
            background: linear-gradient(45deg, #007bff, #0056b3);
            color: white;
        }

        .students-table th {
            padding: 15px;
            text-align: left;
            font-weight: 500;
            font-size: 0.95em;
            text-transform: uppercase;
            letter-spacing: 0.5px;
        }

        .students-table tbody tr {
            border-bottom: 1px solid #e9ecef;
            transition: all 0.3s ease;
        }

        .students-table tbody tr:hover {
            background: #f8f9fa;
            transform: scale(1.01);
        }

        .students-table td {
            padding: 15px;
            color: #333;
            font-size: 0.95em;
        }

        .student-id {
            font-weight: 600;
            color: #007bff;
        }

        .student-name {
            font-weight: 500;
            color: #333;
        }

        .student-age {
            background: #e3f2fd;
            color: #1976d2;
            padding: 4px 8px;
            border-radius: 12px;
            font-size: 0.85em;
            font-weight: 500;
        }

        .student-city {
            display: flex;
            align-items: center;
            gap: 5px;
        }

        .city-icon::before {
            content: '📍';
        }

        .action-buttons {
            display: flex;
            gap: 8px;
        }

        .btn {
            padding: 6px 12px;
            border: none;
            border-radius: 6px;
            font-size: 0.85em;
            font-weight: 500;
            cursor: pointer;
            transition: all 0.3s ease;
            text-decoration: none;
            display: inline-flex;
            align-items: center;
            justify-content: center;
        }

        .btn-edit {
            background: linear-gradient(45deg, #ffc107, #ff9800);
            color: white;
            box-shadow: 0 2px 8px rgba(255, 193, 7, 0.3);
        }

        .btn-edit:hover {
            transform: translateY(-1px);
            box-shadow: 0 4px 12px rgba(255, 193, 7, 0.4);
        }

        .btn-delete {
            background: linear-gradient(45deg, #dc3545, #c82333);
            color: white;
            box-shadow: 0 2px 8px rgba(220, 53, 69, 0.3);
        }

        .btn-delete:hover {
            transform: translateY(-1px);
            box-shadow: 0 4px 12px rgba(220, 53, 69, 0.4);
        }

        .empty-state {
            text-align: center;
            padding: 60px 20px;
            color: #666;
        }

        .empty-state h3 {
            font-size: 1.5em;
            margin-bottom: 15px;
            color: #999;
        }

        .empty-state p {
            font-size: 1.1em;
            margin-bottom: 20px;
        }

        .btn-add {
            background: linear-gradient(45deg, #28a745, #20c997);
            color: white;
            padding: 10px 20px;
            box-shadow: 0 4px 15px rgba(40, 167, 69, 0.3);
        }

        .btn-add:hover {
            transform: translateY(-2px);
            box-shadow: 0 8px 25px rgba(40, 167, 69, 0.4);
        }

        @media (max-width: 768px) {
            .container {
                margin: 10px;
                border-radius: 15px;
            }

            .header {
                padding: 20px;
            }

            .nav {
                flex-direction: column;
                gap: 15px;
                padding: 20px;
            }

            .table-container {
                padding: 20px;
            }

            .students-table {
                font-size: 0.85em;
            }

            .students-table th,
            .students-table td {
                padding: 10px 5px;
            }

            .action-buttons {
                flex-direction: column;
                gap: 5px;
            }
        }
    </style>
</head>

<body>
    <div class="container">
        <div class="header">
            <h1>👥 All Students</h1>
            <p>View and manage student records</p>
        </div>

        <div class="nav">
            <div class="nav-links">
                <a href="index.jsp">🏠 Home</a>
                <a href="addStudent.jsp">➕ Add Student</a>
            </div>
            <div class="stats">
                <span class="stat-badge">
                    Total Students: <%= ((List<Student>)request.getAttribute("students")).size() %>
                </span>
            </div>
        </div>

        <div class="table-container">
            <%
                List<Student> list = (List<Student>)request.getAttribute("students");

                if (list != null && !list.isEmpty()) {
            %>

            <table class="students-table">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Age</th>
                        <th>City</th>
                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        for(Student s : list) {
                    %>
                    <tr>
                        <td class="student-id">#<%= s.getId() %></td>
                        <td class="student-name"><%= s.getName() %></td>
                        <td><span class="student-age"><%= s.getAge() %> years</span></td>
                        <td class="student-city">
                            <span class="city-icon"></span>
                            <%= s.getAddress() != null ? s.getAddress().getCity() : "N/A" %>
                        </td>
                        <td>
                            <div class="action-buttons">
                                <a href="editStudent?id=<%=s.getId()%>" class="btn btn-edit">
                                    ✏️ Edit
                                </a>
                                <a href="deleteStudent?id=<%=s.getId()%>" class="btn btn-delete"
                                   onclick="return confirm('Are you sure you want to delete this student?')">
                                    🗑️ Delete
                                </a>
                            </div>
                        </td>
                    </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>

            <%
                } else {
            %>

            <div class="empty-state">
                <h3>📚 No Students Found</h3>
                <p>There are no students registered in the system yet.</p>
                <a href="addStudent.jsp" class="btn btn-add">
                    ➕ Add First Student
                </a>
            </div>

            <%
                }
            %>
        </div>
    </div>
</body>
</html>