"use strict";

var Scenario = function(){

  var _id;
  var _ball;
  var _player1;
  var _player2;

  this.setId = function(id){
    _id = id;
  };

  this.getId = function(){
    return _id;
  };

  this.setBall = function(ball){
    _ball = ball;
  };

  this.getBall = function(){
    return _ball;
  };

  this.setPlayer1 = function(player1){
    _player1 = player1;
  };

  this.getPlayer1 = function(){
    return _player1;
  };

  this.setPlayer2 = function(player2){
    _player2 = player2;
  };

  this.getPlayer2 = function(){
    return _player2;
  };

  this.run = function(){
    // TODO
  };

}

module.exports = Scenario;
