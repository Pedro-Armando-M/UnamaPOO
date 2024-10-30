import java.util.List;

public class Tarefa{
    private String titulo;
    List<Etiqueta> etiquetas;
    
    
    public Tarefa(String Titulo){
        this.titulo = titulo;
        this.etiquetas= new ArreyList<>();
    } 
    
    public void adicionarEtiqueta(String[] args) {
        this.etiquetas.add(Etiqueta);
    }
}