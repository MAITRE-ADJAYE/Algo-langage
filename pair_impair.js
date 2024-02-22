let nombre, reste;
const readline = require('readline');

// Créer une interface de lecture pour lire depuis le clavier
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

// Poser une question à l'utilisateur
rl.question('Veuillez saisir un nombre : ', (answer) => {
  nombre= answer;
  reste = nombre%2;
  if (reste ==0){
    console.log("le nombre "+nombre+" est pair"); 
  }else{
    console.log("le nombre "+nombre+" est impair");
  }
  rl.close();
}); 

