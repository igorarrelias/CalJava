import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@javax.servlet.annotation.WebServlet("/calcular")
public class calcular extends javax.servlet.http.HttpServlet {
    float resultado;

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        request.getRequestDispatcher("index.jsp");
        String op=request.getParameter("op");
        String v11=request.getParameter("n1");
        String v22 = request.getParameter("n2");
        float v1 = Float.parseFloat(v11);
        float v2 = Float.parseFloat(v22);

        if (op!=null){
            switch (op){
                case "soma":
                    request.setAttribute("result" , soma(v1,v2));
                    break;
                case "sub":
                    request.setAttribute("result" , subtracao(v1,v2));
                    break;
                case "mult":
                    request.setAttribute("result" , multiplicacao(v1, v2));
                    break;
                case "div":
                    request.setAttribute("result" , divisao(v1,v2));
                    break;
            }
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        request.getRequestDispatcher("index.jsp");
    }

    private float soma(float v1, float v2){
        resultado = v1 + v2;
        return resultado;
    }
    private float subtracao(float v1, float v2){
        resultado = v1 - v2;
        return resultado;
    }
    private float multiplicacao(float v1, float v2){
        resultado = v1 * v2;
        return resultado;
    }
    private float divisao(float v1, float v2){
        resultado = v1 / v2;
        return Float.parseFloat(String.valueOf(resultado));
    }
}
