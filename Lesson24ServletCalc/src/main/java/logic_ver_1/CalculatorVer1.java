package logic_ver_1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "calculator", value = "/calculator")
public class CalculatorVer1 extends HttpServlet {
    public static <T extends Number, K extends Number> double sum(T t, K k) {
        return t.doubleValue() + k.doubleValue();
    }

    public static <T extends Number, K extends Number> double multiply(T t, K k) {
        return t.doubleValue() * k.doubleValue();
    }

    public static <T extends Number, K extends Number> double divide(T t, K k) {
        return t.doubleValue() / k.doubleValue();
    }

    public static <T extends Number, K extends Number> double subtraction(T t, K k) {
        return t.doubleValue() - k.doubleValue();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter writer = response.getWriter()) {
            String numA = request.getParameter("a");
            String numB = request.getParameter("b");

            if (numA == null || numB == null) {
                writer.println("<h2>Введите в строку запроса цифры, где key это a и b, a value это десятичные значения \n" +
                        "в формате /calculator?a=0&b=0 или /calculator?a=0.0&b=0.0 </h2>");
            } else {
                double t = Double.parseDouble(numA);
                double k = Double.parseDouble(numB);
                double resultSum = sum(t, k);
                double resultSubtraction = subtraction(t, k);
                double resultMultiply = multiply(t, k);
                double resultDivide = divide(t, k);
                writer.println("<h2>Сумма чисел " + t + " и " + k + " равна " + resultSum + "</h2>");
                writer.println("<h2>Разность чисел " + t + " и " + k + " равна " + resultSubtraction + "</h2>");
                writer.println("<h2>Произведение чисел " + t + " и " + k + " равно " + resultMultiply + "</h2>");
                writer.println("<h2>Частное чисел " + t + " и " + k + " равно " + resultDivide + "</h2>");
            }
        }
    }
}

