public class RespostaDiscursiva implements Resposta {
  private String respostaCorreta;

  public RespostaDiscursiva(String respostaCorreta) {
    this.respostaCorreta = respostaCorreta;
  }

  public String getRespostaCorreta() {
    return respostaCorreta;
  }

  public void setRespostaCorreta(String respostaCorreta) {
    this.respostaCorreta = respostaCorreta;
  }
}
