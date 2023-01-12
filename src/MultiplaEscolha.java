import java.util.List;

public class MultiplaEscolha implements Resposta {
  private List<String> respostas;
  private int respostaCorreta;

  public MultiplaEscolha(List<String> respostas, int respostaCorreta) {
    this.respostas = respostas;
    this.respostaCorreta = respostaCorreta;
  }

  public List<String> getRespostas() {
    return respostas;
  }

  public void setRespostas(List<String> respostas) {
    this.respostas = respostas;
  }

  public int getRespostaCorreta() {
    return respostaCorreta;
  }

  public void setRespostaCorreta(int respostaCorreta) {
    this.respostaCorreta = respostaCorreta;
  }
}
