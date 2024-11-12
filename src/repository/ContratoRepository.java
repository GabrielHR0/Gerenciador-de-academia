package repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Contrato;


public class ContratoRepository{

    private static ContratoRepository instancia;

    private Map<Integer, Contrato> contratos = new HashMap<>();
    private Integer contratoid = 1;

    private ContratoRepository() {
        
    }

    public static ContratoRepository getInstancia(){
        
        if (instancia == null){
            instancia = new ContratoRepository();
        }
        return instancia;

    }

    public Contrato salvar(Contrato novoContrato){

        novoContrato.setId(this.contratoid++);
        contratos.put(this.contratoid, novoContrato);
        return novoContrato;

    }

    public Contrato buscarUsuarioPorId(Integer id) {
            
        return contratos.get(id);

    }

    public Boolean existe(Integer id){
        return contratos.get(id) != null;
    }

    public List<Contrato> buscarTodosUsuarios() {

        return new ArrayList<>(contratos.values());

    }




}