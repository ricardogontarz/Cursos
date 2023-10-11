//código do ator
let xAtor = 85;
let yAtor = 366;
let colisao = false;
let meusPontos = 0;

function mostraAtor(){
  image(imagemDoAtor, xAtor, yAtor, 30, 30);
}

function movimentaAtor(){
  if (keyIsDown(UP_ARROW) || keyIsDown(87)){
    yAtor -= 3;
  }
  if (keyIsDown(DOWN_ARROW) || keyIsDown(83)){
    yAtor += 3;
  }
}
function verificaColisao(){
  for(let i = 0; i < imagemCarros.length; i++){
    colisao = collideRectCircle(xCarros[i], yCarros[i], comprimentoCarro, alturaCarro, xAtor, yAtor, 15);
    if(colisao){
      voltaAtorParaPosicaoInicial();
      somDaColisao.play();
      if(meusPontos > 0){
        meusPontos--;
      }
    }
  }
}
function voltaAtorParaPosicaoInicial(){
  yAtor = 366;
}

function incluiPontos(){
  textAlign(CENTER);
  textSize(25);
  fill(color(255, 240, 60));
  text(meusPontos, width/5, 27);
}

function marcaPontos(){
  if(yAtor < 15){
    meusPontos++;
    somDoPonto.play();
    voltaAtorParaPosicaoInicial()
  }
    
}
