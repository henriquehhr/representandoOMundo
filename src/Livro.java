import java.util.Date;
import java.util.List;

public class Livro {
  private String nome;
  private int edicao;
  private Date dataPublicacao;
  private List<Exercicio> exercicios;

  public Livro(String nome, int edicao, Date dataPublicacao, List<Exercicio> exercicios) {
    this.nome = nome;
    this.edicao = edicao;
    this.dataPublicacao = dataPublicacao;
    this.exercicios = exercicios;
  }

  public String getNome() {
    return nome;
  }

  public int getEdicao() {
    return edicao;
  }

  public Date getDataPublicacao() {
    return dataPublicacao;
  }

  public List<Exercicio> getExercicios() {
    return exercicios;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setEdicao(int edicao) {
    this.edicao = edicao;
  }

  public void setDataPublicacao(Date dataPublicacao) {
    this.dataPublicacao = dataPublicacao;
  }

  public void setExercicios(List<Exercicio> exercicios) {
    this.exercicios = exercicios;
  }

}
