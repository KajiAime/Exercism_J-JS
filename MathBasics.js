/*
*In JavaScript, we have the Math global object which holds a large number of Math functions, especially scientific.
*/
function round(number){
//Function to round positive decimal numbers.
  if(number - Math.floor(number) < 0.5){
    console.log("We have to round down.");
    number = Math.floor(number);
  }
  else{
    console.log("We have to round up.");
    number = Math.ceil(number);
  }
}
