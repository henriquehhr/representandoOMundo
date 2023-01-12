public class Exercicio {
  private String enunciado;
  private Resposta resposta;

  public Exercicio(String enunciado, Resposta resposta) {
    this.enunciado = enunciado;
    this.resposta = resposta;
  }

  public String getEnunciado() {
    return enunciado;
  }

  public void setEnunciado(String enunciado) {
    this.enunciado = enunciado;
  }

  public Resposta getResposta() {
    return resposta;
  }

  public void setResposta(Resposta resposta) {
    this.resposta = resposta;
  }

}