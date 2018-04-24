package com.github.danielpinto8zz6.ninecardsiege.logic.states;

/*
 * List of expected events when taking into account all the states.
 */
public interface IStates {
    IStates startGame();

    /* inicializar jogo todas as componetes
    no caso de se começar um jogo novo dar reset 
    aos valores*/
    //waitCardPlay
    IStates pickAnEventCard();

    /*pegar na informaçam da carta obtida 
    */
    IStates doEvent();

    /*
    executar o evente modificar as variaveis
    */
    IStates moveEnemies();

    /*
    mover enimigos na batlle board
    */
    //waitPlayerAtions
    IStates checkInstaLoss();

    /*
    verificar se o jogo acaba imediatamente
    */
    IStates checkPlayerAtion();

    /*
    existem certas ações bloqueantes o jogador tem que
    obrigatoriamente de fazer certas tarefas
    para se livrar de estados em que o jogo acabe
    */
    IStates playerAtion();

    /*
    executar as acçoes do player 
    ** talvez criar estados para isto***
    */
    //waitEndOfDay
    IStates endOfTheDay();

    /*modificar os dados necessariaos 
    */
    IStates endChek();
    /*verificar fim do jogo*/

    IStates quit();
    /*
    sair ou reiniciar o jogo
    */
}
