package servlet;

import dao.StudentDAO;
import dao.StudentUtil;
import model.Address;
import model.Student;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns={
        "/addStudent","/viewStudents","/updateStudent","/editStudent"})

public class StudentServlet extends HttpServlet {

    StudentDAO dao = new StudentDAO();

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        String action = req.getServletPath();

        if (action.equals("/addStudent")) {
            String name = req.getParameter("name");
            int age = Integer.parseInt(req.getParameter("age"));

            String city = req.getParameter("city");
            String state = req.getParameter("state");
            String pincode = req.getParameter("pincode");

            Address address = new Address();
            address.setCity(city);
            address.setState(state);
            address.setPincode(pincode);

            Student s = new Student();
            s.setName(name);
            s.setAge(age);
            s.setAddress(address);

            dao.saveStudent(s);
            res.sendRedirect("viewStudents");
        }
        else if (action.equals("/updateStudent")) {
            int id = Integer.parseInt(req.getParameter("id"));
            String name = req.getParameter("name");
            int age = Integer.parseInt(req.getParameter("age"));

            String city = req.getParameter("city");
            String state = req.getParameter("state");
            String pincode = req.getParameter("pincode");

            Student s = StudentUtil.getStudentById(id);
            s.setName(name);
            s.setAge(age);

            Address address = s.getAddress();
            if (address == null) {
                address = new Address();
                s.setAddress(address);
            }
            address.setCity(city);
            address.setState(state);
            address.setPincode(pincode);

            dao.updateStudent(s);
            res.sendRedirect("viewStudents");
        }
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        String action = req.getServletPath();

        if (action.equals("/viewStudents")) {
            List<Student> list = dao.getAllStudents();
            req.setAttribute("students", list);
            RequestDispatcher rd = req.getRequestDispatcher("viewStudent.jsp");
            rd.forward(req, res);
        }
        else if (action.equals("/editStudent")) {
            int id = Integer.parseInt(req.getParameter("id"));
            Student student = StudentUtil.getStudentById(id);
            req.setAttribute("student", student);
            RequestDispatcher rd = req.getRequestDispatcher("editStudent.jsp");
            rd.forward(req, res);
        }
        else if (action.equals("/deleteStudent")) {
            int id = Integer.parseInt(req.getParameter("id"));
            Student student = StudentUtil.getStudentById(id);
            dao.deleteStudent(student);
            res.sendRedirect("viewStudents");
        }
    }
}