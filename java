function executarExercicios() {

  // 1 — Entrada em uma festa
  let idade1 = 20;
  console.log("1) Pode entrar na festa:", idade1 >= 18);

  // 2 — Compra em uma loja
  let camiseta = 50;
  let calca = 120;
  let tenis = 200;
  let totalCompra = camiseta + calca + tenis;
  console.log("2) Total da compra:", totalCompra);

  // 3 — Média de um aluno
  let nota1 = 7;
  let nota2 = 9;
  let media = (nota1 + nota2) / 2;
  console.log("3) Média do aluno:", media);

  // 4 — Verificação de idade para dirigir
  let idade2 = 18;
  console.log("4) Pode dirigir:", idade2 >= 18);

  // 5 — Divisão da conta
  let totalConta = 150;
  let pessoas = 3;
  let valorPorPessoa = totalConta / pessoas;
  console.log("5) Cada um paga:", valorPorPessoa);

  // 6 — Verificação de número par
  let numero = 10;
  console.log("6) Resto da divisão por 2:", numero % 2);

  // 7 — Desconto em uma loja
  let preco = 120;
  let desconto = 20;
  let valorFinal = preco - desconto;
  console.log("7) Valor final:", valorFinal);

  // 8 — Sistema de acesso ao cinema
  let idade3 = 10;
  console.log("8) Entrada gratuita:", idade3 < 12);

  // 9 — Comparação de preços
  let loja1 = 1800;
  let loja2 = 2000;
  console.log("9) Loja1 é mais barata:", loja1 < loja2);

  // 10 — Entrada em um evento estudantil
  let idade4 = 17;
  let estudante = false;
  console.log("10) Pode entrar no evento:", estudante || idade4 < 18);
}
