/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raspisanie;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
public class RaspisanieIndex extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("</html>\n" +
                    "<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "    <head>\n" +
                    "        <link rel=\"shortcut icon\" href=\"image/favicon.png\" />\n" +
                    "        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
                    "        <title>Расписание</title>\n" +
                    "        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/style.css\">\n" +
                    "        <script src=\"../js/main.js\" type=\"text/javascript\"></script>\n" +
                    "    </head>\n" +
                    "    <body>\n" +
                    "        <header>\n" +
                    "            <span class=\"open\" onclick=\"openNavbar()\">&#9776; Menu</span>\n" +
                    "            <div id=\"navbar\" class=\"overlay\">\n" +
                    "		<a href=\"javascript:void(0);\" onclick=\"closeNavbar()\" class=\"close\">&#9932;</a>\n" +
                    "		<div class=\"overlay-content\">\n" +
                    "			<a href=\"../\">Главная</a>\n" +
                    "			<a href=\"/\">Расписание</a>\n" +
                    "			<a href=\"../zhournal\">Журнал</a>\n" +
                    "			<a onclick=\"aboutVersion()\">О программе</a>\n" +
                    "		</div>\n" +
                    "            </div>\n" +
                    "        </header>\n" +
                    "        <div class=\"main_wrapper\">\n" +
                    "            <div class=\"rasp_header\">\n" +
                    "                <h2 align=\"center\"><br>РАСПИСАНИЕ</h2>\n" +
                    "            </div>\n" +
                    "            <div class=\"category\">\n" +
                    "                <h3 style=\"text-align:center\">Выберите категорию:</h3>\n" +
                    "                <h3 style=\"text-align:left\">\n" +
                    "                    <input id=\"student\" type=\"radio\" name=\"kateg\" />  СТУДЕНТ<br>\n" +
                    "                    <br>\n" +
                    "                    <input type=\"radio\" name=\"kateg\" id=\"prepod\" />  ПРЕПОДАВАТЕЛЬ\n" +
                    "                </h3>\n" +
                    "            </div>\n" +
                    "            <div id=\"facultet_div\">\n" + Faculty.class +
                    "            </div>\n" +
                    "            <div id=\"kafedra_spec_div\">\n" + Kafedra.class +
                    "            </div>\n" +
                    "            <div id=\"prepod_gruppa_div\">\n" + Prepod.class +
                    "            </div>\n" +
                    "            <div id=\"raspisanie_div\">\n" + Lesson.class +
                    "            </div>\n" +
                    "        </div>\n" +
                    "    </body>\n");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
