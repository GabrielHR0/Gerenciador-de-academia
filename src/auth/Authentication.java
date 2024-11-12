package auth;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import controller.UsuarioController;
import model.Usuario;

public class Authentication {
    
    private static Authentication instancia;
    private final String caminhoArquivo = "src/auth/usuarios.json";

    public AuthenticationController controller = AuthenticationController.getInstancia();
    public GerenciarSessao sessao = GerenciarSessao.getInstancia();

    private Authentication() {
    }

    public static Authentication getInstancia() {
        if (instancia == null) {
            instancia = new Authentication();
        }
        return instancia;
    }


    public void initRepository() {

        JSONParser parser = new JSONParser();
    

        try (FileReader reader = new FileReader(caminhoArquivo)) {
    

            JSONArray usuariosArray = (JSONArray) parser.parse(reader);
    

            for (Object obj : usuariosArray) {
                JSONObject usuarioJson = (JSONObject) obj;
    

                String email = (String) usuarioJson.get("email");
                String senha = (String) usuarioJson.get("senha");
    

                AuthenticationController.getInstancia().cadastrar(email, senha);
            }
    
            System.out.println("Repositório de usuários inicializado com sucesso.");
    
        } catch (IOException | ParseException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao carregar usuários do JSON: " + e.getMessage());
        }
    }
}
